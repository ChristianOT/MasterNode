package org.gradle.config;

import org.gradle.domain.MolecularSystem;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.batch.item.file.ResourceAwareItemReaderItemStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
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

    @Value("${pdb.file.location}")
    String pdbLocation;

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
        return jbf.get("bootstrap").start(bootstrapStep).build();
    }

    /**
     * Bean for building the bootstrap step.
     *
     * @return bootstrapStep
     * @throws IOException
     */
    @Bean
    public Step bootstrapStep(ItemReader multiReader,
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
            resources = context.getResources(pdbLocation);
            reader.setResources(resources);
            reader.setDelegate((ResourceAwareItemReaderItemStream) context.getBean("pdbmlFileReader"));
        } catch (Exception e) {
            System.out.println(e);
        }
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
        return jbf.get("master").start(masterStep).build();
    }

    /**
     * Bean for building masterStep. No processor necessary.
     *
     * @return masterStep
     * @throws IOException
     */
    @Bean
    public Step masterStep(ItemReader<MolecularSystem> dbReader, ItemWriter<MolecularSystem> consoleWriter) {
        return sbf.get("masterStep").<MolecularSystem, MolecularSystem>chunk(1)
                .reader(dbReader)
                .writer(consoleWriter)
                .build();
    }

}