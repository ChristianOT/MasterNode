package org.gradle

/**
 * Created by christian on 30/09/2016.
 */
class SeparationScript {

    static void main(String[] args) {

        String filesLocation = "./src/main/resources/org/";
        int numberOfv40Files = 0;
        int numberOfv42Files = 0;
        int otherFiles = 0;

        println("Separating v40 and v42 Pdbml files...")
        new File(filesLocation).eachFile { file ->
            if (file.name.endsWith(".xml")) {
                List lines = file.readLines()
                if (lines.get(3) == '   xmlns:PDBx="http://pdbml.pdb.org/schema/pdbx-v40.xsd"') {
                    println('File ' + file.getName() + ': version 40')
                    boolean fileMoved = file.renameTo(new File(new File('./src/main/resources/org/version_40'), file.getName()))
                    println('File ' + file.getName() + ' moved: ' + fileMoved)
                    numberOfv40Files++
                } else {
                    if (lines.get(3) == '   xmlns:PDBx="http://pdbml.pdb.org/schema/pdbx-v42.xsd"') {
                        println('File ' + file.getName() + ': version 42')
                        boolean fileMoved = file.renameTo(new File(new File('./src/main/resources/org/version_42'), file.getName()))
                        println('File ' + file.getName() + ' moved: ' + fileMoved)
                        numberOfv42Files++
                    } else {
                        println('Unknown version: ' + lines.get(3))
                        otherFiles++
                    }
                }
            }
        }
        println("Separation complete.")
        println("Version 40 Files: " + numberOfv40Files)
        println("Version 42 Files: " + numberOfv42Files)
        println("Other Xml Files: " + otherFiles)

    }

}