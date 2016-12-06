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

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.forYoink.api.model.bootstrap.Job;
import org.forYoink.api.model.molecular.MolecularSystem;
import org.forYoink.api.model.regionizer.Region;
import org.forYoink.api.service.bootstrap.JobBuilder;
import org.forYoink.api.service.regionizer.RegionizerMath;
import org.forYoink.bootstrap.clustering.InteractionList;

import javax.annotation.Resource;
import javax.xml.bind.JAXBElement;
import java.util.Map;


/**
 * This class is to set up and get all interaction pairs.
 * 
 * @author Min Zheng
 *
 */
@Service
public class FileInteractionSetProcessor implements ItemProcessor<String, Job> {

	@Autowired
	@Qualifier("jobFileBuilderImpl")
	private JobBuilder<String,JAXBElement> jobFileBuilderImpl;

	@Resource
	private InteractionList interactionList;

	@Resource
	protected RegionizerMath<Map<Region.Name, Region>, MolecularSystem> regionizerServiceStarting;

	protected static final Log log = LogFactory.getLog(org.forYoink.bootstrap.processor.FileInteractionSetProcessor.class);

	/**
	 * read in a list of requests and execute them.
	 *
	 * @param input
	 *            - a list of files
	 * @return jobs - a list of YoinkJob
	 *         {@link org.forYoink.api.model.bootstrap.Job}
	 */
	@Override
	public Job process(String input) throws Exception {
		return buildAndExecute(input);
	}

	protected Job buildAndExecute(String input) {
		Job job = jobFileBuilderImpl.build(input);
		regionizerServiceStarting.regionize(job.getRegions(), job.getMolecularSystem());
		interactionList.getDoriInteractionSet(job);
		return job;
	}


}
