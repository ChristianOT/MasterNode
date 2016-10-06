package org.gradle.service.processor;

import org.gradle.domain.MolecularSystem;
import org.gradle.pdbml.IDatablockType;
import org.gradle.pdbml.v42.generated.DatablockType;
import org.gradle.service.translator.old.MolecularSystemTranslator;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.xml.bind.JAXBElement;

/**
 * ItemProcessor for translating DatablockType objects into the domain models.
 *
 * @author Christian Ouali Turki
 */
@Service
public class PdbmlProcessor implements ItemProcessor<JAXBElement<IDatablockType>, MolecularSystem> {

    @Resource
    public MolecularSystemTranslator mst;

    @Override
    public MolecularSystem process(JAXBElement<IDatablockType> item) throws Exception {
        if (item.getValue().getClass() == DatablockType.class) {
            System.out.println("inside processor");
            return mst.translateToMolecularSystem(item);
        } else {
            return null;
        }

    }

}
