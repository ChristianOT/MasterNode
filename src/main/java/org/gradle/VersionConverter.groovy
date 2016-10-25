package org.gradle

import org.springframework.beans.factory.annotation.Value

/**
 * Script to convert pdbml files without a version
 * into version 40 pdbml files.
 *
 * Created by christian on 25/10/2016.
 */
class VersionConverter {

    static void main(String[] args) {


        String filesLocation = "/Users/christian/IdeaProjects/MasterNode/src/main/resources/org"

        println("Converting Pdbml files to version 40...")
        new File(filesLocation).eachFile { file ->
            if (file.name.endsWith(".xml")) {
                List lines = file.readLines()
                if (lines.get(3) != '   xmlns:PDBx="http://pdbml.pdb.org/schema/pdbx-v40.xsd"') {
                    if (lines.get(3) != '   xmlns:PDBx="http://pdbml.pdb.org/schema/pdbx-v42.xsd"') {

                        println("File: " + file.getName())
                        lines.remove(1)
                        lines.add(1, "")
                        lines.add(1, '   xsi:schemaLocation="http://pdbml.pdb.org/schema/pdbx-v40.xsd pdbx-v40.xsd">')
                        lines.add(1, '   xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"')
                        lines.add(1, '   xmlns:PDBx="http://pdbml.pdb.org/schema/pdbx-v40.xsd"')
                        lines.add(1, '<PDBx:datablock datablockName="' + file.getName().split(".xml")[0].toUpperCase() + '"')
                        lines.add(1, "")

                        File newFile = new File('FileName').with {
                            ofile ->
                                file.withWriter {
                                    out ->
                                        lines.each {
                                            out.println it.toString()
                                        }
                                }
                                file
                        }
                        println "Done converting."
                    } else {
                        println "No need to convert version 42 file."
                    }

                } else {
                    println "No need to convert version 40 file."
                }
            }
        }

    }
}
