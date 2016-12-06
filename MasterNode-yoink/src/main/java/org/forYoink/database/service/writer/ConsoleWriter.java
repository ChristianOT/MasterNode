package org.forYoink.database.service.writer;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsoleWriter implements ItemWriter<List<String>> {

    public void write(List<? extends List<String>> items) throws Exception {
        for (List<String> list : items) {
            System.out.println("Files inside Database: ");
            list.forEach(String -> System.out.println(String));
        }
        System.out.println("Done writing files");
    }
}
