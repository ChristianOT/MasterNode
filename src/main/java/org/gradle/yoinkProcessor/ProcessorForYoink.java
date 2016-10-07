package org.gradle.yoinkProcessor;

import org.gradle.interfaces.MolecularSystem;
import org.gradle.pdbml.IDatablockType;
import org.gradle.yoinkTranslator.MolecularSystemTranslatorForYoink;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by christian on 05/10/2016.
 */
@Service
public class ProcessorForYoink implements ItemProcessor<JAXBElement<IDatablockType>, MolecularSystem> {

    @Autowired
    MolecularSystemTranslatorForYoink molecularSystemTranslatorForYoink;

    private List<MolecularSystem> list = new ArrayList<MolecularSystem>();

    @Override
    public MolecularSystem process(JAXBElement<IDatablockType> item) throws Exception {
        return molecularSystemTranslatorForYoink.translate(item.getValue());
    }
}
