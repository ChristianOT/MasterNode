package org.gradle.service.reader;

import org.gradle.dataBaseRepositories.MolecularSystemRepository;
import org.gradle.domain.MolecularSystem;
import org.springframework.batch.item.ItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * ItemReader for reading the id of an entry in the database. For masterStep.
 *
 * @author Christian Ouali Turki
 */
@Service
public class DbReader implements ItemReader<List<String>> {

    @Autowired
    private MolecularSystemRepository msr;

    /**
     * Implemented read method from ItemReader interface.
     *
     * @return List<String> containing all ids of the database entries
     */
    @Override
    public List<String> read() throws Exception {
        List<String> mss = new ArrayList<String>();
        msr.findAll().forEach(MolecularSystem -> mss.add(MolecularSystem.getId().toString()));
        return mss;
    }

    public List<MolecularSystem> readMSfromDb() {
        List<MolecularSystem> molecularSystems = new ArrayList<>();
        msr.findAll().forEach(MolecularSystem -> molecularSystems.add(MolecularSystem));
        return molecularSystems;
    }
}
