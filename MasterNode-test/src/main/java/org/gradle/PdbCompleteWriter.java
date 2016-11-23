package org.gradle;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by christian on 23/11/2016.
 */
@Service
public class PdbCompleteWriter implements ItemWriter<String>{

    @Override
    public void write(List<? extends String> items) throws Exception {


    }
}
