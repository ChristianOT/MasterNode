package org.forYoink.service.reader

import org.springframework.core.io.Resource
import org.springframework.core.io.support.PathMatchingResourcePatternResolver
import spock.lang.Specification

import javax.xml.bind.JAXBContext

class TestPdbmlReader extends Specification {

    PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
    Resource[] resources = pathMatchinResolver.getResources("file:./src/test/groovy/org/forYoink/service/reader/resources/*.xml");

    def "testing read v40 PdbmlFiles"() {

        when:
        def reader = new PdbmlFileReader(resources[1]/* 5a0c */, JAXBContext.newInstance(org.forYoink.pdbml.v40.generated.DatablockType.class))

        then:
        assert reader.read().getValue() instanceof org.forYoink.pdbml.v40.generated.DatablockType
    }

    def "testing read v42 PdbmlFiles"() {

        when:
        def reader = new PdbmlFileReader(resources[0]/* 4y1g */, JAXBContext.newInstance(org.forYoink.pdbml.v42.generated.DatablockType.class))

        then:
        assert reader.read().getValue() instanceof org.forYoink.pdbml.v42.generated.DatablockType

    }

}
