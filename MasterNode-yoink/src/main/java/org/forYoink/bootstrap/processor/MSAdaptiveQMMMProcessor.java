package org.forYoink.bootstrap.processor;

import org.springframework.stereotype.Service;
import org.forYoink.api.model.bootstrap.Job;
import org.forYoink.api.model.regionizer.Region;
import org.forYoink.bootstrap.clustering.InteractionList;
import org.forYoink.bootstrap.processor.AbstractAdaptiveQMMMProcessor;

import javax.annotation.Resource;
import javax.xml.bind.JAXBElement;
import java.util.Map;

@Service
public class MSAdaptiveQMMMProcessor extends AbstractAdaptiveQMMMProcessor<Job<JAXBElement>, Job<JAXBElement>> {

    @Resource
    private InteractionList interactionSet;


    @Override
    public Job<JAXBElement> process(Job<JAXBElement> job) {
        regionize(job);
        System.out.println("done regionizing");
        return job;
    }

    @Override
    public void regionize(Job job) {
        Map<Region.Name, Region> regions = job.getRegions();
        job.getMolecularSystem().getMolecules().get(0).setName(Region.Name.QM_CORE_FIXED);
        regionizerServiceStarting.regionize(regions, job.getMolecularSystem());
        interactionSet.getDoriInteractionSet(job);
    }

}
