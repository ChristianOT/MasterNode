package org.gradle.yoinkTranslator;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.gradle.interfaces.Atom;
import org.gradle.pdbml.IDatablockType;
import org.gradle.pdbml.v42.generated.AtomSiteType;
import org.gradle.yoinkClasses.SimpleAtom;
import org.springframework.stereotype.Service;
import org.wallerlab.yoink.api.model.molecular.Element;
import org.wallerlab.yoink.molecular.domain.SimpleCoordFactory;
import org.gradle.interfaces.Translator;

import javax.xml.bind.JAXBElement;

@Service
public class AtomTranslatorForYoink implements Translator<Atom, IDatablockType> {

    private SimpleCoordFactory coordFactory;

    public AtomTranslatorForYoink() {
    }

    public AtomTranslatorForYoink(SimpleCoordFactory coordFactory) {
        this.coordFactory = coordFactory;
    }

    @Override
    public Set<Atom> translate(IDatablockType iDatablockType) {
        Set<Atom> atoms = new HashSet<>();
        System.out.println("number of Atoms: " + iDatablockType.getAtomSiteCategory().getAtomSite().size());

        /*
         * List<T> below specificly uses v42 AtomSiteType.AtomSite
         * Not compatible with v40!!!
         * Interface wasn't be successfully implemented
         */

        List<AtomSiteType.AtomSite> dt = iDatablockType.getAtomSiteCategory().getAtomSite();

        int nAtoms = iDatablockType.getAtomSiteCategory().getAtomSite().size();
        int i = 0;
        for (i = 0; i < nAtoms; i++) {

            Double cx = dt.get(i).getCartnX().getValue().getValue().doubleValue();
            Double cy = dt.get(i).getCartnY().getValue().getValue().doubleValue();
            Double cz = dt.get(i).getCartnZ().getValue().getValue().doubleValue();
            double[] coords = {cx, cy, cz};

            String element = dt.get(i).getTypeSymbol();
            String index = dt.get(i).getId();

            Atom atom = new SimpleAtom(Integer.parseInt(index)
                    , Element.valueOf(element), coordFactory.create(coords));

            atoms.add(atom);
        }
        return atoms;
    }

}
