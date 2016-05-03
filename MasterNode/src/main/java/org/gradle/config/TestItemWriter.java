package org.gradle.config;

import java.util.List;

import org.gradle.dataBaseRepositories.DatablockTypeRepository;
import org.gradle.domain.DatablockType;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestItemWriter implements ItemWriter<DatablockType>{
	
	@Autowired
	DatablockTypeRepository dtr;

	@Override
	public void write(List<? extends DatablockType> items) throws Exception {
	    System.out.println("********************************** here");

	    
	    translator(items);
	    dtr.save(items);
	    
	}
	
	private void translator(List<? extends DatablockType> items){
		
		System.out.println(items.get(0).getDatablockName());
		System.out.println(items.get(0).getAtomSiteCategory().getAtomSite());
		System.out.println(items.get(0).getAtomTypeCategory().getAtomType().get(0).getSymbol());
		//System.out.println(items.get(0).getAtomSiteAnisotropCategory().getAtomSiteAnisotrop());
		//System.out.println(items.get(0).getAtomSiteAnisotropCategory().getAtomSiteAnisotrop().get(0).getId());
		//System.out.println(items.get(0).getAtomSiteAnisotropCategory().getAtomSiteAnisotrop().get(0).getTypeSymbol());
		return;
	}
	

}
