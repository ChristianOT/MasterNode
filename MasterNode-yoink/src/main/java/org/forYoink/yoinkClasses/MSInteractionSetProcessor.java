package org.forYoink.yoinkClasses;

import java.util.Map;

import javax.annotation.Resource;

import org.wallerlab.yoink.api.model.bootstrap.Job;
import org.wallerlab.yoink.api.model.molecular.MolecularSystem;
import org.wallerlab.yoink.api.model.regionizer.Region;
import org.wallerlab.yoink.api.service.regionizer.RegionizerMath;
import org.wallerlab.yoink.service.clustering.InteractionSet;

public class MSInteractionSetProcessor implements MSAdaptiveProcessor{

	@Resource
	JobBuilderFromMS builder;

	@Resource
	private InteractionSet interactionSet;

	@Resource
	protected RegionizerMath<Map<Region.Name, Region>, MolecularSystem> regionizerServiceStarting;

	@Override
	public Job process(MolecularSystem MS, String fileName) {
		Job job = builder.buildFromMS(MS, fileName);
		regionizerServiceStarting.regionize(job.getRegions(), job.getMolecularSystem());
		interactionSet.getDoriInteractionSet(job);
		return job;
	}

}
