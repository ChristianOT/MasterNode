//package org.gradle.forYoink.yoinkClasses;
//
//import java.util.Map;
//
//import javax.annotation.Resource;
//import javax.xml.bind.JAXBElement;
//
//import org.gradle.interfaces.JobForYoink;
//import org.gradle.interfaces.domain.MolecularSystem;
//import org.gradle.interfaces.service.Translator;
//import org.gradle.pdbml.v42.generated.DatablockType;
//import org.gradle.service.reader.PdbmlFileReader;
//import org.gradle.forYoink.yoinkReader.DbReaderForYoink;
//import org.springframework.stereotype.Service;
//import org.wallerlab.yoink.api.model.bootstrap.Job;
//import org.wallerlab.yoink.api.model.bootstrap.JobParameter;
//import org.wallerlab.yoink.api.service.molecular.FilesReader;
//import org.wallerlab.yoink.service.jobbuilder.AbstractJobBuilder;
//import org.xml_cml.schema.Cml;
//
//@Service
//public class jobBuilderFromMS extends AbstractJobBuilder<String,JAXBElement> implements MSJobBuilder {
//
//	public MolecularSystem ms;
//
//	public jobBuilderFromMS() {
//	}
//
//	public jobBuilderFromMS(MolecularSystem ms) {
//		super();
//		this.ms = ms;
//	}
//
//	@Resource
//	protected Translator<Map<JobParameter, Object>, JAXBElement<Cml>> parameterTranslator;
//
//	@Resource 	//Use a string, not a file
//	private FilesReader<Object, String> jaxbStringReader;
//
//    private PdbmlFileReader reader;
//
//	@Override
//	public JobForYoink buildFromMS(MolecularSystem MS, String fileName) {
//        JobForYoink<JAXBElement> job = new AdaptiveQMMMJob();
//		JAXBElement<Cml> cmlElement = (JAXBElement<Cml>) jaxbStringReader.read(
//				fileName, new Cml());
//		job.setInput(cmlElement);
//		job.setMolecularSystem(MS);
////		Map<JobParameter, Object> parameters = parameterTranslator.translate(cmlElement);
//		return job;
//	}
//
//	public Job<JAXBElement> build(String inputFile) {
//        Job<JAXBElement> job = new org.wallerlab.yoink.domain.AdaptiveQMMMJob();
//        JAXBElement<DatablockType> pdbmlElement = null;
//        try {
//            pdbmlElement = (JAXBElement<DatablockType>) reader.read();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        job.setInput(pdbmlElement);
//        process(job);
//        return job;
//    }
//}
