package org.gradle.writer

import org.gradle.dataBaseRepositories.MolecularSystemRepository
import org.gradle.domain.MolecularSystem
import org.gradle.service.reader.PdbmlFileReader
import org.gradle.service.translator.old.AtomTranslator
import org.gradle.service.translator.old.MolecularSystemTranslator
import org.gradle.service.translator.old.MoleculeTranslator
import org.gradle.service.writer.DatabaseWriter
import org.springframework.core.io.Resource
import org.springframework.core.io.support.PathMatchingResourcePatternResolver
import spock.lang.Specification

import javax.xml.bind.JAXBContext

/**
 * Created by christian on 05/10/2016.
 */
class TestDatabaseWriter extends Specification{

    def "test writing to db"() {

        PathMatchingResourcePatternResolver pathMatchinResolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = pathMatchinResolver.getResources("file:./src/test/groovy/org/gradle/reader/resources/4y1g.xml");
        def reader = new PdbmlFileReader(resources[0], JAXBContext.newInstance(org.gradle.pdbml.v42.generated.DatablockType.class))

        def atomTranslator = new AtomTranslator()
        def moleTranslator = new MoleculeTranslator()
        def msTranslator = new MolecularSystemTranslator()
        def writer = new DatabaseWriter()
        def list = new ArrayList<MolecularSystem>()

        def repo = Mock(MolecularSystemRepository)

        when:
        moleTranslator.at=atomTranslator
        msTranslator.mt=moleTranslator
        list.add(msTranslator.translateToMolecularSystem(reader.read()))
        writer.msr = repo

        then:
        writer.write(list)

    }
}
