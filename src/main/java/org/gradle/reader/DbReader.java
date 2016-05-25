package org.gradle.reader;

import java.util.ArrayList;
import java.util.List;

import org.gradle.dataBaseRepositories.MolecularSystemRepository;
import org.gradle.domain.MolecularSystem;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ItemReader for reading the id of an entry in the database. For masterStep.
 *
 * @author Christian Ouali Turki
 */
@Service
public class DbReader implements ItemReader<List<String>> {

	@Autowired
	MolecularSystemRepository msr;
	
	/**
	 * Implemented read method from ItemReader interface.
	 * 
	 * @return List<String> containing all ids of the database entries
	 */
	@Override
	public List<String> read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		//for testing System.out.println("inside Reader");
		List<String> mss = new ArrayList<String>();
		for (MolecularSystem ms:msr.findAll()){
			mss.add(ms.getId().toString());
		}
		return mss;
	}
	
}
