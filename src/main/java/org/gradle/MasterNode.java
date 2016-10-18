package org.gradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.io.IOException;


/**
 * Main class of the MasterNode. Uses spring boot to run the application.
 *
 * @author Christian Ouali Turki
 */
@SpringBootApplication
public class MasterNode {

    public static void main(String[] args) throws IOException {
        @SuppressWarnings("unused")
        ApplicationContext context = SpringApplication.run(MasterNode.class, args);

    }

}
