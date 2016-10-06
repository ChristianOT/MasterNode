package org.gradle.translator

import org.gradle.pdbml.IDatablockType
import org.gradle.pdbml.v42.generated.DatablockType
import org.gradle.service.reader.PdbmlFileReader
import org.gradle.yoinkTranslator.YoinkTranslator
import org.springframework.core.io.Resource
import org.springframework.core.io.support.PathMatchingResourcePatternResolver
import org.wallerlab.yoink.api.service.math.Vector
import org.wallerlab.yoink.math.linear.SimpleVector3DFactory
import org.wallerlab.yoink.molecular.domain.SimpleCoordFactory
import spock.lang.Specification

import javax.xml.bind.JAXBContext

/**
 * Created by christian on 06/10/2016.
 */
class TestAllInOneTransl extends Specification {

    PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
    Resource[] resources = pathMatchinResolver.getResources("file:./src/test/groovy/org/gradle/reader/resources/4y1g.xml");
    def reader = new PdbmlFileReader(resources[0], JAXBContext.newInstance(org.gradle.pdbml.v42.generated.DatablockType.class))
    def idt = reader.read().getValue()
    int i = 0
    def translator = new YoinkTranslator()
    def myVector3D = new SimpleVector3DFactory()
    def simpleCoordFactory = new SimpleCoordFactory()

    def "test getCoord"() {
        expect:
        translator.getCoord(idt, i)
    }

    def "test translateToAtom"() {
        when:
        myVector3D.myVectorType = Vector.Vector3DType.COMMONS
        simpleCoordFactory.myVector3D = myVector3D
        translator.simpleCoordFactory = simpleCoordFactory
        then:
        translator.translateToAtom(idt, i)
    }

    def "test getAtoms"() {
        when:
        myVector3D.myVectorType = Vector.Vector3DType.COMMONS
        simpleCoordFactory.myVector3D = myVector3D
        translator.simpleCoordFactory = simpleCoordFactory
        then:
        translator.getAtoms(idt, i)
    }

    def "test translateToMolecule"() {
        when:
        myVector3D.myVectorType = Vector.Vector3DType.COMMONS
        simpleCoordFactory.myVector3D = myVector3D
        translator.simpleCoordFactory = simpleCoordFactory
        then:
        translator.translateToMolecule(idt, i)
    }

    def "test getMolecules"() {
        when:
        myVector3D.myVectorType = Vector.Vector3DType.COMMONS
        simpleCoordFactory.myVector3D = myVector3D
        translator.simpleCoordFactory = simpleCoordFactory
        then:
        translator.getMolecules(idt, i)
    }

    def "test translateToMolecularSystem"() {
        when:
        myVector3D.myVectorType = Vector.Vector3DType.COMMONS
        simpleCoordFactory.myVector3D = myVector3D
        translator.simpleCoordFactory = simpleCoordFactory
        then:
        translator.translateToMolecularSystem(idt, i)
    }

    def " test translate"() {
        when:
        myVector3D.myVectorType = Vector.Vector3DType.COMMONS
        simpleCoordFactory.myVector3D = myVector3D
        translator.simpleCoordFactory = simpleCoordFactory
        then:
        translator.translate(idt)
    }
}
