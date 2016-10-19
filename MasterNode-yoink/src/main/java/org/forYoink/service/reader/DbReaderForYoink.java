package org.forYoink.service.reader;

import org.forYoink.repositories.MolecularSystemRepositoryForYoink;
import org.springframework.batch.item.ItemReader;
import org.springframework.stereotype.Service;
import org.wallerlab.yoink.api.model.molecular.MolecularSystem;
import org.forYoink.domain.SimpleMolecularSystem;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by christian on 07/10/2016.
 */
@Service
public class DbReaderForYoink implements ItemReader<List<MolecularSystem>> {

    @Resource
    private MolecularSystemRepositoryForYoink molecularSystemRepositoryForYoink;

    @Override
    public List<MolecularSystem> read() throws Exception {
        List<MolecularSystem> mss = new ArrayList<>();

        try {
            System.out.println("Reading files from Database");
            molecularSystemRepositoryForYoink.findAll().forEach(MolecularSystem -> mss.add(MolecularSystem));
            molecularSystemRepositoryForYoink = null;
            return mss;
        } catch (NullPointerException e) {
            System.out.println("Repository is set to null: " + e);
            return null;

        }

    }

    public List<SimpleMolecularSystem> readMsFromDb() throws Exception {
        List<SimpleMolecularSystem> mss = new ArrayList<>();
        molecularSystemRepositoryForYoink.findAll().forEach(MolecularSystem -> mss.add(MolecularSystem));
        return mss;
    }

}
