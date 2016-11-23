package org.gradle;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

/**
 * Created by christian on 17/11/2016.
 */
@Configuration
@EnableBatchProcessing
public class Config {

    @Autowired
    ApplicationContext context;

    @Autowired
    StepBuilderFactory sbf;

    @Autowired
    JobBuilderFactory jbf;

    private String ent_gz_FileLocation = "file:./input/02/*.ent.gz";//"file:/Users/christian/Downloads/pdb/01/*.gz";

    private String pdb_gz_FileLocation = "file:./input/02/*.pdb.gz";

    private String complete_pdb_FileLocation = "file:./input/02/*_complete.pdb";

    @Bean
    Reader reader() {
        return new Reader();
    }

    @Bean
    Writer writer() {
        return new Writer();
    }

    @Bean
    Processor processor() {
        return new Processor();
    }

//    @Bean
    MultiResourceItemReader<String> multiResourceItemReader(String fileLocation) throws IOException, InterruptedException {
        MultiResourceItemReader multiResourceItemReader = new MultiResourceItemReader();
        multiResourceItemReader.setResources(context.getResources(fileLocation));
        multiResourceItemReader.setDelegate(reader());
        return multiResourceItemReader;
    }

    @Bean
    public Job job1() throws IOException, InterruptedException {
        return jbf.get("job1").start(step1()).build();
    }

    @Bean
    public Step step1() throws IOException, InterruptedException {
        return sbf.get("step1").<String, String>chunk(10)
                .reader(multiResourceItemReader(ent_gz_FileLocation))
                .processor(processor())
                .writer(writer())
                .build();
    }

    @Bean
    public Job job2() throws IOException, InterruptedException {
        return jbf.get("job2").start(step2).build();
    }

    @Bean
    public Step step2(ItemProcessor<String,String> pdbProcessor, ItemWriter<String> pdbWriter) throws IOException, InterruptedException {
        return sbf.get("step2").<String, String>chunk(10)
                .reader(multiResourceItemReader(pdb_gz_FileLocation))
                .processor(pdbProcessor)
                .writer(pdbWriter)
                .build();
    }

    @Autowired
    @Qualifier("step2")
    Step step2;


    @Bean
    public Job job3() throws IOException, InterruptedException {
        return jbf.get("job3").start(step3).build();
    }

    @Bean
    public Step step3(ItemProcessor<String,String> pdbCompleteProcessor, ItemWriter<String> pdbCompleteWriter) throws IOException, InterruptedException {
        return sbf.get("step3").<String, String>chunk(10)
                .reader(multiResourceItemReader(complete_pdb_FileLocation))
                .processor(pdbCompleteProcessor)
                .writer(pdbCompleteWriter)
                .build();
    }

    @Autowired
    @Qualifier("step3")
    Step step3;
}


