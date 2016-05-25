package org.gradle.main;

import java.io.File;
import java.io.IOException;

import org.gradle.config.BatchConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * Main class of the MasterNode. Uses spring boot to run the application.
 *
 * @author Christian Ouali Turki
 */
@SpringBootApplication
@Import(BatchConfig.class)
public class MasterNode {

	public static void main(String[] args) throws IOException {
		
		@SuppressWarnings("unused")
		ApplicationContext context = SpringApplication.run(MasterNode.class, args);
		
	}

}
