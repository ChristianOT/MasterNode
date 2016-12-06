package org.forYoink.database.service.writer

import org.forYoink.molecular.domain.SimpleMolecularSystem
import org.forYoink.database.repositories.MolecularSystemRepositoryForYoink
import spock.lang.Specification

/**
 * Created by christian on 19/10/2016.
 */
class TestDatabaseWriter extends Specification {

    def writer = new DatabaseWriter()
    def repo = Mock(MolecularSystemRepositoryForYoink)
    def item = Mock(SimpleMolecularSystem)

    def "test write to database"() {
        when:
        writer.msr=repo
        writer.write([item])

        then:
        1 * repo.save(item)

    }
}
