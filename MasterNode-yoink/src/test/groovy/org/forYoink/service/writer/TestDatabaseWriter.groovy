package org.forYoink.service.writer

import org.forYoink.domain.SimpleMolecularSystem
import org.forYoink.repositories.MolecularSystemRepositoryForYoink
import spock.lang.Specification

/**
 * Created by christian on 19/10/2016.
 */
class TestDatabaseWriter extends Specification {

    def writer = new DatabaseWriterForYoink()
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
