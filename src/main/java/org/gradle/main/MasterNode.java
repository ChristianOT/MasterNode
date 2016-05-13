package org.gradle.main;

import java.io.File;
import java.io.IOException;

import org.gradle.config.BatchConfig;
import org.neo4j.io.fs.FileUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@ComponentScan
@SpringBootApplication
@EnableAutoConfiguration
@Import(BatchConfig.class)
public class MasterNode {

	public static void main(String[] args) throws IOException {
		
		//FileUtils.deleteRecursively(new File("newNeo4j.db"));
		@SuppressWarnings("unused")
		ApplicationContext context = SpringApplication.run(MasterNode.class, args);
		
		boolean stop = false;
		while(stop){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	

}
