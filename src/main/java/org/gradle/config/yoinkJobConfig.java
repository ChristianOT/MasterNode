package org.gradle.config;

import java.io.IOException;


import org.gradle.yoinkClasses.jobBuilderFromMS;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.batch.item.file.ResourceAwareItemReaderItemStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.wallerlab.yoink.api.model.molecular.MolecularSystem;

@Configuration
@EnableBatchProcessing
@EnableTransactionManagement
@ComponentScan("org.gradle")
public class yoinkJobConfig {

	@Autowired
	ConfigurableApplicationContext context;

	@javax.annotation.Resource
	jobBuilderFromMS builder;

	@Autowired
	@Qualifier("bootstrapStep")
	private Step bootstrapStep;

	@Bean
	public org.wallerlab.yoink.api.model.bootstrap.Job yoinkJob(MolecularSystem ms, String fileName)
			throws IOException {
		return builder.buildFromMS(ms, fileName);
	}

	@Bean
	public Job bootstrapJob(JobBuilderFactory jbf) throws IOException {
		return jbf.get("bootstrap").incrementer(new RunIdIncrementer()).flow(bootstrapStep).end().build();
	}

	/**
	 * Bean for building the bootstrap step.
	 * 
	 * @param sbf,
	 *            StepBuilderFactory
	 * @return bootstrapStep
	 * @throws IOException
	 */
	@Bean
	public Step bootstrapStep(StepBuilderFactory sbf) throws IOException {
		return sbf.get("bootstrapStep").chunk(1).reader(multiReader())
				.processor((ItemProcessor) context.getBean("pdbmlProcessor"))
				.writer((ItemWriter) context.getBean("databaseWriter")).build();
	}

	/**
	 * Setting ItemReader for bootstrapStep as a MultiResourceItemReader. Use
	 * PathMatchingResourcePatternResolver for setting the file path. Delegates
	 * to the PdbmlFileReader to handle the pdbml files.
	 * 
	 * ISSUE: trying to read same file multiple times!!!
	 * 
	 * @return reader
	 * @throws IOException
	 */
	@Bean
	public ItemReader multiReader() throws IOException {
		MultiResourceItemReader reader = new MultiResourceItemReader();
		PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
		Resource[] resources = pathMatchinResolver.getResources("file:./src/main/resources/org/gradle/*.xml");
		if (resources != null) {
			System.out.println(resources.length);
			reader.setResources(resources);
			reader.setDelegate((ResourceAwareItemReaderItemStream) context.getBean("pdbmlFileReader"));
		} else {
			System.out.println("No file to read!");
			// context.close();
		}
		return reader;
	}

}
