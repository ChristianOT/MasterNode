package org.gradle.config;

import java.util.List;

import org.gradle.dataBaseRepositories.DatablockTypeRepository;
import org.gradle.domain.DatablockType;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PdbWriter implements ItemWriter<DatablockType>{

	@Autowired
	DatablockTypeRepository dtr;

	@Override
	public void write(List<? extends DatablockType> items) throws Exception {
		System.out.println("here");
		System.out.println(items.get(0).getDatablockName());
		dtr.save(items);
	}

}
