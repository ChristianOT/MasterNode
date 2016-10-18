package forYoink.yoinkProcessor;

import forYoink.interfaces.IDatablockType;
import forYoink.yoinkTranslator.MolecularSystemTranslator;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Service;
import org.wallerlab.yoink.api.model.molecular.MolecularSystem;


import javax.annotation.Resource;
import javax.xml.bind.JAXBElement;

/**
 * Created by christian on 05/10/2016.
 */
@Service
public class ProcessorForYoink implements ItemProcessor<JAXBElement<IDatablockType>, MolecularSystem> {

    @Resource
    private MolecularSystemTranslator molecularSystemTranslator;

    @Override
    public MolecularSystem process(JAXBElement<IDatablockType> item) throws Exception {
        return molecularSystemTranslator.translate(item);
    }

}
