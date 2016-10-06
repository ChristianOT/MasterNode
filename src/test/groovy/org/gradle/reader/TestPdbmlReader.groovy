package org.gradle.reader

import org.gradle.service.reader.PdbmlFileReader
import org.springframework.core.io.Resource
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import spock.lang.Specification

import javax.xml.bind.JAXBContext

class TestPdbmlReader extends Specification {

    def "testing read v40 PdbmlFiles"() {

        PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = pathMatchinResolver.getResources("file:./src/test/groovy/org/gradle/reader/resources/5a0c.xml");

        when:
        def reader = new PdbmlFileReader(resources[0], JAXBContext.newInstance(org.gradle.pdbml.v40.generated.DatablockType.class))

        then:
        assert reader.read().getValue() instanceof org.gradle.pdbml.v40.generated.DatablockType

    }

    def "testing read v42 PdbmlFiles"() {

        PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = pathMatchinResolver.getResources("file:./src/test/groovy/org/gradle/reader/resources/4y1g.xml");

        when:
        def reader = new PdbmlFileReader(resources[0], JAXBContext.newInstance(org.gradle.pdbml.v42.generated.DatablockType.class))

        then:
        assert reader.read().getValue() instanceof org.gradle.pdbml.v42.generated.DatablockType

    }

}
