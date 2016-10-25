package org.gradle.service.writer

import org.gradle.dataBaseRepositories.MolecularSystemRepository
import org.gradle.domain.MolecularSystem
import spock.lang.Specification

/**
 * Created by christian on 05/10/2016.
 */
class TestDatabaseWriter extends Specification {

    def writer = new DatabaseWriter()
    def repo = Mock(MolecularSystemRepository)
    def item = Mock(MolecularSystem)

    def "test writing to db"() {

        when:
        writer.msr = repo
        writer.write([item])

        then:
        1 * repo.save(_)
    }
}
