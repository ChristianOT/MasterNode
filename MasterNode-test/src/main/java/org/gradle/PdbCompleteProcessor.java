package org.gradle;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Service;

/**
 * Created by christian on 23/11/2016.
 */
@Service
public class PdbCompleteProcessor implements ItemProcessor<String,String> {
    @Override
    public String process(String item) throws Exception {
        return null;
    }
}
