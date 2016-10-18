package forYoink.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
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
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.Resource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.io.IOException;

/**
 * Created by christian on 05/10/2016.
 */
@Profile("yoink")
@Configuration
@EnableBatchProcessing
@EnableTransactionManagement
public class YoinkBatchConfig {

    /**
     * getting copy of application context
     */
    @Autowired
    private ConfigurableApplicationContext context;

    @Autowired
    private JobBuilderFactory jbf;

    @Autowired
    private StepBuilderFactory sbf;

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
        return jbf.get("bootstrap").incrementer(new RunIdIncrementer()).flow(bootstrapStep).end().build();
    }

    /**
     * Bean for building the bootstrap step.
     *
     * @return bootstrapStep
     * @throws IOException
     */
    @Bean
    public Step bootstrapStep() {
        return sbf.get("bootstrapStep").chunk(1)
                .reader(multiReader())
                .processor((ItemProcessor) context.getBean("processorForYoink"))
                .writer((ItemWriter) context.getBean("databaseWriterForYoink"))
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

    @Autowired
    @Qualifier("masterStep")
    private Step masterStep;

    public JobRepository jobRepository;

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
                .reader((ItemReader<? extends Object>) context.getBean("dbReaderForYoink"))
                .processor((ItemProcessor<? super Object, ?>) context.getBean("dbProcessorForYoink"))
                .writer((ItemWriter<? super Object>) context.getBean("consoleWriterForYoink"))
                .build();
    }

}
