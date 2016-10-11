//package org.gradle.forYoink.yoinkClasses;
//
//import java.util.Map;
//
//import javax.annotation.Resource;
//
//import org.gradle.interfaces.JobForYoink;
//import org.gradle.interfaces.domain.MolecularSystem;
//import org.wallerlab.yoink.api.model.regionizer.Region;
//import org.wallerlab.yoink.api.service.bootstrap.Clustering;
//import org.wallerlab.yoink.api.service.regionizer.RegionizerMath;
//import org.wallerlab.yoink.service.clustering.InteractionSet;
//
//public class MSInteractionSetProcessor implements MSAdaptiveProcessor{
//
//	@Resource
//	jobBuilderFromMS builder;
//
//	@Resource
//	private InteractionSet interactionSet;
//
//	@Resource
//	protected RegionizerMath<Map<Region.Name, Region>, MolecularSystem> regionizerServiceStarting;
//
//	@Override
//	public JobForYoink process(MolecularSystem MS, String fileName) {
//		JobForYoink job = builder.buildFromMS(MS, fileName);
//		regionizerServiceStarting.regionize(job.getRegions(), job.getMolecularSystem());
//		interactionSet.getDoriInteractionSet(job);
//		return job;
//	}
//
//}
