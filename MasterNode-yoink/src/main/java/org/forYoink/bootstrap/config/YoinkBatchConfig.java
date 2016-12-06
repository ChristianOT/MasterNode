package org.forYoink.bootstrap.config;

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
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.forYoink.api.model.molecular.MolecularSystem;
import org.forYoink.api.pdbml.IDatablockType;

import javax.xml.bind.JAXBElement;
import java.io.IOException;
import java.util.List;

/**
 * Created by christian on 05/10/2016.
 */
@Configuration
@EnableBatchProcessing
@EnableTransactionManagement
public class YoinkBatchConfig {

    /**
     * getting copy of application context
     */
    @Autowired
    private ConfigurableApplicationContext appContext;

    @Autowired
    private JobBuilderFactory jbf;

    @Autowired
    private StepBuilderFactory sbf;

    @Autowired
    @Qualifier("bootstrapStep")
    private Step bootstrapStep;

    @Bean
    public Job importBootstrapJob() {
        return jbf.get("bootstrap")
                .incrementer(new RunIdIncrementer())
                .flow(bootstrapStep)
                .end()
                .build();
    }

    @Bean
    public Step bootstrapStep(StepBuilderFactory sbf, ItemReader<JAXBElement<IDatablockType>> reader,
                              ItemProcessor<JAXBElement<IDatablockType>, MolecularSystem> pdbmlProcessor, ItemWriter<MolecularSystem> databaseWriter) {
        return sbf.get("bootstrapStep").<JAXBElement<IDatablockType>, MolecularSystem>chunk(1)
                .reader(reader)
                .processor(pdbmlProcessor)
                .writer(databaseWriter)
                .build();
    }

    @Bean
    public ItemReader<JAXBElement<IDatablockType>> reader() {
        MultiResourceItemReader multiResourceItemReader = new MultiResourceItemReader();
        Resource[] resources;
        try {
            ResourceAwareItemReaderItemStream test = (ResourceAwareItemReaderItemStream) appContext.getBean("pdbmlFileReader");
            resources = appContext.getResources("file:./inputs/pdbml/*.xml");
            multiResourceItemReader.setResources(resources);
            multiResourceItemReader.setDelegate(test);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return multiResourceItemReader;
    }


    @Autowired
    @Qualifier("masterStep")
    Step masterStep;

    @Bean
    public Job masterJob() {
        return jbf.get("master").incrementer(new RunIdIncrementer()).flow(masterStep).end().build();
    }

    @Bean
    public Step masterStep(ItemReader<List<org.forYoink.api.model.bootstrap.Job>> pdbmlRequestReader,
                           ItemProcessor<List<org.forYoink.api.model.bootstrap.Job>,
                                   List<org.forYoink.api.model.bootstrap.Job>> MSInteractionSetProcessor,
                           ItemWriter<List<org.forYoink.api.model.bootstrap.Job>> testWriter) {
        return sbf.get("masterStep").<List<org.forYoink.api.model.bootstrap.Job>, List<org.forYoink.api.model.bootstrap.Job>>chunk(1)
                .reader(pdbmlRequestReader)
                .processor(MSInteractionSetProcessor)
                .writer(testWriter)
                .build();
    }
}
