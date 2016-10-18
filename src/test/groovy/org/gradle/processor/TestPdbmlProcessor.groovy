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
import javax.xml.bind.JAXBElement

/**
 * Created by christian on 04/10/2016.
 */
class TestPdbmlProcessor extends Specification {

    def "test if process() calls mst.translate() once"() {

        def processor = new PdbmlProcessor()
        def mst = Mock(MolecularSystemTranslator)
        def jaxb = Mock(JAXBElement)

        when:
        processor.mst = mst
        processor.process(jaxb)

        then:
        1 * mst.translate(_)

    }
}
