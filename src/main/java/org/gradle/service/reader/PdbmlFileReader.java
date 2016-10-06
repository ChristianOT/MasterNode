package org.gradle.service.reader;

import org.gradle.pdbml.IDatablockType;
import org.gradle.pdbml.v40.generated.DatablockType;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.batch.item.file.ResourceAwareItemReaderItemStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;

/**
 * ResourceAwareItemReaderItemStream for reading a pdbml file. For bootstrapStep.
 *
 * @author Christian Ouali Turki
 */
//@Service
public class PdbmlFileReader implements ResourceAwareItemReaderItemStream<JAXBElement>{

	private Resource resource;
	private JAXBContext jaxbContext;

	public PdbmlFileReader() {}

	public PdbmlFileReader(JAXBContext jaxbContext) {
		this.jaxbContext=jaxbContext;
	}

	public PdbmlFileReader(Resource resource, JAXBContext jaxbContext) {
		this.resource=resource;
		this.jaxbContext=jaxbContext;
	}
	/*
	 * Implemented read method. Dynamically reads pdbml files of both formats. 
	 */
	@Override
	public JAXBElement read() throws Exception {
		if(resource != null) {
			System.out.println("Reading " + resource.getFile());
			Unmarshaller jaxbUnmarshaller = this.jaxbContext.createUnmarshaller();
			JAXBElement pdb = (JAXBElement) jaxbUnmarshaller.unmarshal(resource.getInputStream());
			return pdb;
		} else{
			System.out.println("No resources to read");
			return null;}
	}


	@Override
	public void setResource(Resource resource) {
		this.resource = resource;

	}

	@Override
	public void open(ExecutionContext executionContext) throws ItemStreamException {

	}

	@Override
	public void update(ExecutionContext executionContext) throws ItemStreamException {

	}

	@Override
	public void close() throws ItemStreamException {

	}
}
