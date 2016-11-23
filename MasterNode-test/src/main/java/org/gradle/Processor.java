package org.gradle;

import org.springframework.batch.item.ItemProcessor;

/**
 * Created by christian on 17/11/2016.
 */
public class Processor implements ItemProcessor<String, String> {

    @Override
    public String process(String ent_gz_FileLocation) throws Exception {
        Runtime.getRuntime().exec("gunzip " + ent_gz_FileLocation).waitFor();
        String ent_FileLocation = ent_gz_FileLocation.split(".gz")[0];
        String pdb_FileLocation = renameToPdb(ent_FileLocation);

        // change files from pdbXXXX.ent to XXXX.pdb
        Runtime.getRuntime().exec("mv " + ent_FileLocation + " " + pdb_FileLocation).waitFor();

        return pdb_FileLocation;
    }

    public String renameToPdb(String ent_FileLocation) {
        if (ent_FileLocation.matches("(.+?)(\\.ent)$")) {
            System.out.println("Converting ent file to pdb file: " + ent_FileLocation);
            String[] array = ent_FileLocation.split(".ent")[0].split("pdb");
            String pdbName = array[array.length - 1] + ".pdb";    /* returns the last 4 chars of the Array, which is the id of the pdb file */
            return ent_FileLocation.split("/pdb[a-zA-Z0-9]")[0] + "/" + pdbName;
        } else {
            System.out.println("No .ent files in FilePath.");
            return ent_FileLocation;
        }
    }
}
