package org.gradle.processor

import org.gradle.interfaces.MolecularSystem
import org.gradle.service.reader.PdbmlFileReader
import org.gradle.yoinkProcessor.ProcessorForYoink
import org.gradle.yoinkTranslator.AtomTranslatorForYoink
import org.gradle.yoinkTranslator.MolecularSystemTranslatorForYoink
import org.gradle.yoinkTranslator.MoleculeTranslatorForYoink
import org.springframework.core.io.Resource
import org.springframework.core.io.support.PathMatchingResourcePatternResolver
import org.wallerlab.yoink.api.service.math.Vector
import org.wallerlab.yoink.math.linear.SimpleVector3DFactory
import org.wallerlab.yoink.molecular.domain.SimpleCoordFactory
import spock.lang.Specification

import javax.xml.bind.JAXBContext

/**
 * Created by christian on 05/10/2016.
 */
class TestProcessorForYoink extends Specification {

    def "test processing JAXB<IDatablockType> to List<MolecularSystem>"() {

        PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = pathMatchinResolver.getResources("file:./src/test/groovy/org/gradle/reader/resources/4y1g.xml");
        def reader = new PdbmlFileReader(resources[0], JAXBContext.newInstance(org.gradle.pdbml.v42.generated.DatablockType.class))
        def processor = new ProcessorForYoink()
        def atomTranslator = new AtomTranslatorForYoink()
        def moleculeTranslator = new MoleculeTranslatorForYoink()
        def msTranslator = new MolecularSystemTranslatorForYoink()

        when:
        moleculeTranslator.atomTranslatorForYoink = atomTranslator
        msTranslator.moleculeTranslatorForYoink = moleculeTranslator
        processor.molecularSystemTranslatorForYoink = msTranslator

        then:
        assert processor.process(reader.read()) instanceof List<MolecularSystem>

    }
}
