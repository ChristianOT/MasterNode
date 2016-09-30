package groovy.scripts

import spock.lang.Specification

/**
 * Created by christian on 30/09/2016.
 */
class TestGroovyScripting extends Specification {


    def "test file listing"() {
        expect:
        new File('./src/main/resources/org/').eachFile { file ->
            if (file.name.endsWith(".xml"))
                println file

        }
    }


 /*   def "test file reading"() {
        expect:
        new File('./src/main/resources/org/1IDQ.xml').eachLine { line ->
            println line
        }
    }

    def "test line reading"() {
        expect:
        List lines = new File('./src/main/resources/org/1IDQ.xml').readLines()
        def string ='   xmlns:PDBx="http://pdbml.pdb.org/schema/pdbx-v40.xsd"'
        if(lines.get(3) == string) {
            println('version 40')
        }else{
            println("line 3:" + lines.get(3))
        }

    }

    def "test moving file"() {
        expect:
        File file = new File('./src/main/resources/org/5a0c.xml')
        List lines = file.readLines()
        def string ='   xmlns:PDBx="http://pdbml.pdb.org/schema/pdbx-v40.xsd"'
        if(lines.get(3) == string) {
            println('version 40')
            boolean fileMoved = file.renameTo(new File(new File('./src/main/resources/org/version_40'), file.getName()))
            println('File '+file.getName()+' moved: '+fileMoved)
        }else {
            if (lines.get(3) == '   xmlns:PDBx="http://pdbml.pdb.org/schema/pdbx-v42.xsd"') {
                println('version 42')
                boolean fileMoved = file.renameTo(new File(new File('./src/main/resources/org/version_42'), file.getName()))
                println('File ' + file.getName() + ' moved: ' + fileMoved)
            }else{
                println('Unknown version: '+lines.get(3))
            }
        }
    }*/
}