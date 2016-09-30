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
public class PdbmlFileReader implements ResourceAwareItemReaderItemStream<IDatablockType>{
	
	public PdbmlFileReader() {
	}

	public PdbmlFileReader(Resource resource) {
		this.resource = resource;
	}

	private Resource resource;
	
	/*
	 * Method for reading pdbml file format v40.
	 * Deletes the file after done with the unmarshalling.
	 */
	public IDatablockType readv40(Resource resource) throws IOException, JAXBException{
		if(resource != null){
			System.out.println("File V40: " + resource.getFile());
			JAXBContext jaxbContext = JAXBContext.newInstance(org.gradle.pdbml.v40.generated.DatablockType.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			JAXBElement<org.gradle.pdbml.v40.generated.DatablockType> pdb = (JAXBElement<org.gradle.pdbml.v40.generated.DatablockType>) jaxbUnmarshaller.unmarshal(resource.getInputStream());
			System.out.println("done reading : " + pdb.getValue().getDatablockName());
//			resource.getFile().delete();
			resource = null;
			return (IDatablockType) pdb.getValue();
		}else{
			return null;
		}
	}
	
	/*
	 * Method for reading pdbml file format v42.
	 * Deletes the file after done with the unmarshalling.
	 */
	public IDatablockType readv42(Resource resource) throws IOException, JAXBException{
		if(resource != null){
			System.out.println("File V42: " + resource.getFile());
			JAXBContext jaxbContext = JAXBContext.newInstance(org.gradle.pdbml.v42.generated.DatablockType.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			JAXBElement<org.gradle.pdbml.v42.generated.DatablockType> pdb = (JAXBElement<org.gradle.pdbml.v42.generated.DatablockType>) jaxbUnmarshaller.unmarshal(resource.getInputStream());
			System.out.println("done reading : " + pdb.getValue().getDatablockName());
			resource.getFile().delete();
			resource = null;
			return (IDatablockType) pdb.getValue();
		}else{
			return null;
		}
	}

	/*
	 * Implemented read method. Dynamically reads pdbml files of both formats. 
	 */
	@Override
	public IDatablockType read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {

        IDatablockType dti;
		try{
			dti = readv40(resource);
		}catch(UnmarshalException e){
			dti = readv42(resource);
		}
		return dti;
	}

	@Override
	public void open(ExecutionContext executionContext) throws ItemStreamException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(ExecutionContext executionContext) throws ItemStreamException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() throws ItemStreamException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setResource(Resource resource) {
		this.resource=resource;
		
	}
	
}
