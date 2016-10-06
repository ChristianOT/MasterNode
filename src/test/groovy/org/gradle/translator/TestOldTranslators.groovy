package org.gradle.translator

import org.gradle.domain.Atom
import org.gradle.domain.MolecularSystem
import org.gradle.domain.Molecule
import org.gradle.service.reader.PdbmlFileReader
import org.gradle.service.translator.old.AtomTranslator
import org.gradle.service.translator.old.MolecularSystemTranslator
import org.gradle.service.translator.old.MoleculeTranslator
import org.springframework.core.io.Resource
import org.springframework.core.io.support.PathMatchingResourcePatternResolver
import spock.lang.Specification

import javax.xml.bind.JAXBContext

/**
 * Created by christian on 05/10/2016.
 */
class TestOldTranslators extends Specification {

    PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
    Resource[] resources = pathMatchinResolver.getResources("file:./src/test/groovy/org/gradle/reader/resources/4y1g.xml");
    def reader = new PdbmlFileReader(resources[0], JAXBContext.newInstance(org.gradle.pdbml.v42.generated.DatablockType.class))
    def atomTranslator = new AtomTranslator()
    def moleTranslator = new MoleculeTranslator()
    def msTranslator = new MolecularSystemTranslator()


    def "test translate to atom"() {
        expect:
        assert atomTranslator.translateToAtom(reader.read()) instanceof List<Atom>
    }

    def "test translate to molecule"() {
        when:
        moleTranslator.at=atomTranslator
        then:
        assert moleTranslator.translateToMolecule(reader.read()) instanceof List<Molecule>
    }

    def "test translate to molecularSystem"() {
        when:
        moleTranslator.at=atomTranslator
        msTranslator.mt=moleTranslator
        then:
        assert msTranslator.translateToMolecularSystem(reader.read()) instanceof MolecularSystem
    }
}
