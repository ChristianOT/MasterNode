package org.gradle;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.*;

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

    @Bean
    MultiResourceItemReader<String> multiResourceItemReader() throws IOException, InterruptedException {
        MultiResourceItemReader multiResourceItemReader = new MultiResourceItemReader();
        multiResourceItemReader.setResources(context.getResources("file:/Users/christian/Downloads/pdb/01/*.gz"));
        multiResourceItemReader.setDelegate(reader());
        return multiResourceItemReader;
    }

    @Bean
    public Job job1() throws IOException, InterruptedException {
        return jbf.get("job1").start(step1()).build();
    }

    @Bean
    public Step step1() throws IOException, InterruptedException {
        return sbf.get("step1").<String, String>chunk(6)
                .reader(multiResourceItemReader())
                .processor(processor())
                .writer(writer())
                .build();
    }

}


