package org.gradle.service.processor;

import org.gradle.domain.MolecularSystem;
import org.gradle.pdbml.IDatablockType;
import org.gradle.pdbml.v40.generated.DatablockType;
//import org.gradle.service.translator.MolecularSystemTranslatorV40;
//import org.gradle.service.translator.MolecularSystemTranslatorV42;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

/**
 * ItemProcessor for translating DatablockType objects into the domain models.
 *
 * @author Christian Ouali Turki
 */
@Service
public class PdbmlProcessor implements ItemProcessor<JAXBElement<IDatablockType>, MolecularSystem> {

	@Override
	public MolecularSystem process(JAXBElement<IDatablockType> item) throws Exception {
		if (item.getValue().getClass() == DatablockType.class) {
			System.out.println("inside processor");
			//MolecularSystemTranslatorV40 mV40 = new MolecularSystemTranslatorV40();
			return null; // V40.translateToMolecularSystem((org.gradle.pdbml.v40.generated.DatablockType) item);
		} else { return null;}
			//MolecularSystemTranslatorV42 mV42 = new MolecularSystemTranslatorV42();
			//return mV42.translateToMolecularSystem((org.gradle.pdbml.v42.generated.DatablockType) item);
		//}
	}

}
