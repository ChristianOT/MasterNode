package org.gradle.processor

import org.gradle.domain.SimpleMolecularSystem
import org.gradle.forYoink.yoinkTranslator.TranslatorFINAL
import org.gradle.interfaces.service.Translator
import org.gradle.service.reader.PdbmlFileReader
import org.gradle.forYoink.yoinkProcessor.ProcessorForYoink

import org.springframework.core.io.Resource
import org.springframework.core.io.support.PathMatchingResourcePatternResolver
import spock.lang.Specification

import javax.xml.bind.JAXBContext
import javax.xml.bind.JAXBElement

/**
 * Created by christian on 05/10/2016.
 */
class TestProcessorForYoink extends Specification {

    def "test if process() calls tf.translate() once "() {

        def processor = new ProcessorForYoink()
        def tf = Mock(TranslatorFINAL)
        def jaxb = Mock(JAXBElement)
        when:
        processor.tf = tf
        processor.process(jaxb)
        then:
        1 * tf.translate(_)

    }
}
