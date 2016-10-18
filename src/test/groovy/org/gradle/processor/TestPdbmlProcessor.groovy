package org.gradle.processor

import org.gradle.service.processor.PdbmlProcessor
import org.gradle.service.translator.old.MolecularSystemTransformer
import spock.lang.Specification

import javax.xml.bind.JAXBElement

/**
 * Created by christian on 04/10/2016.
 */
class TestPdbmlProcessor extends Specification {

    def "test if process() calls mst.translate() once"() {

        def processor = new PdbmlProcessor()
        def mst = Mock(MolecularSystemTransformer)
        def jaxb = Mock(JAXBElement)

        when:
        processor.mst = mst
        processor.process(jaxb)

        then:
        1 * mst.translate(_)

    }
}
