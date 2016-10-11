package org.gradle.forYoink.yoinkTranslator.toDelete;

import org.gradle.domain.SimpleAtom;
import org.gradle.interfaces.domain.Atom;
import org.gradle.interfaces.service.Translator;
import org.gradle.interfaces.pdbml.IAtomSite;
import org.gradle.interfaces.pdbml.ICartn;
import org.gradle.interfaces.pdbml.IDatablockType;
import org.gradle.forYoink.yoinkClasses.SimpleCoordFactory;
import org.springframework.stereotype.Service;
import org.wallerlab.yoink.api.model.molecular.Element;
import org.wallerlab.yoink.api.service.math.Vector;
import org.wallerlab.yoink.math.linear.SimpleVector3DFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class AtomTranslatorForYoink implements Translator<Set<Atom>, IDatablockType> {

    public Vector.Vector3DType myVector3D = Vector.Vector3DType.COMMONS;

    public SimpleVector3DFactory simpleVector3DFactory = new SimpleVector3DFactory(myVector3D);

    public SimpleCoordFactory coordFactory = new SimpleCoordFactory(simpleVector3DFactory);

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
        int i;
        for (i = 0; i < nAtoms; i++) {
            Atom atom = new SimpleAtom(
                    Integer.parseInt(getProperties(iDatablockType, i).get(0).toString()),
                    Element.valueOf(getProperties(iDatablockType, i).get(1).toString()),
                    coordFactory.create((double[]) getProperties(iDatablockType, i).get(2)));
            //System.out.println(atom);

            atoms.add(atom);
        }
        return atoms;
    }

    public List getProperties(IDatablockType iDatablockType, Integer i) {

        List properties = new ArrayList();

        IAtomSite atom = (IAtomSite) iDatablockType.getAtomSiteCategory().getAtomSite().get(i);
        double cx = ((ICartn)atom.getCartnX().getValue()).getValue().doubleValue();
        double cy = ((ICartn)atom.getCartnY().getValue()).getValue().doubleValue();
        double cz = ((ICartn)atom.getCartnZ().getValue()).getValue().doubleValue();
        double[] coords = {cx, cy, cz};
        String element = atom.getTypeSymbol();
        String index = atom.getId();
        properties.add(0, index);
        properties.add(1, element);
        properties.add(2, coords);

        return properties;
    }

}
