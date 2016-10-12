package org.gradle.translator

import org.gradle.forYoink.yoinkTranslator.TranslatorFINAL
import org.gradle.interfaces.domain.Atom
import org.gradle.interfaces.domain.MolecularSystem
import org.gradle.interfaces.domain.Molecule
import org.gradle.service.reader.PdbmlFileReader
import org.springframework.core.io.Resource
import org.springframework.core.io.support.PathMatchingResourcePatternResolver
import spock.lang.Specification

import javax.xml.bind.JAXBContext

/**
 * Created by christian on 11/10/2016.
 */
class TestTranslatorFINAL extends Specification {

    PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
    Resource[] resources = pathMatchinResolver.getResources("file:./src/test/groovy/org/gradle/reader/resources/*.xml");
    def readerV42 = new PdbmlFileReader(resources[0]/* Version 42: 4Y1G */, JAXBContext.newInstance(org.gradle.pdbml.v42.generated.DatablockType.class))
    def readerV40 = new PdbmlFileReader(resources[1]/* Version 40: 5A0C */, JAXBContext.newInstance(org.gradle.pdbml.v40.generated.DatablockType.class))

    def translator = new TranslatorFINAL()
    int i = 0

    def "test getProperties"() {
        when:
        def properties1 = translator.getProperties(readerV40.read().getValue(), i)
        def properties2 = translator.getProperties(readerV42.read().getValue(), i)

        then:
        properties1.get(0) instanceof String
        properties1.get(1) instanceof String
        properties1.get(2) instanceof double[]
        properties2.get(0) instanceof String
        properties2.get(1) instanceof String
        properties2.get(2) instanceof double[]

    }

    def "test translateToAtom"() {
        expect:
        assert translator.translateToAtom(readerV40.read().getValue()) instanceof Set<Atom>
        assert translator.translateToAtom(readerV42.read().getValue()) instanceof Set<Atom>
    }

    def "test translateToMolecule"() {
        expect:
        assert translator.translateToMolecule(readerV40.read().getValue()) instanceof Set<Molecule>
        assert translator.translateToMolecule(readerV42.read().getValue()) instanceof Set<Molecule>
    }

    def "test translate"() {
        expect:
        assert translator.translate(readerV40.read()) instanceof MolecularSystem
        assert translator.translate(readerV42.read()) instanceof MolecularSystem
    }
}
