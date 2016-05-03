package org.gradle.config;

import java.util.List;

import org.gradle.dataBaseRepositories.MyObjectRepository;
import org.gradle.domain.MyObject;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyObjectWriter implements ItemWriter<MyObject> {

	@Autowired
	MyObjectRepository mor;

	public MyObjectRepository getMor() {
		return mor;
	}

	public void setMor(MyObjectRepository mor) {
		this.mor = mor;
	}

	@Override
	public void write(List<? extends MyObject> items) throws Exception {
		mor.save(items);
	}

}
