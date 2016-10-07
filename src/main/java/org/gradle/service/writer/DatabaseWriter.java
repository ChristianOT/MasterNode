package org.gradle.service.writer;

import org.gradle.dataBaseRepositories.MolecularSystemRepository;
import org.gradle.domain.MolecularSystem;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ItemWriter for saving a MolecularSystem into the database. For bootstrapStep.
 *
 * @author Christian Ouali Turki
 */
@Service
public class DatabaseWriter implements ItemWriter<MolecularSystem>{

	@Autowired
	MolecularSystemRepository msr;
	
	@Override
	public void write(List<? extends MolecularSystem> items) throws Exception {
		for (MolecularSystem ms:items){
			System.out.println("Saving " + ms.getNameOfSystem() + " in database.");
			msr.save(ms);
			
		}
		System.out.println("Done saving files.");
	}

}