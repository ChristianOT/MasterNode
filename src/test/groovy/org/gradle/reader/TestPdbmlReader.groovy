package org.gradle.reader

import org.gradle.service.reader.PdbmlFileReader
import org.springframework.core.io.Resource
import org.springframework.core.io.support.PathMatchingResourcePatternResolver
import spock.lang.Specification

import javax.xml.bind.JAXBContext

class TestPdbmlReader extends Specification {

    PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
    Resource[] resources = pathMatchinResolver.getResources("file:./src/test/groovy/org/gradle/reader/resources/*.xml");

    def "testing read v40 PdbmlFiles"() {

        when:
        def reader = new PdbmlFileReader(resources[1]/* 5a0c */, JAXBContext.newInstance(org.gradle.pdbml.v40.generated.DatablockType.class))

        then:
        org.gradle.pdbml.v40.generated.DatablockType item = reader.read().getValue()
        println item.getAtomSiteCategory()
        println item.getAtomSiteCategory().getAtomSite()
        println item.getAtomSiteCategory().getAtomSite().get(0)
        println item.getAtomSiteCategory().getAtomSite().get(0).getTypeSymbol()
        //assert reader.read().getValue() instanceof org.gradle.pdbml.v40.generated.DatablockType
    }

    def "testing read v42 PdbmlFiles"() {

        when:
        def reader = new PdbmlFileReader(resources[0]/* 4y1g */, JAXBContext.newInstance(org.gradle.pdbml.v42.generated.DatablockType.class))

        then:
        org.gradle.pdbml.v42.generated.DatablockType item = reader.read().getValue()
        println item.getAtomSiteCategory().getAtomSite().get(0).getTypeSymbol()
        //assert reader.read().getValue() instanceof org.gradle.pdbml.v42.generated.DatablockType

    }

}
