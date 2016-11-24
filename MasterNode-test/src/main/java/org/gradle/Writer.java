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
            FileWriter writer = new FileWriter("processed_files.txt");       // output file containing the processed files
            items.forEach(processed_files -> {
                try {
                    writer.write(processed_files + "\n");
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