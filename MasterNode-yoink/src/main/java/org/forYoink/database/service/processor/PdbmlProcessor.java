package org.forYoink.database.service.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Service;
import org.forYoink.api.model.molecular.MolecularSystem;
import org.forYoink.api.pdbml.IDatablockType;
import org.forYoink.molecular.translator.PdbmlTranslator;

import javax.annotation.Resource;
import javax.xml.bind.JAXBElement;

@Service
public class PdbmlProcessor implements ItemProcessor<JAXBElement<IDatablockType>, MolecularSystem> {

    @Resource
    PdbmlTranslator tf;

    @Override
    public MolecularSystem process(JAXBElement<IDatablockType> item) throws Exception {
        return tf.translate(item);
    }
}
