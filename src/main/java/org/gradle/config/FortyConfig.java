package org.gradle.config;

import org.gradle.service.reader.PdbmlFileReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

/**
 * Created by christian on 04/10/2016.
 */
@Profile("forty")
@Configuration
public class FortyConfig {

    @Bean
    public PdbmlFileReader pdbmlFileReader() throws JAXBException {
        return new PdbmlFileReader(JAXBContext.newInstance(org.gradle.pdbml.v40.generated.ObjectFactory.class));

    }

}
