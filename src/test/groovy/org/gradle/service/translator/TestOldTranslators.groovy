package org.gradle.service.translator

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
    Resource[] resources = pathMatchinResolver.getResources("file:./src/test/groovy/org/gradle/service/reader/resources/*.xml");
    def readerV42 = new PdbmlFileReader(resources[0]/* Version 42: 4Y1G */, JAXBContext.newInstance(org.gradle.pdbml.v42.generated.DatablockType.class))
    def readerV40 = new PdbmlFileReader(resources[1]/* Version 40: 5A0C */, JAXBContext.newInstance(org.gradle.pdbml.v40.generated.DatablockType.class))
    def atomTranslator = new AtomTranslator()
    def moleTranslator = new MoleculeTranslator()
    def msTranslator = new MolecularSystemTranslator()


    def "test translate to atom"() {
        expect:
        assert atomTranslator.translate(readerV40.read()) instanceof List<Atom>
        assert atomTranslator.translate(readerV42.read()) instanceof List<Atom>

    }

    def "test translate to molecule"() {
        when:
        moleTranslator.atomTranslator=atomTranslator
        then:
        assert moleTranslator.translate(readerV40.read()) instanceof List<Molecule>
        assert moleTranslator.translate(readerV42.read()) instanceof List<Molecule>

    }

    def "test translate to molecularSystem"() {
        when:
        moleTranslator.atomTranslator=atomTranslator
        msTranslator.moleculeTranslator=moleTranslator
        then:
        assert msTranslator.translate(readerV40.read()) instanceof MolecularSystem
        assert msTranslator.translate(readerV42.read()) instanceof MolecularSystem

    }
}
