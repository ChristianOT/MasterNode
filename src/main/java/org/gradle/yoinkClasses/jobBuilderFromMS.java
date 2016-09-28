package org.gradle.yoinkClasses;

import java.util.Map;

import javax.annotation.Resource;
import javax.xml.bind.JAXBElement;

import org.springframework.stereotype.Service;
import org.wallerlab.yoink.api.model.bootstrap.Job;
import org.wallerlab.yoink.api.model.bootstrap.JobParameter;
import org.wallerlab.yoink.api.model.molecular.MolecularSystem;
import org.wallerlab.yoink.api.service.molecular.FilesReader;
import org.wallerlab.yoink.api.service.molecular.Translator;
import org.wallerlab.yoink.domain.AdaptiveQMMMJob;
import org.xml_cml.schema.Cml;

@Service
public class jobBuilderFromMS implements MSJobBuilder {

	public MolecularSystem ms;

	public jobBuilderFromMS(MolecularSystem ms) {
		super();
		this.ms = ms;
	}

	@Resource
	protected Translator<Map<JobParameter, Object>, JAXBElement<Cml>> parameterTranslator;
	
	@Resource 	//Use a string, not a file
	private FilesReader<Object, String> jaxbStringReader;

	@Override
	public Job buildFromMS(MolecularSystem MS, String fileName) {
		Job<JAXBElement> job = new AdaptiveQMMMJob();
		JAXBElement<Cml> cmlElement = (JAXBElement<Cml>) jaxbStringReader.read(
				fileName, new Cml());
		job.setInput(cmlElement);
		job.setMolecularSystem(MS);
		Map<JobParameter, Object> parameters = parameterTranslator.translate(cmlElement);
		return job;
	}
	
}
