package org.gradle.yoinkWriter;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by christian on 07/10/2016.
 */
@Service
public class ConsoleWriterForYoink implements ItemWriter<List<String>> {
    @Override
    public void write(List<? extends List<String>> items) throws Exception {
        for (List<String> list : items) {
            list.forEach(String -> System.out.println(String));
        }
    }
}
