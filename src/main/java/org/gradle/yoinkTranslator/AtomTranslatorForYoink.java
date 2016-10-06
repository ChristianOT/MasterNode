package org.gradle.yoinkTranslator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.gradle.interfaces.Atom;
import org.gradle.pdbml.IDatablockType;
import org.gradle.pdbml.v42.generated.AtomSiteType;
import org.gradle.pdbml.v42.generated.DatablockType;
import org.gradle.yoinkClasses.SimpleAtom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wallerlab.yoink.api.model.molecular.Coord;
import org.wallerlab.yoink.api.model.molecular.Element;
import org.wallerlab.yoink.api.service.Factory;
import org.wallerlab.yoink.molecular.domain.SimpleCoordFactory;
import org.gradle.interfaces.Translator;
import org.wallerlab.yoink.molecular.service.translator.MolecularSystemTranslator;

import javax.annotation.Resource;
import javax.xml.bind.JAXBElement;

@Service
public class AtomTranslatorForYoink implements Translator<Atom, IDatablockType> {


    public Factory<Coord, double[]> coordFactory= new SimpleCoordFactory();

    public AtomTranslatorForYoink() {
    }

    public AtomTranslatorForYoink(SimpleCoordFactory coordFactory) {
        this.coordFactory = coordFactory;
    }

    @Override
    public Set<Atom> translate(IDatablockType iDatablockType) {

        Set<Atom> atoms = new HashSet<>();
        System.out.println("number of Atoms: " + iDatablockType.getAtomSiteCategory().getAtomSite().size());
        int nAtoms = iDatablockType.getAtomSiteCategory().getAtomSite().size();
        int i = 0;
        for (i = 0; i < nAtoms; i++) {
            Atom atom = new SimpleAtom(
                    Integer.parseInt(getProperties(iDatablockType, i).get(0).toString()),
                    Element.valueOf(getProperties(iDatablockType, i).get(1).toString()),
                    coordFactory.create((double[]) getProperties(iDatablockType, i).get(2)));
            System.out.println(atom);

            atoms.add(atom);
        }
        return atoms;
    }


    /*
        * Function below specificly uses v42 AtomSiteType.AtomSite
        * Not compatible with v40!!!
        * Interface wasn't successfully implemented
        */
    public List getProperties(IDatablockType iDatablockType, Integer i) {

        List properties = new ArrayList();

        DatablockType dt = (DatablockType) iDatablockType;
        Double cx = dt.getAtomSiteCategory().getAtomSite().get(i).getCartnX().getValue().getValue().doubleValue();
        Double cy = dt.getAtomSiteCategory().getAtomSite().get(i).getCartnY().getValue().getValue().doubleValue();
        Double cz = dt.getAtomSiteCategory().getAtomSite().get(i).getCartnZ().getValue().getValue().doubleValue();
        double[] coords = {cx, cy, cz};
        String element = dt.getAtomSiteCategory().getAtomSite().get(i).getTypeSymbol();
        String index = dt.getAtomSiteCategory().getAtomSite().get(i).getId();
        properties.add(0, index);
        properties.add(1, element);
        properties.add(2, coords);

        return properties;
    }

}
