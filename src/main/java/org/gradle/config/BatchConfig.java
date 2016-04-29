package org.gradle.config;

import java.io.IOException;

import javax.xml.bind.JAXBElement;

import org.gradle.domain.MyObject;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.batch.item.file.ResourceAwareItemReaderItemStream;
import org.springframework.batch.item.xml.StaxEventItemReader;
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
	
	@Autowired
	@Qualifier("unmStep")
	private Step unmarshalStep;
	
	@Bean
	public Job unmarshallJob(JobBuilderFactory jbf) throws IOException{
		return jbf.get("Unmarshall").incrementer(new RunIdIncrementer()).flow(unmarshalStep).end().build();
	}

	@SuppressWarnings("unchecked")
	@Bean(name="unmStep")
	public Step unmarshallStep(StepBuilderFactory sbf) throws IOException{
		return sbf.get("unmStep").chunk(1)
				.reader(reader())
				.writer((ItemWriter<MyObject>)context.getBean("repositoryWriter"))
				.build() ;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
	public MultiResourceItemReader reader() throws IOException {
		MultiResourceItemReader mrir = new MultiResourceItemReader();
		PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
		Resource[] resources =  pathMatchinResolver.getResources("classpath:/org/gradle/**/*.xml");
		mrir.setResources(resources);
		mrir.setStrict(true);
		mrir.setDelegate((ResourceAwareItemReaderItemStream) pdbFileReader());
		return mrir;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
	public StaxEventItemReader<JAXBElement> pdbFileReader(){
		StaxEventItemReader reader = new StaxEventItemReader();
		reader.setUnmarshaller(unmarshaller());
		reader.setFragmentRootElementName("myObject");
		return reader;
	}
	
	org.springframework.oxm.Unmarshaller unmarshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setClassesToBeBound(MyObject.class);
		return (Unmarshaller) marshaller;
	}
	
}