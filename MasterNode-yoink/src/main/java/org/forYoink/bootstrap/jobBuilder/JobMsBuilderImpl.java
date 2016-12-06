package org.forYoink.bootstrap.jobBuilder;

import org.forYoink.bootstrap.AdaptiveQMMMJob;
import org.springframework.stereotype.Service;
import org.forYoink.api.model.bootstrap.Job;
import org.forYoink.api.model.molecular.MolecularSystem;
import org.forYoink.api.service.molecular.FilesReader;
import org.forYoink.bootstrap.jobBuilder.AbstractJobBuilder;
import org.xml_cml.schema.Cml;

import javax.annotation.Resource;
import javax.xml.bind.JAXBElement;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;

@Service
public class JobMsBuilderImpl extends AbstractJobBuilder<String, MolecularSystem> {

    @Resource
    private FilesReader<Object, String> jaxbFileReader;

    public List<Job> buildFromMS(List<MolecularSystem> MS, String parametersFileLocation) {
        List<Job> jobs = new ArrayList<>();
        for (MolecularSystem ms : MS) {
            Job<JAXBElement> job = new AdaptiveQMMMJob();
            job.setMolecularSystem(ms);
            job.setParameters(parameterTranslator.translate(
                    (JAXBElement<Cml>) jaxbFileReader.read(parametersFileLocation, new Cml())));
            jobs.add(job);
        }
        return jobs;
    }

    @Override
    public Job<MolecularSystem> build(String input) {
        return null;
    }
}
