package org.forYoink.database.service.reader;

import org.springframework.batch.item.ItemReader;
import org.springframework.stereotype.Service;
import org.forYoink.api.model.molecular.MolecularSystem;
import org.forYoink.database.repositories.MolecularSystemRepositoryForYoink;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DbReader implements ItemReader<List<MolecularSystem>> {

    @Resource
    MolecularSystemRepositoryForYoink molecularSystemRepository;

    private int counter;// used to prevent multiple execution of the job

    @Override
    public List<MolecularSystem> read() {
        System.out.println("Reading files from Database");
        if (counter == 0) {
            counter++;
            return molecularSystemRepository.findAll();
        } else return null;
    }
}