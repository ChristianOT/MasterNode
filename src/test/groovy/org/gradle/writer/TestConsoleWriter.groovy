package org.gradle.writer

import org.gradle.service.writer.ConsoleWriter
import org.gradle.forYoink.yoinkWriter.ConsoleWriterForYoink
import spock.lang.Specification

/**
 * Created by christian on 07/10/2016.
 */
class TestConsoleWriter extends Specification{

    List<String> list = new ArrayList<String>()
    ArrayList lust = new ArrayList<List<String>>()

    def "test"() {
        def writer = new ConsoleWriter()
        when:
        list.add("hello")
        list.add("world")
        lust.add(list)
        then:
        writer.write(lust)
    }

    def "test consoleWriterForYoink"(){
        def writer = new ConsoleWriterForYoink()
        when:
        list.add("hello")
        list.add("world")
        lust.add(list)
        then:
        writer.write(lust)
    }
}
