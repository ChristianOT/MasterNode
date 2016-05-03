package org.gradle.config;

import java.io.IOException;
import java.util.Arrays;

import javax.xml.bind.JAXBElement;

import org.gradle.domain.DatablockType;
import org.gradle.domain.MyObject;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.batch.item.file.ResourceAwareItemReaderItemStream;
import org.springframework.batch.item.xml.StaxEventItemReader;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.oxm.Unmarshaller;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableBatchProcessing
@EnableTransactionManagement
@ComponentScan("org.gradle")
public class BatchConfig {
	
	@Autowired
	ApplicationContext context;
	
	
	/*################################### MyObjectJob ########################################*/
	
	@Autowired
	@Qualifier("myObjectStep")
	private Step myObjectUnmarshallStep;
	
	@Bean
	public Job myObjectJob(JobBuilderFactory jbf) throws IOException{
		return jbf.get("myObjectJob")
				.incrementer(new RunIdIncrementer())
				.flow(myObjectUnmarshallStep)
				.end()
				.build();
	}

	@SuppressWarnings("unchecked")
	@Bean(name="myObjectStep")
	public Step myObjectUnmarshallStep(StepBuilderFactory sbf) throws IOException{
		return sbf.get("myObjectStep").chunk(1)
				.reader(myObjectReader())
				.writer((ItemWriter<MyObject>)context.getBean("myObjectWriter"))
				.build() ;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
	public MultiResourceItemReader myObjectReader() throws IOException {
		MultiResourceItemReader mrir = new MultiResourceItemReader();
		PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
		Resource[] resources =  pathMatchinResolver.getResources("classpath:/org/gradle/**/*.xml");
		mrir.setResources(resources);
		//mrir.setStrict(true);
		mrir.setDelegate((ResourceAwareItemReaderItemStream) myObjectFileReader());
		return mrir;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
	public StaxEventItemReader<JAXBElement> myObjectFileReader(){
		StaxEventItemReader reader = new StaxEventItemReader();
		reader.setUnmarshaller(myObjectUnmarshaller());
		reader.setFragmentRootElementName("myObject");
		return reader;
	}
	
	org.springframework.oxm.Unmarshaller myObjectUnmarshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setClassesToBeBound(MyObject.class);
		return (Unmarshaller) marshaller;
	}

	/*################################### pdbJob ########################################*/

	@Autowired
	@Qualifier("pdbStep")
	private Step pdbStep;
	
	
	@Bean
	public Job pdbJob(JobBuilderFactory jbf){
		return jbf.get("pdbJob")
				.incrementer(new RunIdIncrementer())
				.flow(pdbStep)
				.end()
				.build();
	
	}
	
	@SuppressWarnings("unchecked")
	@Bean
	public Step pdbStep(StepBuilderFactory sbf) throws BeansException, IOException{
		return sbf.get("pdbStep").chunk(1)
				.reader(pdbReader())
				.writer((ItemWriter<? super Object>) context.getBean("testItemWriter")/*(ItemWriter<? super Object>)context.getBean("pdbWriter")*/)
				.build() ;
	
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
	public ItemStreamReader<DatablockType> pdbReader() throws IOException {
		MultiResourceItemReader mrir = new MultiResourceItemReader();
		PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
		Resource[] resources =  pathMatchinResolver.getResources("classpath:/org/gradle/**/*.xml");
		System.out.println(Arrays.toString(resources));
		mrir.setResources(resources);
		mrir.setStrict(true);
		mrir.setDelegate(myItemReader());
		return (ItemStreamReader<DatablockType>) mrir;
	}
	
//	@SuppressWarnings({ "rawtypes", "unchecked" })
//	@Bean
//	public StaxEventItemReader<JAXBElement> pdbFileReader(){
//		StaxEventItemReader reader = new StaxEventItemReader();
//		reader.setUnmarshaller(pdbUnmarshaller());
//		reader.setFragmentRootElementName("datablockType");
//		return reader;
//	}

	@Bean
	public ResourceAwareItemReaderItemStream<DatablockType> myItemReader() throws IOException {
		MyItemReader reader = new org.gradle.config.MyItemReader();
		return reader;
	}
	
	
//    @Bean
//    public ResourceAwareItemReaderItemStream<DatablockType> reader() throws IOException {
//    		StaxEventItemReader<DatablockType> reader = new StaxEventItemReader<DatablockType>();
//    		reader.setUnmarshaller((org.springframework.oxm.Unmarshaller) unmarshaller());
//    		reader.setFragmentRootElementName("datablockType"); 
//    		
//    		return reader;
//    }
    
	
//    @Bean 
//    Jaxb2Marshaller unmarshaller(){
//    	Jaxb2Marshaller  unmarshaller = new Jaxb2Marshaller();
//    	unmarshaller.setClassesToBeBound(DatablockType.class);
//    	return unmarshaller;
//    }
	
}