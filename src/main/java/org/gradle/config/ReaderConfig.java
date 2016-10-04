package org.gradle.config;

import org.gradle.pdbml.IDatablockType;
import org.gradle.pdbml.v40.generated.ReflnSysAbsType;
import org.gradle.reader.PdbmlFileReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.Resource;

/**
 * Created by christian on 04/10/2016.
 */
@Configuration
public class ReaderConfig {

    @Profile("forty")
    @Bean
    public PdbmlFileReader v40(Resource resource,org.gradle.pdbml.v40.generated.DatablockType datablockType){
        return new PdbmlFileReader(resource, datablockType);
    }

    @Profile("fortyTwo")
    @Bean
    public PdbmlFileReader v42(Resource resource,org.gradle.pdbml.v42.generated.DatablockType datablockType){
        return new PdbmlFileReader(resource, datablockType);
    }
}
