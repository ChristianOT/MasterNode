package org.gradle;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by christian on 22/11/2016.
 */
@Service
public class PdbProcessor implements ItemProcessor<String, String> {

    @Override
    public String process(String pdb_gz_FileLocation) throws Exception {

        /** Unzip original pdb files */
        Runtime.getRuntime().exec("gunzip " + pdb_gz_FileLocation).waitFor();
        String pdb_FileLocation = pdb_gz_FileLocation.split(".gz")[0];

        /**
         * NON GENERIC
         */
        String fileName = pdb_FileLocation.split("/02/")[pdb_FileLocation.split("/02/").length - 1];    // if not separated from path, _complete.pdb will be overwritten!
        String fileFolder = "./input/02/";
        /**
         *
         */

        String cmd = "phenix.python ~/MyProject/qr-core/run_clusteringigt push.py " + fileName + " > " + fileName +".txt";
        printToConsole(executeOnShell(cmd, new File(fileFolder)));

        /** Zip original pdb files */
        Runtime.getRuntime().exec("gzip " + pdb_FileLocation).waitFor();

        if (pdb_FileLocation.matches("(.+?)(\\.pdb)$")) {
            pdb_FileLocation = pdb_FileLocation.split(".pdb")[0] + "_complete.pdb";
            return pdb_FileLocation;
        } else {
            System.out.println("No .pdb file in FilePath!");
            return null;
        }

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
        try {
            process.waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
        while (br.readLine() != null) {
            //CAUTION: br.readLine() MAY RETURN NULL BEFORE ALL LINES ARE PRINTED!
            System.out.println(br.readLine());
        }
    }

}
