package org.gradle;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by christian on 17/11/2016.
 */
public class BashCommandExecutor {

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
