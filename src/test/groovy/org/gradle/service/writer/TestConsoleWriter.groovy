package org.gradle.service.writer

import org.gradle.domain.MolecularSystem
import spock.lang.Specification

/**
 * Created by christian on 07/10/2016.
 */
class TestConsoleWriter extends Specification{

    def writer = new ConsoleWriter()
    def ms = Mock(MolecularSystem)
    def jmsWriter = Mock(JmsMessageWriter)

    def "test"() {
        when:
        writer.jmsMessageWriter=jmsWriter
        ms.getId()>>1L
        then:
        writer.write([ms])
    }

}
