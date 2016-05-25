package org.gradle.config;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.jms.ConnectionFactory;
import javax.jms.JMSException;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.gradle.writer.JmsMessageWriter;
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
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.config.SimpleJmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.util.FileSystemUtils;
/**
 * In this class all the batch jobs and steps are configured.
 *  - bootstrap job: adding, updating data from local files to neo4j database
 *  - master job: sending messages containing the id of one or all database entries to a
 *   jms queue (request)
 * 
 * @author Christian Ouali Turki
 *
 */
@Configuration
@EnableBatchProcessing
@EnableTransactionManagement
@EnableJms
@ComponentScan("org.gradle")
public class BatchConfig{

	/**
	 * getting copy of application context
	 */
	 @Autowired
	 ConfigurableApplicationContext context;
	 
	 /**
	  * setting the ConnectionFactory for jms communication
	  * 
	  * @return a ConnectionFactory
	  */
	@Bean
	static ConnectionFactory connectionFactory() {
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");
		return connectionFactory;
	}

	@Bean
	JmsListenerContainerFactory<?> myJmsContainerFactory(ConnectionFactory connectionFactory) {
		SimpleJmsListenerContainerFactory factory = new SimpleJmsListenerContainerFactory();
		factory.setConnectionFactory(connectionFactory);
		return factory;
	}
	
	/*
	 * bootstrapJob
	 */

	@Autowired
	@Qualifier("bootstrapStep")
	private Step bootstrapStep;

	/**
	 * Bean for building the bootstrap job executing bootstrapStep.
	 *  
	 * @param jbf, JobBuilderFactory
	 * @return bootstrap
	 * @throws IOException
	 */
	@Bean
	public Job bootstrapJob(JobBuilderFactory jbf) throws IOException {
		return jbf.get("bootstrap").incrementer(new RunIdIncrementer()).flow(bootstrapStep).end().build();
	}

	/**
	 * Bean for building the bootstrap step.
	 * 
	 * @param sbf, StepBuilderFactory
	 * @return bootstrapStep
	 * @throws IOException
	 */
	@Bean
	public Step bootstrapStep(StepBuilderFactory sbf) throws IOException {
		return sbf.get("bootstrapStep").chunk(1)
				.reader(multiReader())
				.processor((ItemProcessor) context.getBean("pdbmlProcessor"))
				.writer((ItemWriter) context.getBean("databaseWriter"))
				.build();
	}

	/**
	 * Setting ItemReader for bootstrapStep as a MultiResourceItemReader. Use
	 * PathMatchingResourcePatternResolver for setting the file path. Delegates
	 * to the PdbmlFileReader to handle the pdbml files.
	 * 
	 * @return reader
	 * @throws IOException
	 */
	@Bean
	public ItemReader multiReader() throws IOException {
		MultiResourceItemReader reader = new MultiResourceItemReader();
		PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
		Resource[] resources = pathMatchinResolver.getResources("file:./src/main/resources/org/gradle/aa/*.xml");
		reader.setResources(resources);
		reader.setDelegate((ResourceAwareItemReaderItemStream) context.getBean("pdbmlFileReader"));
		return reader;
	}

	/*
	 * masterJob
	 */

	@Autowired
	@Qualifier("masterStep")
	private Step masterStep;

	/**
	 * Configuration of the JmsTemplate allowing interaction with jms
	 * queues. The name of the queue is set with 
	 *     jmsTemplate.setDefaultDestinationName("name of the queue")
	 *     
	 * @return jmsTemplate
	 */
	@Bean
	JmsTemplate jmsTemplate() {
		JmsTemplate jmsTemplate = new JmsTemplate();
		jmsTemplate.setConnectionFactory(connectionFactory());
		jmsTemplate.setDefaultDestinationName("yoink-request");
		return jmsTemplate;
	}

	/**
	 * Setting the ItemWriter for masterStep as a {@link org.gradle.writer.JmsMessageWriter}.
	 * Needs JmsTemplate to interact with jms queues.
	 * 
	 * @return itemWriter
	 */
	@Bean
	public ItemWriter<? super List<String>> writer() {
		JmsMessageWriter itemWriter = new JmsMessageWriter();
		itemWriter.setJmsTemplate(jmsTemplate());
		return itemWriter;
	}
	
	/**
	 * Bean for building the master job executing masterStep.
	 * 
	 * @param jbf, JobBuilderFactory
	 * @return master
	 * @throws IOException
	 */
	@Bean
	public Job masterJob(JobBuilderFactory jbf) throws IOException {
		return jbf.get("master").incrementer(new RunIdIncrementer()).flow(masterStep).end().build();
	}

	/**
	 * Bean for building masterStep. No processor necessary.
	 * 
	 * @param sbf StepBuilderFactory
	 * @return masterStep
	 * @throws IOException
	 */
	@Bean
	public Step masterStep(StepBuilderFactory sbf) throws IOException {
		return sbf.get("masterStep").chunk(1)
				.reader((ItemReader<? extends Object>) context.getBean("dbReader"))
				.writer((ItemWriter<? super Object>) writer())
				.build();
	}

	/**
	 * Variable for counting number of receiveMessage executions. If number equals 
	 * the number of messages send, the applications context will be closed.
	 */
	private int responseCounter = 0;

	/**
	 * JmsListener, that is waiting for messages to arrive in the respond queue. The
	 * message is printed out in the console. Concurrency is set to 1, but can be increased
	 * to get more messages at once from the queue. The messages will than also be processed 
	 * concurrently.
	 * 
	 * @param message
	 * @throws JMSException
	 * @throws InterruptedException
	 */
    @JmsListener(destination = "respond", containerFactory = "myJmsContainerFactory", concurrency = "1")
	public void receiveMessage(String message) throws JMSException,
	InterruptedException {
	responseCounter++;
	System.out.println("#---------- Getting answer: " + message.toString() + ". ----------#");
	if (responseCounter == 1)
	    context.close();
	FileSystemUtils.deleteRecursively(new File("activemq-data"));
	}

}