package org.forYoink.molecular.translator

import org.forYoink.api.pdbml.IDatablockType
import org.forYoink.database.service.reader.PdbmlFileReader
import org.springframework.core.io.Resource
import org.springframework.core.io.support.PathMatchingResourcePatternResolver
import org.forYoink.api.model.molecular.Atom
import org.forYoink.api.model.molecular.MolecularSystem
import org.forYoink.api.model.molecular.Molecule
import org.forYoink.api.service.math.Vector
import org.forYoink.math.SimpleVector3DFactory
import org.forYoink.molecular.domain.SimpleCoordFactory
import spock.lang.Ignore
import spock.lang.Specification

import javax.xml.bind.JAXBContext

/**
 * Created by christian on 11/10/2016.
 */
class TestPdbmlTranslator extends Specification {

    PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
    Resource[] resources = pathMatchinResolver.getResources("file:../src/main/resources/org/*.xml");
    def readerV42 = new PdbmlFileReader(resources[0]/* Version 42: 4Y1G */, JAXBContext.newInstance(org.gradle.pdbml.v42.generated.DatablockType.class))
    def readerV40 = new PdbmlFileReader(resources[1]/* Version 40: 5A0C */, JAXBContext.newInstance(org.gradle.pdbml.v40.generated.DatablockType.class))

    def translator = new PdbmlTranslator()
    def myVector3D = new SimpleVector3DFactory()
    def coordFactory = new SimpleCoordFactory()
    int i = 0

    /**
     * Inorder to keep the hole MasterNode project as small as possible, the pdbml schema from the
     * main project was used. However, because MasterNode-yoink uses its own interfaces for IDatablockType,
     * IAtomSiteType, IAtomSite and ICartn, which are not the ones used in the pdbml files of the main project,
     * the tests writen below are failing. For the test to work, one has to implement the interfaces into the
     * generated pdbml files.
     */

    @Ignore
    def "test getProperties"() {
        when:
        def properties1 = translator.getProperties(readerV40.read().getValue() as IDatablockType, i)
        def properties2 = translator.getProperties(readerV42.read().getValue() as IDatablockType, i)

        then:
        properties1.get(0) instanceof String
        properties1.get(1) instanceof String
        properties1.get(2) instanceof double[]
        properties2.get(0) instanceof String
        properties2.get(1) instanceof String
        properties2.get(2) instanceof double[]

    }

    @Ignore
    def "test translateToAtom"() {
        when:
        myVector3D.myVectorType = Vector.Vector3DType.COMMONS
        coordFactory.myVector3D = myVector3D
        translator.coordFactory = coordFactory
        then:
        assert translator.translateToAtom(readerV40.read().getValue() as IDatablockType) instanceof List<Atom>
        assert translator.translateToAtom(readerV42.read().getValue() as IDatablockType) instanceof List<Atom>
    }

    @Ignore
    def "test translateToMolecule"() {
        when:
        myVector3D.myVectorType = Vector.Vector3DType.COMMONS
        coordFactory.myVector3D = myVector3D
        translator.coordFactory = coordFactory
        then:
        assert translator.translateToMolecule(readerV40.read().getValue() as IDatablockType) instanceof List<Molecule>
        assert translator.translateToMolecule(readerV42.read().getValue() as IDatablockType) instanceof List<Molecule>
    }

    @Ignore
    def "test translate"() {
        when:
        myVector3D.myVectorType = Vector.Vector3DType.COMMONS
        coordFactory.myVector3D = myVector3D
        translator.coordFactory = coordFactory
        then:
        assert translator.translate(readerV40.read()) instanceof MolecularSystem
        assert translator.translate(readerV42.read()) instanceof MolecularSystem
    }
}
