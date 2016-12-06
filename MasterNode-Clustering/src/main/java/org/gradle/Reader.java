package org.gradle;

import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.file.ResourceAwareItemReaderItemStream;
import org.springframework.core.io.Resource;

/**
 * Created by christian on 17/11/2016.
 */
public class Reader implements ResourceAwareItemReaderItemStream<String> {

    private Resource resource;

    @Override
    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public String read() {
        if (resource != null) {
            try {
                String fileLocation = resource.getURL().getPath();
                resource = null;
                return fileLocation;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } else {return null;}
    }

    @Override
    public void open(ExecutionContext executionContext) throws ItemStreamException {

    }

    @Override
    public void update(ExecutionContext executionContext) throws ItemStreamException {

    }

    @Override
    public void close() throws ItemStreamException {

    }
}
