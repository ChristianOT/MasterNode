package org.gradle.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.gradle.service.writer.JmsMessageWriter;
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
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.Resource;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.config.SimpleJmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.util.FileSystemUtils;

import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * In this class all the batch jobs and steps are configured.
 * - bootstrap job: adding, updating data from local files to neo4j database
 * - master job: sending messages containing the id of one or all database entries to a
 * jms queue (request)
 *
 * @author Christian Ouali Turki
 */
@Configuration
@EnableBatchProcessing
@EnableTransactionManagement
@EnableJms
@ComponentScan("org.gradle")
public class BatchConfig {

    /**
     * getting copy of application context
     */
    @Autowired
    private ConfigurableApplicationContext context;

    @Autowired
    private JobBuilderFactory jbf;

    @Autowired
    private StepBuilderFactory sbf;


	/*
     * bootstrapJob
	 */

    @Autowired
    @Qualifier("bootstrapStep")
    private Step bootstrapStep;

    /**
     * Bean for building the bootstrap job executing bootstrapStep.
     *
     * @return bootstrap
     * @throws IOException
     */
    @Bean
    public Job bootstrapJob() {
        return jbf.get("bootstrap")
                .incrementer(new RunIdIncrementer())
                .flow(bootstrapStep)
                .end()
                .build();
    }

    /**
     * Bean for building the bootstrap step.
     *
     * @return bootstrapStep
     * @throws IOException
     */
    @Bean
    public Step bootstrapStep(StepBuilderFactory sbf, ItemReader multiReader,
                              ItemProcessor pdbmlProcessor, ItemWriter databaseWriter) {
        return sbf.get("bootstrapStep").chunk(1)
                .reader(multiReader)
                .processor(pdbmlProcessor)
                .writer(databaseWriter)
                .build();
    }

    /**
     * Setting ItemReader for bootstrapStep as a MultiResourceItemReader. Delegates
     * to the PdbmlFileReader to handle the pdbml files.
     * <p>
     * ISSUE: trying to read same file multiple times!!!
     *
     * @return reader
     * @throws IOException
     */
    @Bean
    public ItemReader multiReader() {
        MultiResourceItemReader reader = new MultiResourceItemReader();
        Resource[] resources;
        try {
            resources = context.getResources("file:./src/main/resources/org/*.xml");
            System.out.println("Number of Files: " + resources.length);
            reader.setResources(resources);
            reader.setDelegate((ResourceAwareItemReaderItemStream) context.getBean("pdbmlFileReader"));
        } catch (IOException e) {
            System.out.println(e);
        }
        //context.close();
        return reader;
    }


	/*
     * masterJob
	 */

    @Autowired
    @Qualifier("masterStep")
    private Step masterStep;


    /**
     * Bean for building the master job executing masterStep.
     *
     * @return master
     * @throws IOException
     */
    @Bean
    public Job masterJob() {
        return jbf.get("master").incrementer(new RunIdIncrementer()).flow(masterStep).end().build();
    }

    /**
     * Bean for building masterStep. No processor necessary.
     *
     * @return masterStep
     * @throws IOException
     */
    @Bean
    public Step masterStep() {
        return sbf.get("masterStep").chunk(1)
                .reader((ItemReader<? extends Object>) context.getBean("dbReader"))
                .writer((ItemWriter<? super Object>) context.getBean("consoleWriter"))
                .build();
    }

    /**
     * setting the ConnectionFactory for jms communication
     *
     * @return a ConnectionFactory
     */
    @Bean
    private static ConnectionFactory connectionFactory() {
        return new ActiveMQConnectionFactory("tcp://localhost:61616");
    }

    @Bean
    public JmsListenerContainerFactory<?> myJmsContainerFactory(ConnectionFactory connectionFactory) {
        SimpleJmsListenerContainerFactory factory = new SimpleJmsListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory);
        return factory;
    }

    /**
     * Configuration of the JmsTemplate allowing interaction with jms
     * queues. The name of the queue is set with
     * jmsTemplate.setDefaultDestinationName("name of the queue")
     *
     * @return jmsTemplate
     */
    @Bean
    public JmsTemplate jmsTemplate() {
        JmsTemplate jmsTemplate = new JmsTemplate();
        jmsTemplate.setConnectionFactory(connectionFactory());
        jmsTemplate.setDefaultDestinationName("yoink-request");
        return jmsTemplate;
    }

    /**
     * Setting the ItemWriter for masterStep as a {@link org.gradle.service.writer.JmsMessageWriter}.
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
    //@JmsListener(destination = "respond", containerFactory = "myJmsContainerFactory", concurrency = "1")
    public void receiveMessage(String message) {
        responseCounter++;
        System.out.println("#---------- Getting answer: " + message + ". ----------#");
        if (responseCounter == 1)
            context.close();
        FileSystemUtils.deleteRecursively(new File("activemq-data"));
    }

}