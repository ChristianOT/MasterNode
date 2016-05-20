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

@Service
public class DbReader implements ItemReader<List<String>> {

	@Autowired
	MolecularSystemRepository msr;
	
	@Override
	public List<String> read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		System.out.println("inside Reader");
		List<String> mss = new ArrayList<String>();
		for (MolecularSystem ms:msr.findAll()){
			mss.add(ms.getId().toString());
		}
		return mss;
	}
	
}
