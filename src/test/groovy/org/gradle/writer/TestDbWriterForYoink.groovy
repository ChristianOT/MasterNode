package org.gradle.writer

import org.gradle.dataBaseRepositories.MolecularSystemRepositoryForYoink
import org.gradle.domain.SimpleMolecularSystem
import org.gradle.forYoink.yoinkTranslator.TranslatorFINAL
import org.gradle.service.reader.PdbmlFileReader
import org.gradle.forYoink.yoinkTranslator.toDelete.AtomTranslatorForYoink
import org.gradle.forYoink.yoinkTranslator.toDelete.MolecularSystemTranslatorForYoink
import org.gradle.forYoink.yoinkTranslator.toDelete.MoleculeTranslatorForYoink
import org.gradle.forYoink.yoinkWriter.DatabaseWriterForYoink
import org.gradle.service.translator.SimpleTranslator
import org.springframework.core.io.Resource
import org.springframework.core.io.support.PathMatchingResourcePatternResolver
import spock.lang.Specification

import javax.xml.bind.JAXBContext

/**
 * Created by christian on 05/10/2016.
 */
class TestDbWriterForYoink extends Specification {

    PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
    Resource[] resources = pathMatchinResolver.getResources("file:./src/test/groovy/org/gradle/reader/resources/*.xml");
    def readerV42 = new PdbmlFileReader(resources[0]/* Version 42: 4Y1G */, JAXBContext.newInstance(org.gradle.pdbml.v42.generated.DatablockType.class))
    def readerV40 = new PdbmlFileReader(resources[1]/* Version 40: 5A0C */, JAXBContext.newInstance(org.gradle.pdbml.v40.generated.DatablockType.class))
    def writer = new DatabaseWriterForYoink()
    def repo = Mock(MolecularSystemRepositoryForYoink)

    def "test writing molecularSystem to dataBase"() {

        def atomTranslator = new AtomTranslatorForYoink()
        def moleculeTranslator = new MoleculeTranslatorForYoink()
        def msTranslator = new MolecularSystemTranslatorForYoink()
        moleculeTranslator.atomTranslatorForYoink = atomTranslator
        msTranslator.moleculeTranslatorForYoink = moleculeTranslator

        when:
        def list = new ArrayList<SimpleMolecularSystem>()
        list.addAll(msTranslator.translate(readerV40.read().getValue()), msTranslator.translate(readerV42.read().getValue()))
        writer.msr = repo

        then:
        writer.write(list)


    }

    def "test writing molecularSystem to db with SimpleTranslator"() {

        def st = new SimpleTranslator()
        when:
        def list = new ArrayList<SimpleMolecularSystem>()
        list.addAll(st.translate(readerV40.read()), st.translate(readerV42.read()))
        writer.msr = repo

        then:
        writer.write(list)

    }

    def "test writing molecularSystem to db with TranslatorFinal"() {

        def tf = new TranslatorFINAL()
        when:
        def list = new ArrayList<SimpleMolecularSystem>()
        list.addAll(tf.translate(readerV40.read()), tf.translate(readerV42.read()))
        writer.msr = repo

        then:
        writer.write(list)

    }
}
