package org.gradle.reader

import org.gradle.dataBaseRepositories.MolecularSystemRepository
import org.gradle.dataBaseRepositories.MolecularSystemRepositoryForYoink
import org.gradle.domain.MolecularSystem
import org.gradle.domain.SimpleMolecularSystem
import org.gradle.service.reader.DbReader
import org.gradle.forYoink.yoinkReader.DbReaderForYoink
import spock.lang.Ignore
import spock.lang.Specification

/**
 * Created by christian on 07/10/2016.
 */
class TestDbReader extends Specification {

    def "testing reading Id from database"() {

        def reader = new DbReader()
        def repo = Mock(MolecularSystemRepository)
        def MoleSys = new MolecularSystem()
        ArrayList<MolecularSystem> items = new ArrayList<>()

        when:
        MoleSys.id=1
        items.add(MoleSys)
        repo.findAll()>>items
        reader.msr = repo

        then:
        assert reader.read() instanceof List<String>
    }

    def " testing reading Ms from database"() {

        def reader = new DbReader()
        def repo = Mock(MolecularSystemRepository)
        def MoleSys = new MolecularSystem()
        ArrayList<MolecularSystem> items = new ArrayList<>()

        when:
        MoleSys.id=1
        items.add(MoleSys)
        repo.findAll()>>items
        reader.msr = repo

        then:
        assert reader.readMSfromDb() instanceof List<MolecularSystem>
        println reader.readMSfromDb()

    }

    def "testing reading Id from yoink database"() {

        def reader = new DbReaderForYoink()
        def repo = Mock(MolecularSystemRepositoryForYoink)
        def MoleSys = new SimpleMolecularSystem()
        def MoleSys2 = new SimpleMolecularSystem()
        def MoleSys3 = new SimpleMolecularSystem()

        ArrayList<SimpleMolecularSystem> items = new ArrayList<>()

        when:
        MoleSys.id=255
        MoleSys2.id=66
        MoleSys3.id=349621

        items.add(MoleSys)
        items.add(MoleSys2)
        items.add(MoleSys3)

        repo.findAll()>>items
        reader.molecularSystemRepositoryForYoink = repo

        then:
        assert reader.read() instanceof List<String>
    }

    def "testing reading Ms from yoink database"() {

        def reader = new DbReaderForYoink()
        def repo = Mock(MolecularSystemRepositoryForYoink)
        def MoleSys = new SimpleMolecularSystem()
        def MoleSys2 = new SimpleMolecularSystem()
        def MoleSys3 = new SimpleMolecularSystem()

        ArrayList<SimpleMolecularSystem> items = new ArrayList<>()

        when:
        MoleSys.id=255
        MoleSys2.id=66
        MoleSys3.id=349621

        items.add(MoleSys)
        items.add(MoleSys2)
        items.add(MoleSys3)

        repo.findAll()>>items
        reader.molecularSystemRepositoryForYoink = repo

        then:
        assert reader.readMsFromDb() instanceof List<SimpleMolecularSystem>
        println reader.readMsFromDb()
    }
}
