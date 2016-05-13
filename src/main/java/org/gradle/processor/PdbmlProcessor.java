package org.gradle.processor;

import org.gradle.domain.MolecularSystem;
import org.gradle.interfaces.DatablockTypeInterface;
import org.gradle.pdbml.v40.generated.DatablockType;
import org.gradle.translator.MolecularSystemTranslatorV40;
import org.gradle.translator.MolecularSystemTranslatorV42;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Service;

@Service
public class PdbmlProcessor implements ItemProcessor<DatablockTypeInterface, MolecularSystem>{

	@Override
	public MolecularSystem process(DatablockTypeInterface item) throws Exception {
		if(item.getClass() == DatablockType.class){
		MolecularSystemTranslatorV40 mV40 = new MolecularSystemTranslatorV40();
		return mV40.translateToMolecularSystem((org.gradle.pdbml.v40.generated.DatablockType)item);
		}else{
		MolecularSystemTranslatorV42 mV42 = new MolecularSystemTranslatorV42();
		return mV42.translateToMolecularSystem((org.gradle.pdbml.v42.generated.DatablockType)item);
		}
	}

}
