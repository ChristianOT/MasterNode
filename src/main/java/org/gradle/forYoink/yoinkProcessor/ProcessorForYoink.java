package org.gradle.forYoink.yoinkProcessor;

import org.gradle.forYoink.yoinkTranslator.TranslatorFINAL;
import org.gradle.interfaces.domain.MolecularSystem;
import org.gradle.interfaces.pdbml.IDatablockType;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.xml.bind.JAXBElement;

/**
 * Created by christian on 05/10/2016.
 */
@Service
public class ProcessorForYoink implements ItemProcessor<JAXBElement<IDatablockType>, MolecularSystem> {

    @Resource
    private TranslatorFINAL tf;

    @Override
    public MolecularSystem process(JAXBElement<IDatablockType> item) throws Exception {
        return tf.translate(item);
    }

}
