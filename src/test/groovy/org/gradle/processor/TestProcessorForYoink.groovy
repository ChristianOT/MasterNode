package org.gradle.processor

import org.gradle.domain.SimpleMolecularSystem
import org.gradle.forYoink.yoinkTranslator.TranslatorFINAL
import org.gradle.service.reader.PdbmlFileReader
import org.gradle.forYoink.yoinkProcessor.ProcessorForYoink

import org.springframework.core.io.Resource
import org.springframework.core.io.support.PathMatchingResourcePatternResolver
import spock.lang.Specification

import javax.xml.bind.JAXBContext

/**
 * Created by christian on 05/10/2016.
 */
class TestProcessorForYoink extends Specification {

    def "test processing JAXB<IDatablockType> to List<MolecularSystem>"() {

        PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = pathMatchinResolver.getResources("file:./src/test/groovy/org/gradle/reader/resources/*.xml");
        def readerV42 = new PdbmlFileReader(resources[0]/* Version 42: 4Y1G */, JAXBContext.newInstance(org.gradle.pdbml.v42.generated.DatablockType.class))
        def readerV40 = new PdbmlFileReader(resources[1]/* Version 40: 5A0C */, JAXBContext.newInstance(org.gradle.pdbml.v40.generated.DatablockType.class))
        def processor = new ProcessorForYoink()
        def translator = new TranslatorFINAL()

        when:
        processor.tf = translator

        then:
        assert processor.process(readerV40.read()) instanceof SimpleMolecularSystem
        assert processor.process(readerV42.read()) instanceof SimpleMolecularSystem


    }
}
