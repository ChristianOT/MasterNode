package org.gradle;

import org.springframework.batch.item.ItemWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Created by christian on 17/11/2016.
 */
public class Writer implements ItemWriter<String> {

    @Override
    public void write(List<? extends String> items) {

        try {
            FileWriter writer = new FileWriter("output.txt");
            items.forEach(String -> {
                try {
                    writer.write(String+"\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
