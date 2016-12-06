package org.forYoink.database.service.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Service;
import org.forYoink.api.model.molecular.MolecularSystem;

import java.util.ArrayList;
import java.util.List;

/**
 * Processor to build a job from MS and parameter input file
 *
 * Created by christian on 10/10/2016.
 */
@Service
public class DbProcessor implements ItemProcessor<List<MolecularSystem>, List<String>> {

    @Override
    public List<String> process(List<MolecularSystem> items) throws Exception {
        List<String> strings = new ArrayList<>();
        items.forEach(MS->strings.add(MS.getId()));
        return strings;
    }
}
