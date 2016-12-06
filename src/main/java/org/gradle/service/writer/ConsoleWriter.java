package org.gradle.service.writer;

import org.gradle.domain.MolecularSystem;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by christian on 07/10/2016.
 */
@Service
public class ConsoleWriter implements ItemWriter<MolecularSystem> {

    @Resource
    JmsMessageWriter jmsMessageWriter;

    @Override
    public void write(List<? extends MolecularSystem> items) throws Exception {
        for (MolecularSystem ms : items) {
            System.out.println(ms.getId());
            jmsMessageWriter.write(ms.getId().toString());
        }
    }
}


