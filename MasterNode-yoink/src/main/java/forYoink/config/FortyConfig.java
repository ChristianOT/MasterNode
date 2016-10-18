package forYoink.config;

import forYoink.pdbml.v40.generated.DatablockType;
import forYoink.yoinkReader.PdbmlFileReaderX;
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
    public PdbmlFileReaderX pdbmlFileReader() throws JAXBException {
        return new PdbmlFileReaderX(JAXBContext.newInstance(DatablockType.class));

    }

}
