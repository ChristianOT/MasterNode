package org.forYoink.config;

import org.forYoink.pdbml.v42.generated.DatablockType;
import org.forYoink.service.reader.PdbmlFileReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

/**
 * Created by christian on 04/10/2016.
 */
@Profile("fortyTwo")
@Configuration
public class FortyTwoConfig {

    @Bean
    public PdbmlFileReader pdbmlFileReader() throws JAXBException {
        return new PdbmlFileReader(JAXBContext.newInstance(DatablockType.class));
    }

}
