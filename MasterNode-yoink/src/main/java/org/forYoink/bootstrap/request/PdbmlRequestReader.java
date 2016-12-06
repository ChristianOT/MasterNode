package org.forYoink.bootstrap.request;

import org.springframework.batch.item.ItemReader;
import org.springframework.stereotype.Service;
import org.forYoink.api.model.bootstrap.Job;
import org.forYoink.bootstrap.jobBuilder.JobMsBuilderImpl;
import org.forYoink.database.service.reader.DbReader;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by christian on 27/10/2016.
 */
@Service
public class PdbmlRequestReader implements ItemReader<List<Job>> {

    @Resource
    private JobMsBuilderImpl jobMsBuilder;

    @Resource
    private DbReader dbReader;

    private String paramLocation = "./inputs/parameters/para-cluster.xml";

    @Override
    public List<Job> read() {
        return jobMsBuilder.buildFromMS(dbReader.read(), paramLocation);
    }

    public String getParamLocation() {
        return paramLocation;
    }

    public void setParamLocation(String paramLocation) {
        this.paramLocation = paramLocation;
    }
}
