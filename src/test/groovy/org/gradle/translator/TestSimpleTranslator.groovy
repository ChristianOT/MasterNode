package org.gradle.translator

import org.gradle.interfaces.Atom
import org.gradle.interfaces.MolecularSystem
import org.gradle.interfaces.Molecule
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
    Resource[] resources = pathMatchinResolver.getResources("file:./src/test/groovy/org/gradle/reader/resources/4y1g.xml");
    def reader = new PdbmlFileReader(resources[0], JAXBContext.newInstance(org.gradle.pdbml.v42.generated.DatablockType.class))
    def translator = new SimpleTranslator()

    def "test translate to atom"() {
        expect:
        assert translator.translateToAtom(reader.read()) instanceof Set<Atom>
    }

    def "test translate to molecule"() {
        expect:
        assert translator.translateToMolecule(reader.read()) instanceof Set<Molecule>
    }

    def "test translate to molecularSystem"() {
        expect:
        assert translator.translate(reader.read()) instanceof MolecularSystem
    }
}
