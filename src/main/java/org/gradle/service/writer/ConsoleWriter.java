package org.gradle.service.writer;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by christian on 07/10/2016.
 */
@Service
public class ConsoleWriter implements ItemWriter<List<String>> {
    @Override
    public void write(List<? extends List<String>> items) throws Exception {
        for (List<String> list : items) {
            for (String s : list)
                System.out.println(s);
        }
    }
}


