package org.gradle.service.processor;

import org.gradle.domain.MolecularSystem;
import org.gradle.pdbml.IDatablockType;
import org.gradle.pdbml.v40.generated.DatablockType;
//import org.gradle.service.translator.MolecularSystemTranslatorForYoink;
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
            return null;
        } else {
            return null;
        }

    }

}
