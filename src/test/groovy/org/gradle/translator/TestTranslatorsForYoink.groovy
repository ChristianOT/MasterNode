package org.gradle.translator

import org.gradle.service.reader.PdbmlFileReader
import org.gradle.yoinkTranslator.AtomTranslatorForYoink
import org.gradle.yoinkTranslator.MolecularSystemTranslatorForYoink
import org.gradle.yoinkTranslator.MoleculeTranslatorForYoink
import org.springframework.core.io.Resource
import org.springframework.core.io.support.PathMatchingResourcePatternResolver
import org.wallerlab.yoink.api.model.molecular.Atom
import org.wallerlab.yoink.api.model.molecular.MolecularSystem
import org.wallerlab.yoink.api.model.molecular.Molecule
import org.wallerlab.yoink.api.service.math.Vector
import org.wallerlab.yoink.math.linear.SimpleVector3DFactory
import org.wallerlab.yoink.molecular.domain.SimpleCoordFactory
import spock.lang.Specification

import javax.xml.bind.JAXBContext

/**
 * Created by christian on 05/10/2016.
 */
class TestTranslatorsForYoink extends Specification {

    def "test translate to atom"() {

        PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = pathMatchinResolver.getResources("file:./src/test/groovy/org/gradle/reader/resources/4y1g.xml");
        def reader = new PdbmlFileReader(resources[0], JAXBContext.newInstance(org.gradle.pdbml.v42.generated.DatablockType.class))
        def myVector3D = new SimpleVector3DFactory()
        def simpleCoordFactory = new SimpleCoordFactory()

        when:
        myVector3D.myVectorType = Vector.Vector3DType.COMMONS
        simpleCoordFactory.myVector3D = myVector3D

        then:
        def translator = new AtomTranslatorForYoink(simpleCoordFactory);
        assert translator.translate((reader.read().getValue())) instanceof Set<Atom>


    }

    def "test translate to molecule"() {

        PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = pathMatchinResolver.getResources("file:./src/test/groovy/org/gradle/reader/resources/4y1g.xml");
        def reader = new PdbmlFileReader(resources[0], JAXBContext.newInstance(org.gradle.pdbml.v42.generated.DatablockType.class))
        def atomTranslator = new AtomTranslatorForYoink()
        def moleculeTranslator = new MoleculeTranslatorForYoink()
        def myVector3D = new SimpleVector3DFactory()
        def simpleCoordFactory = new SimpleCoordFactory()

        when:
        myVector3D.myVectorType = Vector.Vector3DType.COMMONS
        simpleCoordFactory.myVector3D = myVector3D
        atomTranslator.coordFactory = simpleCoordFactory
        moleculeTranslator.atomTranslatorForYoink = atomTranslator

        then:
        assert moleculeTranslator.translate(reader.read().getValue()) instanceof Set<Molecule>

    }

    def "test translate to molecularsystem"() {

        PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = pathMatchinResolver.getResources("file:./src/test/groovy/org/gradle/reader/resources/4y1g.xml");
        def reader = new PdbmlFileReader(resources[0], JAXBContext.newInstance(org.gradle.pdbml.v42.generated.DatablockType.class))
        def atomTranslator = new AtomTranslatorForYoink()
        def moleculeTranslator = new MoleculeTranslatorForYoink()
        def myVector3D = new SimpleVector3DFactory()
        def simpleCoordFactory = new SimpleCoordFactory()
        def msTranslator = new MolecularSystemTranslatorForYoink()

        when:
        myVector3D.myVectorType = Vector.Vector3DType.COMMONS
        simpleCoordFactory.myVector3D = myVector3D
        atomTranslator.coordFactory = simpleCoordFactory
        moleculeTranslator.atomTranslatorForYoink = atomTranslator
        msTranslator.moleculeTranslatorForYoink = moleculeTranslator

        then:
        assert msTranslator.translate(reader.read().getValue()) instanceof Set<MolecularSystem>

    }

}
