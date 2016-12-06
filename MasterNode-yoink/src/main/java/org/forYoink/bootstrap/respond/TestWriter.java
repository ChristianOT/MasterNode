package org.forYoink.bootstrap.respond;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Service;
import org.forYoink.api.model.bootstrap.Job;

import java.util.List;

/**
 * Created by christian on 28/10/2016.
 */
@Service
public class TestWriter implements ItemWriter<List<Job>> {


    @Override
    public void write(List<? extends List<Job>> items) throws Exception {
        items.forEach(Jobs -> Jobs.forEach(Job -> {
                    System.out.println("Interactionlist: " + Job.getInteractionList());
                })

        );
    }
}
