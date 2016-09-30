/*
package org.gradle.yoinkClasses;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.wallerlab.yoink.api.model.bootstrap.Job;
import org.wallerlab.yoink.api.model.bootstrap.JobParameter;
import org.wallerlab.yoink.api.model.molecular.MolecularSystem;
import org.wallerlab.yoink.api.model.regionizer.Region;
import org.wallerlab.yoink.api.model.regionizer.Region.Name;
import org.wallerlab.yoink.api.service.adaptive.Smoothner;
import org.wallerlab.yoink.api.service.bootstrap.Wrapper;
import org.wallerlab.yoink.api.service.regionizer.Regionizer;
import org.wallerlab.yoink.api.service.regionizer.RegionizerMath;

public class MSAdaptiveQMMMProcessor implements MSAdaptiveProcessor{

	@Resource
	jobBuilderFromMS builder;
	
	@Resource
	protected RegionizerMath<Map<Region.Name, Region>, MolecularSystem> regionizerServiceStarting;

	@Resource
	protected RegionizerMath<Map<Region.Name, Region>, MolecularSystem> regionizerServiceEnding;

	@Autowired
	protected List<Regionizer<Map<Name, Region>, Map<JobParameter, Object>>> adaptiveQMMMRegionizers;

	@Override
	public Job process(MolecularSystem MS, String fileName) {
		Job job = builder.buildFromMS(MS, fileName);
		regionize(job);
		return job;
	}

	protected void regionize(Job job) {
		Map<Region.Name, Region> regions = job.getRegions();
		regionizerServiceStarting.regionize(regions, job.getMolecularSystem());
		regions = adaptiveQMMMRegionizers(job, regions);
		regionizerServiceEnding.regionize(regions, job.getMolecularSystem());
	}
	
	private Map<Region.Name, Region> adaptiveQMMMRegionizers(Job job, Map<Region.Name, Region> regions) {
		for (Regionizer<Map<Region.Name, Region>, 
				Map<JobParameter, Object>> regionizer : adaptiveQMMMRegionizers) {
			regions = (Map<Region.Name, Region>) regionizer.regionize(regions, job.getParameters());
		}
		return regions;
	}
}
*/
