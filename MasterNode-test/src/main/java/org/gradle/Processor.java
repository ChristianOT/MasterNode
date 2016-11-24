package org.gradle;

import org.springframework.batch.item.ItemProcessor;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This Processor is supposed to get the Location of a zipped pdb file (name i.e. pdb100d.ent.gz)
 * from the Reader and process following steps:
 * - get copy of your local ent.gz file
 * - unzip the ent.gz file
 * - convert i.e. pdb100d.ent into 100d.pdb
 * - run python script run_finalise.py with pdb file
 * - run python scrpit run_clustering.py with pbd file; NOTE: run_finalise.py must be executed here first,
 *   if executed inside the run_clustering.py, the fileName_complete.pdb file can not be found!!!
 *   There for the execution of run_finalise.py inside run_clustering.py was removed.
 * - write the results of run_finalise.py and run_clustering.py into ouput/fileName.txt files and
 * Created by christian on 17/11/2016.
 */
public class Processor implements ItemProcessor<String, String> {

    @Override
    public String process(String ent_gz_FileLocation) throws Exception {

        ent_gz_FileLocation = copyEntGzFile(ent_gz_FileLocation);

        Runtime.getRuntime().exec("gunzip " + ent_gz_FileLocation).waitFor();
        String ent_FileLocation = ent_gz_FileLocation.split(".gz")[0];
        String pdb_FileLocation = renameToPdb(ent_FileLocation);

        // change files from pdbXXXX.ent to XXXX.pdb
        Runtime.getRuntime().exec("mv " + ent_FileLocation + " " + pdb_FileLocation);

        String path = clustering(finalize(pdb_FileLocation));

        // clean up; NOTE: only delete files, no folder!
        printToConsole(executeOnShell("rm *", new File("./input/")));

        return path;
    }

    /**
     * Get a copy of the downloaded zipped .ent file into the input folder.
     * @param ent_gz_FileLocation
     * @return newEnt_gz_FileLocation
     */
    public String copyEntGzFile(String ent_gz_FileLocation) {
        try {
            printToConsole(executeOnShell("cp " + ent_gz_FileLocation + " ./input", new File(("."))));
        } catch (Exception e) {
            e.printStackTrace();
        }
        String newEnt_gz_FileLocation = "./input/" + ent_gz_FileLocation.split("/pdb/../")[ent_gz_FileLocation.split("/pdb/../").length - 1];
        return newEnt_gz_FileLocation;

    }

    /**
     * Convert the pdbXXXX..ent file into XXXX.pdb file
     * @param ent_FileLocation
     * @return pdb_FileLocation
     */
    public String renameToPdb(String ent_FileLocation) {
        System.out.println("Converting ent file to pdb file: " + ent_FileLocation);
        String[] array = ent_FileLocation.split(".ent")[0].split("pdb");
        String pdbName = array[array.length - 1] + ".pdb";    /* returns the last 4 chars of the Array, which is the id of the pdb file */
        return ent_FileLocation.split("/pdb[a-zA-Z0-9]")[0] + "/" + pdbName;
    }

    /**
     * Execute phenix.python run_finalise.py with the pdb file to add missing atom, such as hydrogen.
     * If failure occurs, move pdb file into failed_finalise folder.
     * Returns the location of the pdb_complete file.
     * @throws IOException
     * @param pdb_FileLocation
     * @return pdb_complete_FileLocation
     */
    public String finalize(String pdb_FileLocation) {

        String fileName = pdb_FileLocation.split("/input/")[pdb_FileLocation.split("/input/").length - 1];    // if not separated from path, _complete.pdb will be overwritten!
        String fileFolder = "./input";

        String cmd = "phenix.python ~/MyProject/qr-core/run_finalise.py " + fileName + " > ../output/finalise_" + fileName + ".txt";
        try {
            printToConsole(executeOnShell(cmd, new File(fileFolder)));
            /** To Do: if it can't find fileName_updated.pdb, move fileName.pdb into failed_finalise folder! */
        } catch (IOException e) {
            e.printStackTrace();
        }
        String pdb_complete_FileLocation = pdb_FileLocation.split(".pdb")[0] + "_complete.pdb";
        return pdb_complete_FileLocation;
    }

    /**
     * Execute phenix.python run_clustering with pdb file.
     * Returns the location of the pdb file. (will be written into processed_files.txt)
     * @throws IOException
     * @param pdb_complete_FileLocation
     * @return pdb_FileLocation
     */
    public String clustering(String pdb_complete_FileLocation) {
        String fileName = pdb_complete_FileLocation.split("/input/")[pdb_complete_FileLocation.split("/input/").length - 1];
        String fileFolder = "./input";

        String cmd = "phenix.python ~/MyProject/qr-core/run_clustering.py " + fileName + " > ../output/clustering_" + fileName + ".txt";
        try {
            printToConsole(executeOnShell(cmd, new File(fileFolder)));
            /** To Do: if it can't find fileName_complete.pdb, move fileName.pdb into failed_clustering folder! */
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pdb_complete_FileLocation.split("_complete.pdb")[0] + ".pdb";
    }


    /**
     * Method for executing shell commands in JVM
     *
     * @param command
     * @param workingDir: Location where the shell commands should be executed
     * @return process
     * @throws IOException
     */
    private static Process executeOnShell(String command, File workingDir) throws IOException {
        Process process = new ProcessBuilder(addShellPrefix(command))
                .directory(workingDir)
                .redirectErrorStream(true)
                .start();
        return process;
    }


    /**
     * Adding prefix to the command. Necessary for 'source <fileName>' command.
     *
     * @param command
     * @return commandArray
     */
    private static String[] addShellPrefix(String command) {
        String[] commandArray = new String[3];
        commandArray[0] = "bash";
        commandArray[1] = "-c";
        commandArray[2] = command;
        return commandArray;
    }


    public static void printToConsole(Process process) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
        while (br.readLine() != null) {
            //CAUTION: br.readLine() MAY RETURN NULL BEFORE ALL LINES ARE PRINTED!
            System.out.println(br.readLine());
        }
    }
}
