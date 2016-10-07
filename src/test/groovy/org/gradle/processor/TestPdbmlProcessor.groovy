package org.gradle.processor

import org.gradle.domain.MolecularSystem
import org.gradle.service.processor.PdbmlProcessor
import org.gradle.service.reader.PdbmlFileReader
import org.gradle.service.translator.old.AtomTranslator
import org.gradle.service.translator.old.MolecularSystemTranslator
import org.gradle.service.translator.old.MoleculeTranslator
import org.springframework.core.io.Resource
import org.springframework.core.io.support.PathMatchingResourcePatternResolver
import spock.lang.Specification

import javax.xml.bind.JAXBContext

/**
 * Created by christian on 04/10/2016.
 */
class TestPdbmlProcessor extends Specification{

    def "test processor"(){
        PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = pathMatchinResolver.getResources("file:./src/test/groovy/org/gradle/reader/resources/4y1g.xml");
        def reader = new PdbmlFileReader(resources[0], JAXBContext.newInstance(org.gradle.pdbml.v42.generated.DatablockType.class))
        def atomTranslator = new AtomTranslator()
        def moleTranslator = new MoleculeTranslator()
        def msTranslator = new MolecularSystemTranslator()
        def processor = new PdbmlProcessor()
        when:
        moleTranslator.at=atomTranslator
        msTranslator.mt=moleTranslator
        processor.mst = msTranslator
        then:
        assert processor.process(reader.read()) instanceof MolecularSystem
        }
}
