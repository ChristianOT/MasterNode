/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.forYoink.bootstrap.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.forYoink.api.model.bootstrap.Job;
import org.forYoink.api.model.bootstrap.JobParameter;
import org.forYoink.api.model.molecular.MolecularSystem;
import org.forYoink.api.model.regionizer.Region;
import org.forYoink.api.model.regionizer.Region.Name;
import org.forYoink.api.service.adaptive.Smoothner;
import org.forYoink.api.service.bootstrap.Wrapper;
import org.forYoink.api.service.regionizer.Regionizer;
import org.forYoink.api.service.regionizer.RegionizerMath;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * This class is to set up and execute adaptive QM/MM partitioning.
 * 
 * @author Min Zheng
 * @param <I> input
 * @param <O> output
 *
 */
public abstract class AbstractAdaptiveQMMMProcessor<I, O> implements ItemProcessor<I,O> {
	
	@Resource
	protected RegionizerMath<Map<Region.Name, Region>, MolecularSystem> regionizerServiceStarting;

	@Resource
	protected RegionizerMath<Map<Region.Name, Region>, MolecularSystem> regionizerServiceEnding;

	@Resource
	protected Smoothner adaptiveQMMMSmoothnerRouter;

	@Resource
	protected Wrapper propertyWrapper;

	@Autowired
	protected List<Regionizer<Map<Name, Region>, Map<JobParameter, Object>>> adaptiveQMMMRegionizers;

	protected Job executeQMMMPartitioning(Job job) {
		regionize(job);
		smooth(job);
		wrapResult(job);
		return job;
	}

	protected void regionize(Job job) {
		Map<Region.Name, Region> regions = job.getRegions();
		regionizerServiceStarting.regionize(regions, job.getMolecularSystem());
		regions = adaptiveQMMMRegionizers(job, regions);
		regionizerServiceEnding.regionize(regions, job.getMolecularSystem());
	}


	
	private Map<Region.Name, Region> adaptiveQMMMRegionizers(Job job, Map<Region.Name, Region> regions) {
	
	
		for (Regionizer<Map<Region.Name, Region>, Map<JobParameter, Object>> regionizer : adaptiveQMMMRegionizers) {

			regions = (Map<Region.Name, Region>) regionizer.regionize(regions, job.getParameters());
		}
		return regions;
	}

	private void smooth(Job job) {
		adaptiveQMMMSmoothnerRouter.smooth(job);
	}

	private void wrapResult(Job job) {
		propertyWrapper.wrap(job);
	}

}
