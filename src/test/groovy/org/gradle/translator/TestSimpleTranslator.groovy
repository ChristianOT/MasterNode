package org.gradle.translator

import org.gradle.interfaces.domain.Atom
import org.gradle.interfaces.domain.MolecularSystem
import org.gradle.interfaces.domain.Molecule
import org.gradle.service.reader.PdbmlFileReader
import org.gradle.service.translator.SimpleTranslator
import org.springframework.core.io.Resource
import org.springframework.core.io.support.PathMatchingResourcePatternResolver
import spock.lang.Specification

import javax.xml.bind.JAXBContext

/**
 * Created by christian on 05/10/2016.
 */
class TestSimpleTranslator extends Specification {

    PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
    Resource[] resources = pathMatchinResolver.getResources("file:./src/test/groovy/org/gradle/reader/resources/*.xml");
    def readerV42 = new PdbmlFileReader(resources[0]/* Version 42: 4Y1G */, JAXBContext.newInstance(org.gradle.pdbml.v42.generated.DatablockType.class))
    def readerV40 = new PdbmlFileReader(resources[1]/* Version 40: 5A0C */, JAXBContext.newInstance(org.gradle.pdbml.v40.generated.DatablockType.class))

    def translator = new SimpleTranslator()

    def "test translate to atom"() {
        expect:
        assert translator.translateToAtom(readerV42.read()) instanceof Set<Atom>
        assert translator.translateToAtom(readerV40.read()) instanceof Set<Atom>

    }

    def "test translate to molecule"() {
        expect:
        assert translator.translateToMolecule(readerV42.read()) instanceof Set<Molecule>
        assert translator.translateToMolecule(readerV40.read()) instanceof Set<Molecule>

    }

    def "test translate to molecularSystem"() {
        expect:
        assert translator.translate(readerV42.read()) instanceof MolecularSystem
        assert translator.translate(readerV40.read()) instanceof MolecularSystem

    }
}
