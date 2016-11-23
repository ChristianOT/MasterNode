package org.gradle;

import org.springframework.batch.item.ItemWriter;

import java.io.FileWriter;
import java.util.List;

/**
 * Created by christian on 17/11/2016.
 */
public class Writer implements ItemWriter<String> {

    @Override
    public void write(List<? extends String> items) {
        try {
            FileWriter writer = new FileWriter("output.txt");       // output file containing the new filePaths
            items.forEach(pdb_FileLocation -> {
                try {
                    writer.write(pdb_FileLocation + "\n");

                    // FOR DEVELOPMENT: Zip the files back up!
                    Process p = Runtime.getRuntime().exec("gzip " + pdb_FileLocation);
                    p.waitFor();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}