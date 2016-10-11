package org.gradle.forYoink.yoinkProcessor;

import org.gradle.domain.SimpleMolecularSystem;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by christian on 10/10/2016.
 */
@Service
public class DbProcessorForYoink implements ItemProcessor<List<SimpleMolecularSystem>, List<String>> {

    @Override
    public List<String> process(List<SimpleMolecularSystem> items) throws Exception {
        List<String> names = new ArrayList<>();
        items.forEach(SimpleMolecularSystem -> names.add(SimpleMolecularSystem.getNameOfSystem()));

        items.get(0).getMolecules();
        return names;
    }
}
