package org.forYoink.bootstrap.processor;

import org.forYoink.bootstrap.clustering.InteractionList;
import org.forYoink.bootstrap.jobBuilder.JobMsBuilderImpl;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Service;
import org.forYoink.api.model.bootstrap.Job;
import org.forYoink.api.model.molecular.MolecularSystem;
import org.forYoink.api.model.regionizer.Region;
import org.forYoink.api.service.regionizer.RegionizerMath;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class MSInteractionListProcessor implements ItemProcessor<List<Job>,List<Job>> {

	@Resource
	JobMsBuilderImpl jobMsBuilder;

	@Resource
	private InteractionList interactionList;

	@Resource
	protected RegionizerMath<Map<Region.Name, Region>, MolecularSystem> regionizerServiceStarting;

	@Override
	public List<Job> process(List<Job> jobs) {
		List<Job> finalJobs = new ArrayList<>();
		for(Job job : jobs) {
			Map<Region.Name, Region> regions = job.getRegions();
			job.getMolecularSystem().getMolecules().get(0).setName(Region.Name.QM_CORE_FIXED);
			regionizerServiceStarting.regionize(regions, job.getMolecularSystem());
			System.out.println("getting InteractionList");
			interactionList.getDoriInteractionSet(job);
			finalJobs.add(job);
		}
		return finalJobs;
	}

}
