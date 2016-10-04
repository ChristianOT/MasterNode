package org.gradle.reader;

import org.gradle.pdbml.IDatablockType;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.batch.item.file.ResourceAwareItemReaderItemStream;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.rmi.UnmarshalException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 * ResourceAwareItemReaderItemStream for reading a pdbml file. For bootstrapStep.
 *
 * @author Christian Ouali Turki
 */
@Service
public class PdbmlFileReader implements ResourceAwareItemReaderItemStream<JAXBElement>{
	
	public PdbmlFileReader() {
	}

	public PdbmlFileReader(Resource resource, IDatablockType idt) {
		this.resource = resource;
		this.iDatablockType=idt;
	}

	private Resource resource;
	private IDatablockType iDatablockType;

	/*
	 * Implemented read method. Dynamically reads pdbml files of both formats. 
	 */
	@Override
	public JAXBElement read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		JAXBElement pdb = null;
		if(resource != null) {
			System.out.println("Reading " + resource.getFile());
			JAXBContext jaxbContext = JAXBContext.newInstance(iDatablockType.getClass());
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			pdb = (JAXBElement) jaxbUnmarshaller.unmarshal(resource.getInputStream());
		}
			return pdb;
	}


	@Override
	public void setResource(Resource resource) {

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
