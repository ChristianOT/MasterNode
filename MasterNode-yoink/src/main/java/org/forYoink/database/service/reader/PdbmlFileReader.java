package org.forYoink.database.service.reader;

import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.file.ResourceAwareItemReaderItemStream;
import org.springframework.core.io.Resource;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.UnmarshalException;
import javax.xml.bind.Unmarshaller;

/**
 * ResourceAwareItemReaderItemStream for reading a pdbml file. For bootstrapStep.
 *
 * @author Christian Ouali Turki
 */
public class PdbmlFileReader implements ResourceAwareItemReaderItemStream<JAXBElement> {

    private Resource resource;

    private JAXBContext jaxbContext;

    public PdbmlFileReader() {
    }

    public PdbmlFileReader(JAXBContext jaxbContext) {
        this.jaxbContext = jaxbContext;
    }

    /* for testing */
    public PdbmlFileReader(Resource resource, JAXBContext jaxbContext) {
        this.resource = resource;
        this.jaxbContext = jaxbContext;
    }

    /*
     * Implemented read method. Dynamically reads pdbml files of both formats.
     */
    @Override
    public JAXBElement read() throws Exception {
        if (resource != null) {
            System.out.println("Reading " + resource.getFile());
            JAXBElement pdb =null;
            try {
                Unmarshaller jaxbUnmarshaller = this.jaxbContext.createUnmarshaller();
                pdb = (JAXBElement) jaxbUnmarshaller.unmarshal(resource.getInputStream());
                //resource.getFile().delete();
                resource = null; //prevents multiple reading of the same file (perhaps other reader required)
            }catch(UnmarshalException e){
                System.out.println("\n --> Incompatible pdbml version. Wrong profile selected.\n");
            }
            return pdb;
        } else {
            System.out.println("No resources to read.\n");
            return null;
        }
    }


    @Override
    public void setResource(Resource resource) {
        this.resource=resource;

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
