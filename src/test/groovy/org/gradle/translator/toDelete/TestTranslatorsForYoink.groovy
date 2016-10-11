package org.gradle.translator.toDelete

import org.gradle.domain.SimpleMolecularSystem
import org.gradle.service.reader.PdbmlFileReader
import org.gradle.forYoink.yoinkTranslator.toDelete.AtomTranslatorForYoink
import org.gradle.forYoink.yoinkTranslator.toDelete.MolecularSystemTranslatorForYoink
import org.gradle.forYoink.yoinkTranslator.toDelete.MoleculeTranslatorForYoink
import org.springframework.core.io.Resource
import org.springframework.core.io.support.PathMatchingResourcePatternResolver
import org.wallerlab.yoink.api.model.molecular.Atom
import org.wallerlab.yoink.api.model.molecular.Molecule
import spock.lang.Specification

import javax.xml.bind.JAXBContext

/**
 * Created by christian on 05/10/2016.
 */
class TestTranslatorsForYoink extends Specification {

    PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
    Resource[] resources = pathMatchinResolver.getResources("file:./src/test/groovy/org/gradle/reader/resources/*.xml");
    def readerV42 = new PdbmlFileReader(resources[0]/* Version 42: 4Y1G */, JAXBContext.newInstance(org.gradle.pdbml.v42.generated.DatablockType.class))
    def readerV40 = new PdbmlFileReader(resources[1]/* Version 40: 5A0C */, JAXBContext.newInstance(org.gradle.pdbml.v40.generated.DatablockType.class))

    def atomTranslator = new AtomTranslatorForYoink()
    def moleculeTranslator = new MoleculeTranslatorForYoink()
    def msTranslator = new MolecularSystemTranslatorForYoink()

    def "test translate to atom"() {
        expect:
        assert atomTranslator.translate((readerV40.read().getValue())) instanceof Set<Atom>
        assert atomTranslator.translate((readerV42.read().getValue())) instanceof Set<Atom>

    }

    def "test translate to molecule"() {
        when:
        moleculeTranslator.atomTranslatorForYoink = atomTranslator
        then:
        assert moleculeTranslator.translate(readerV40.read().getValue()) instanceof Set<Molecule>
        assert moleculeTranslator.translate(readerV42.read().getValue()) instanceof Set<Molecule>

    }

    def "test translate to molecularsystem"() {
        when:
        moleculeTranslator.atomTranslatorForYoink = atomTranslator
        msTranslator.moleculeTranslatorForYoink = moleculeTranslator
        then:
        assert msTranslator.translate(readerV40.read().getValue()) instanceof SimpleMolecularSystem
        assert msTranslator.translate(readerV42.read().getValue()) instanceof SimpleMolecularSystem

    }
}
