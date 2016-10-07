package org.gradle.service.reader;

import org.gradle.dataBaseRepositories.MolecularSystemRepositoryForYoink;
import org.gradle.domain.SimpleMolecularSystem;
import org.springframework.batch.item.ItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by christian on 07/10/2016.
 */
@Service
public class DbReaderForYoink implements ItemReader<List<String>> {

    @Autowired
    MolecularSystemRepositoryForYoink molecularSystemRepositoryForYoink;

    @Override
    public List<String> read() throws Exception {
        List<String> mss = new ArrayList<>();
        molecularSystemRepositoryForYoink.findAll().forEach(MolecularSystem -> mss.add(MolecularSystem.getId().toString()));
        return mss;
    }

    public List<SimpleMolecularSystem> readMsFromDb() throws Exception {
        List<SimpleMolecularSystem> mss = new ArrayList<>();
        molecularSystemRepositoryForYoink.findAll().forEach(MolecularSystem -> mss.add(MolecularSystem));
        return mss;
    }

}
