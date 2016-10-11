package org.gradle.translator.toDelete

import org.gradle.forYoink.yoinkTranslator.toDelete.YoinkTranslator
import org.gradle.service.reader.PdbmlFileReader
import org.springframework.core.io.Resource
import org.springframework.core.io.support.PathMatchingResourcePatternResolver
import spock.lang.Specification

import javax.xml.bind.JAXBContext

/**
 * Created by christian on 06/10/2016.
 */
class TestYoinkTranslator extends Specification {

    PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
    Resource[] resources = pathMatchinResolver.getResources("file:./src/test/groovy/org/gradle/reader/resources/*.xml");
    def readerV42 = new PdbmlFileReader(resources[0]/* Version 42: 4Y1G */, JAXBContext.newInstance(org.gradle.pdbml.v42.generated.DatablockType.class))
    def readerV40 = new PdbmlFileReader(resources[1]/* Version 40: 5A0C */, JAXBContext.newInstance(org.gradle.pdbml.v40.generated.DatablockType.class))

    def idtV40 = readerV40.read().getValue()
    def idtV42 = readerV42.read().getValue()
    int i = 0
    def translator = new YoinkTranslator()

    def "test getCoord"() {
        expect:
        translator.getCoord(idtV40, i)
        translator.getCoord(idtV42, i)

    }

    def "test translateToAtom"() {
        expect:
        translator.translateToAtom(idtV40, i)
        translator.translateToAtom(idtV42, i)

    }

    def "test getAtoms"() {
        expect:
        translator.getAtoms(idtV40, i)
        translator.getAtoms(idtV42, i)

    }

    def "test translateToMolecule"() {
        expect:
        translator.translateToMolecule(idtV40, i)
        translator.translateToMolecule(idtV42, i)

    }

    def "test getMolecules"() {
        expect:
        translator.getMolecules(idtV40)
        translator.getMolecules(idtV42)

    }

    def "test translateToMolecularSystem"() {
        expect:
        translator.translateToMolecularSystem(idtV40)
        translator.translateToMolecularSystem(idtV42)

    }

    def " test translate"() {
        expect:
        translator.translate(idtV40)
        translator.translate(idtV42)

    }
}
