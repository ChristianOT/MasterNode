package org.gradle.writer

import org.gradle.service.reader.PdbmlFileReader
import org.gradle.yoinkClasses.SimpleMolecularSystem
import org.gradle.yoinkTranslator.AtomTranslatorForYoink
import org.gradle.yoinkTranslator.MolecularSystemTranslatorForYoink
import org.gradle.yoinkTranslator.MoleculeTranslatorForYoink
import org.gradle.yoinkWriter.DatabaseWriterForYoink
import org.gradle.yoinkWriter.dataBaseRepositories.MolecularSystemRepositoryForYoink
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
class TestDbWriterForYoink extends Specification{

    def "test writing molecularSystem to dataBase"() {

        PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = pathMatchinResolver.getResources("file:./src/test/groovy/org/gradle/reader/resources/4y1g.xml");
        def reader = new PdbmlFileReader(resources[0], JAXBContext.newInstance(org.gradle.pdbml.v42.generated.DatablockType.class))

        def writer = new DatabaseWriterForYoink()
        def repo = Mock(MolecularSystemRepositoryForYoink)

        def atomTranslator = new AtomTranslatorForYoink()
        def moleculeTranslator = new MoleculeTranslatorForYoink()
        def myVector3D = new SimpleVector3DFactory()
        def simpleCoordFactory = new SimpleCoordFactory()
        def msTranslator = new MolecularSystemTranslatorForYoink()

        myVector3D.myVectorType = Vector.Vector3DType.COMMONS
        simpleCoordFactory.myVector3D = myVector3D
        atomTranslator.coordFactory = simpleCoordFactory
        moleculeTranslator.atomTranslatorForYoink = atomTranslator
        msTranslator.moleculeTranslatorForYoink = moleculeTranslator

        when:
        //Writer Expects a List<> but gets Set<> from Translator !!!
        def list = new ArrayList<SimpleMolecularSystem>()
        list.addAll(msTranslator.translate(reader.read().getValue()))

        writer.msr = repo

        then:
        writer.write(list)


    }
}
