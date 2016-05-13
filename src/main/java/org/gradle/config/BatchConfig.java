package org.gradle.config;

import java.io.IOException;

import javax.jms.ConnectionFactory;
import javax.sql.DataSource;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.gradle.domain.MolecularSystem;
import org.gradle.interfaces.DatablockTypeInterface;
import org.gradle.pdbml.v40.generated.DatablockType;
import org.gradle.processor.PdbmlProcessor;
import org.gradle.reader.PdbmlFileReader;
import org.gradle.writer.DatabaseWriter;
import org.gradle.writer.JmsMessageWriter;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseBuilder;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.batch.item.file.ResourceAwareItemReaderItemStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.data.neo4j.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.core.GraphDatabase;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.data.neo4j.support.mapping.Neo4jMappingContext;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.config.SimpleJmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableBatchProcessing
@EnableTransactionManagement
@EnableJms
@ComponentScan("org.gradle")
public class BatchConfig{

	 @Autowired
	 ConfigurableApplicationContext context;
	 
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
	 * ################################## bootstrapJob ######################################
	 */

	@Autowired
	@Qualifier("bootstrapStep")
	private Step bootstrapStep;

	@Autowired
	StepBuilderFactory sbf;

	@Bean
	public Job bootstrapJob(JobBuilderFactory jbf) throws IOException {
		return jbf.get("bootstrap").incrementer(new RunIdIncrementer()).flow(bootstrapStep).end().build();
	}

	@Bean
	public Step bootstrapStep(StepBuilderFactory sbf) throws IOException {
		return sbf.get("bootstrapStep").chunk(1)
				.reader(multiReader())
				.processor((ItemProcessor) context.getBean("pdbmlProcessor"))
				.writer((ItemWriter) context.getBean("databaseWriter"))
				.build();
	}

	@Bean
	public ItemReader multiReader() throws IOException {
		MultiResourceItemReader reader = new MultiResourceItemReader();
		PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
		Resource[] resources = pathMatchinResolver.getResources("file:/scratch/c_oual01/pdb/**/*.xml");
		reader.setResources(resources);
		reader.setDelegate((ResourceAwareItemReaderItemStream) context.getBean("pdbmlFileReader"));
		return reader;
	}

	/*
	 * ################################### masterJob ########################################
	 */

	@Autowired
	@Qualifier("masterStep")
	private Step masterStep;

	@Bean
	JmsTemplate jmsTemplate() {
		JmsTemplate jmsTemplate = new JmsTemplate();
		jmsTemplate.setConnectionFactory(connectionFactory());
		jmsTemplate.setDefaultDestinationName("yoink-request");
		return jmsTemplate;
	}

	@Bean
	public ItemWriter<? super String> writer() {
		JmsMessageWriter itemWriter = new JmsMessageWriter();
		itemWriter.setJmsTemplate(jmsTemplate());
		return itemWriter;
	}

	static class CmlReader implements ItemReader<String> {

		@Override
		public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
			return new String("/scratch/c_oual01/workspace_for_sts/MasterNode/src/main/resources/distance_abrupt.xml");
		}

	}

	@Bean
	public CmlReader cmlReader() {
		return new CmlReader();
	}

	@Bean
	public Job masterJob(JobBuilderFactory jbf) throws IOException {
		return jbf.get("master").incrementer(new RunIdIncrementer()).flow(masterStep).end().build();
	}

	@Bean
	public Step masterStep(StepBuilderFactory sbf) throws IOException {
		return sbf.get("masterStep").chunk(1).reader(cmlReader()).writer((ItemWriter<? super Object>) writer()).build();
	}

	// @Bean
	// public JdbcCursorItemReader<String> stringItemReader() {
	// JdbcCursorItemReader<String> reader = new JdbcCursorItemReader<String>();
	// reader.setDataSource(dataSource);
	// reader.setSql("select * from molecular_system");
	// return reader;
	// }

	private int responseCounter = 0;

	// @JmsListener(destination = "mailbox-answer", containerFactory =
	// "myJmsContainerFactory", concurrency = "1")
	// public void receiveMessage(String message) throws JMSException,
	// InterruptedException {
	// responseCounter++;
	// System.out.println("#---------- Getting answer: " + message.toString() +
	// ". ----------#");
	// if (responseCounter == 1)
	// context.close();
	// Thread.sleep(1000);
	// FileSystemUtils.deleteRecursively(new File("activemq-data"));
	// }

}