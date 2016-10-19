package org.forYoink.service.writer;

import org.forYoink.repositories.MolecularSystemRepositoryForYoink;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.forYoink.domain.SimpleMolecularSystem;

import java.util.List;

/**
 * Expects a List<> but gets Set<> from Translator !!!
 * <p>
 * Created by christian on 05/10/2016.
 */
@Service
public class DatabaseWriterForYoink implements ItemWriter<SimpleMolecularSystem> {

    @Autowired
    private MolecularSystemRepositoryForYoink msr;

    @Override
    public void write(List<? extends SimpleMolecularSystem> items) throws Exception {
        for (SimpleMolecularSystem ms : items) {
            System.out.println("Saving " + ms + " in database.");
            msr.save(ms);
        }

        System.out.println("Done saving files.");

    }

}
