package org.forYoink.yoinkClasses;

import javax.annotation.Resource;
import javax.xml.bind.JAXBElement;

import org.forYoink.service.reader.PdbmlFileReader;
import org.wallerlab.yoink.api.model.bootstrap.Job;
import org.wallerlab.yoink.api.model.molecular.MolecularSystem;
import org.wallerlab.yoink.api.service.molecular.FilesReader;
import org.wallerlab.yoink.domain.AdaptiveQMMMJob;
import org.wallerlab.yoink.service.jobbuilder.AbstractJobBuilder;
import org.xml_cml.schema.Cml;

//@Service
public class JobBuilderFromMS extends AbstractJobBuilder<String,JAXBElement> implements MSJobBuilder {

	public MolecularSystem ms;

	public JobBuilderFromMS() {
	}

	@Override
	public Job<JAXBElement> build(String s) {
		return null;
	}

	public JobBuilderFromMS(MolecularSystem ms) {
		super();
		this.ms = ms;
	}

	@Resource 	//Use a string, not a file
	private FilesReader<Object, String> jaxbStringReader;

    private PdbmlFileReader reader;

	@Override
	public Job buildFromMS(MolecularSystem MS, String fileName) {
        Job<JAXBElement> job = new AdaptiveQMMMJob();
		JAXBElement<Cml> cmlElement = (JAXBElement<Cml>) jaxbStringReader.read(
				fileName, new Cml());
		job.setInput(cmlElement);
		job.setMolecularSystem(MS);
//		Map<JobParameter, Object> parameters = parameterTranslator.translate(cmlElement);
		return job;
	}


}
