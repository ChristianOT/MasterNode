package org.forYoink.database.service.writer;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Service;
import org.forYoink.api.model.molecular.MolecularSystem;
import org.forYoink.molecular.domain.SimpleMolecularSystem;
import org.forYoink.database.repositories.MolecularSystemRepositoryForYoink;

import javax.annotation.Resource;
import java.util.List;

/**
 * Expects a List<> but gets Set<> from Translator !!!
 * <p>
 * Created by christian on 05/10/2016.
 */
@Service
public class DatabaseWriter implements ItemWriter<MolecularSystem> {

    @Resource
    MolecularSystemRepositoryForYoink msr;

    @Override
    public void write(List<? extends MolecularSystem> item) throws Exception {

        for (MolecularSystem ms : item) {
            System.out.println("\nNumber of MS in Repository; " + msr.count());
            System.out.println("Saving MS: " + msr.save((SimpleMolecularSystem) ms));
        }
        System.out.println("Number of MS in Repository: " + msr.count() + "\n");

    }

}
