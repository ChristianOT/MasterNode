package org.gradle.service.processor;

import org.gradle.domain.MolecularSystem;
import org.gradle.interfaces.pdbml.IDatablockType;
import org.gradle.service.translator.old.MolecularSystemTransformer;
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
public class PdbmlProcessor implements ItemProcessor<JAXBElement, MolecularSystem> {

    @Resource
    public MolecularSystemTransformer mst;

    @Override
    public MolecularSystem process(JAXBElement item) throws Exception {
        return mst.translate(item);

    }

}
