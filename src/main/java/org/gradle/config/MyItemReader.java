package org.gradle.config;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;

import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.batch.item.file.ResourceAwareItemReaderItemStream;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;
import org.gradle.domain.DatablockType;

public class MyItemReader implements ResourceAwareItemReaderItemStream<DatablockType>, ApplicationContextAware {

	private Resource resource;
	private ApplicationContext appContext;
	
	public DatablockType read() throws Exception, UnexpectedInputException,
        org.springframework.batch.item.ParseException, NonTransientResourceException {

		if(resource != null){
			JAXBContext jaxbContext = JAXBContext.newInstance(DatablockType.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			JAXBElement<DatablockType> pdb = (JAXBElement<DatablockType>) jaxbUnmarshaller.unmarshal(resource.getInputStream());
			System.out.println("reading : " + pdb.getValue().getDatablockName());	
			this.resource = null;
			return pdb.getValue();
		}else{
			return null;
		}
	}

	public void open(ExecutionContext executionContext)
			throws ItemStreamException {
		// TODO Auto-generated method stub
		
	}

	public void update(ExecutionContext executionContext)
			throws ItemStreamException {
		// TODO Auto-generated method stub
		
	}

	public void close() throws ItemStreamException {
		// TODO Auto-generated method stub
		
	}

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.appContext = applicationContext;
		
	}

	public void setResource(Resource resource) {
		this.resource = resource;
		
	}


  
}
