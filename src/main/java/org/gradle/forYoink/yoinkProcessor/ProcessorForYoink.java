package org.gradle.forYoink.yoinkProcessor;

import org.gradle.interfaces.domain.MolecularSystem;
import org.gradle.interfaces.pdbml.IDatablockType;
import org.gradle.service.translator.SimpleTranslator;
import org.gradle.forYoink.yoinkTranslator.toDelete.MolecularSystemTranslatorForYoink;
import org.gradle.forYoink.yoinkTranslator.TranslatorFINAL;
import org.gradle.forYoink.yoinkTranslator.toDelete.YoinkTranslator;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Service;
import org.wallerlab.yoink.api.model.bootstrap.Job;
import org.wallerlab.yoink.domain.AdaptiveQMMMJob;

import javax.annotation.Resource;
import javax.xml.bind.JAXBElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by christian on 05/10/2016.
 */
@Service
public class ProcessorForYoink implements ItemProcessor<JAXBElement<IDatablockType>, MolecularSystem> {

    @Resource
    TranslatorFINAL tf;

    @Override
    public MolecularSystem process(JAXBElement<IDatablockType> item) throws Exception {
        return tf.translate(item);
    }

}
