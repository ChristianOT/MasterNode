package org.gradle.writer

import org.gradle.dataBaseRepositories.MolecularSystemRepositoryForYoink
import org.gradle.domain.SimpleMolecularSystem
import org.gradle.service.reader.PdbmlFileReader
import org.gradle.yoinkTranslator.AtomTranslatorForYoink
import org.gradle.yoinkTranslator.MolecularSystemTranslatorForYoink
import org.gradle.yoinkTranslator.MoleculeTranslatorForYoink
import org.gradle.yoinkWriter.DatabaseWriterForYoink
import org.springframework.core.io.Resource
import org.springframework.core.io.support.PathMatchingResourcePatternResolver
import spock.lang.Specification

import javax.xml.bind.JAXBContext

/**
 * Created by christian on 05/10/2016.
 */
class TestDbWriterForYoink extends Specification{

    def "test writing molecularSystem to dataBase"() {

        PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = pathMatchinResolver.getResources("file:./src/test/groovy/org/gradle/reader/resources/4y1g.xml");
        def reader = new PdbmlFileReader(resources[0], JAXBContext.newInstance(org.gradle.pdbml.v42.generated.DatablockType.class))
        def writer = new DatabaseWriterForYoink()
        def repo = Mock(MolecularSystemRepositoryForYoink)
        def atomTranslator = new AtomTranslatorForYoink()
        def moleculeTranslator = new MoleculeTranslatorForYoink()
        def msTranslator = new MolecularSystemTranslatorForYoink()
        moleculeTranslator.atomTranslatorForYoink = atomTranslator
        msTranslator.moleculeTranslatorForYoink = moleculeTranslator

        when:
        //Writer Expects a List<> but gets Set<> from Translator !!!
        def list = new ArrayList<SimpleMolecularSystem>()
        list.addAll(msTranslator.translate(reader.read().getValue()))
        writer.msr = repo

        then:
        writer.write(list)


    }
}
