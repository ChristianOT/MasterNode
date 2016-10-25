package org.gradle.service.reader

import org.gradle.dataBaseRepositories.MolecularSystemRepository
import org.gradle.domain.MolecularSystem
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

}
