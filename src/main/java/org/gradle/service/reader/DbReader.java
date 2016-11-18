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
        List<Long> mss = new ArrayList<Long>();
        msr.findAll().forEach(MolecularSystem -> mss.add(MolecularSystem.getId()));
        MolecularSystem ms = msr.findOne(mss.get(0));
        mss.remove(0);
        return ms;
    }

    public List<MolecularSystem> readMSfromDb() {
        List<MolecularSystem> molecularSystems = new ArrayList<>();
        msr.findAll().forEach(MolecularSystem -> molecularSystems.add(MolecularSystem));
        return molecularSystems;
    }
}
