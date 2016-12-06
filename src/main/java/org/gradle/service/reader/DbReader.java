package org.gradle.service.reader;

import org.gradle.dataBaseRepositories.MolecularSystemRepository;
import org.gradle.domain.MolecularSystem;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
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
public class DbReader implements ItemReader<MolecularSystem> {

    @Autowired
    private MolecularSystemRepository msr;

    @Override
    public MolecularSystem read() throws Exception {
        List<MolecularSystem> mss = new ArrayList<MolecularSystem>();
        msr.findAll().forEach(mss::add);
        return mss.get(0);
    }

    // UNUSED, except for testing
    public List<MolecularSystem> readMSfromDb() {
        List<MolecularSystem> molecularSystems = new ArrayList<>();
        msr.findAll().forEach(molecularSystems::add);
        return molecularSystems;
    }
}
