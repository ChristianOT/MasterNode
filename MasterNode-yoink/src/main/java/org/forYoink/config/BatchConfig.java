package org.forYoink.config;

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
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.io.IOException;

/**
 * In this class all the batch jobs and steps are configured.
 * - bootstrap job: adding, updating data from local files to neo4j database
 * - master job: sending messages containing the id of one or all database entries to a
 * jms queue (request)
 *
 * @author Christian Ouali Turki
 */
@Profile("standard")
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
        return jbf.get("bootstrapStep")
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
            System.out.println(resources.length);
            reader.setResources(resources);
            reader.setDelegate((ResourceAwareItemReaderItemStream) context.getBean("pdbmlFileReader"));
        } catch (IOException e) {
            System.out.println(e);
        }
        //context.close();
        return reader;
    }

}