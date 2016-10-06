package org.gradle.translator

import org.gradle.interfaces.Atom
import org.gradle.interfaces.MolecularSystem
import org.gradle.interfaces.Molecule
import org.gradle.service.reader.PdbmlFileReader
import org.gradle.service.translator.SimpleTranslator
import org.springframework.core.io.Resource
import org.springframework.core.io.support.PathMatchingResourcePatternResolver
import org.wallerlab.yoink.api.service.math.Vector
import org.wallerlab.yoink.math.linear.SimpleVector3DFactory
import org.wallerlab.yoink.molecular.domain.SimpleCoordFactory
import spock.lang.Specification

import javax.xml.bind.JAXBContext

/**
 * Created by christian on 05/10/2016.
 */
class TestSimpleTranslator extends Specification{


    def "test translate to atom"() {

        PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = pathMatchinResolver.getResources("file:./src/test/groovy/org/gradle/reader/resources/4y1g.xml");
        def reader = new PdbmlFileReader(resources[0], JAXBContext.newInstance(org.gradle.pdbml.v42.generated.DatablockType.class))

        def myVector3D = new SimpleVector3DFactory()
        def simpleCoordFactory = new SimpleCoordFactory()
        def translator = new SimpleTranslator()

        when:
        myVector3D.myVectorType = Vector.Vector3DType.COMMONS
        simpleCoordFactory.myVector3D = myVector3D
        translator.coordFactory = simpleCoordFactory

        then:
        assert translator.translateToAtom(reader.read()) instanceof Set<Atom>

    }


    def "test translate to molecule"() {

        PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = pathMatchinResolver.getResources("file:./src/test/groovy/org/gradle/reader/resources/4y1g.xml");
        def reader = new PdbmlFileReader(resources[0], JAXBContext.newInstance(org.gradle.pdbml.v42.generated.DatablockType.class))

        def myVector3D = new SimpleVector3DFactory()
        def simpleCoordFactory = new SimpleCoordFactory()
        def translator = new SimpleTranslator()

        when:
        myVector3D.myVectorType = Vector.Vector3DType.COMMONS
        simpleCoordFactory.myVector3D = myVector3D
        translator.coordFactory = simpleCoordFactory

        then:
        assert translator.translateToMolecule(reader.read()) instanceof Set<Molecule>

    }


    def "test translate to molecularSystem"() {

        PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = pathMatchinResolver.getResources("file:./src/test/groovy/org/gradle/reader/resources/4y1g.xml");
        def reader = new PdbmlFileReader(resources[0], JAXBContext.newInstance(org.gradle.pdbml.v42.generated.DatablockType.class))

        def myVector3D = new SimpleVector3DFactory()
        def simpleCoordFactory = new SimpleCoordFactory()
        def translator = new SimpleTranslator()

        when:
        myVector3D.myVectorType = Vector.Vector3DType.COMMONS
        simpleCoordFactory.myVector3D = myVector3D
        translator.coordFactory = simpleCoordFactory

        then:
        assert translator.translate(reader.read()) instanceof MolecularSystem

    }
}
