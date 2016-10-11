package org.gradle.forYoink.yoinkTranslator.toDelete;

import org.gradle.domain.SimpleAtom;
import org.gradle.domain.SimpleMolecularSystem;
import org.gradle.domain.SimpleMolecule;
import org.gradle.interfaces.domain.Atom;
import org.gradle.interfaces.domain.MolecularSystem;
import org.gradle.interfaces.domain.Molecule;
import org.gradle.interfaces.service.Translator;
import org.gradle.interfaces.pdbml.IAtomSite;
import org.gradle.interfaces.pdbml.ICartn;
import org.gradle.interfaces.pdbml.IDatablockType;
import org.springframework.stereotype.Service;
import org.wallerlab.yoink.api.model.molecular.Element;
import org.wallerlab.yoink.api.service.math.Vector;
import org.wallerlab.yoink.math.linear.SimpleVector3DFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by christian on 06/10/2016.
 */
@Service
public class YoinkTranslator implements Translator<MolecularSystem, IDatablockType> {

    public Vector.Vector3DType myVector3D = Vector.Vector3DType.COMMONS;

    public SimpleVector3DFactory simpleVector3DFactory = new SimpleVector3DFactory(myVector3D);

    public org.gradle.forYoink.yoinkClasses.SimpleCoordFactory coordFactory = new org.gradle.forYoink.yoinkClasses.SimpleCoordFactory(simpleVector3DFactory);

    @Override
    public MolecularSystem translate(IDatablockType iDatablockType) {
        MolecularSystem molecularSystems = translateToMolecularSystem(iDatablockType);
        return molecularSystems;
    }

    public MolecularSystem translateToMolecularSystem(IDatablockType iDatablockType) {
        return new SimpleMolecularSystem(iDatablockType.getDatablockName(), getMolecules(iDatablockType));
    }

    public Set<Molecule> getMolecules(IDatablockType iDatablockType) {
        Set<Molecule> molecules = new HashSet<>();
        int i;
        for (i = 0; i < iDatablockType.getAtomSiteCategory().getAtomSite().size(); i++) {
            molecules.add(translateToMolecule(iDatablockType, i));
        }
        return molecules;

    }

    public Molecule translateToMolecule(IDatablockType iDatablockType, int i) {
        return new SimpleMolecule(i, getAtoms(iDatablockType, i));
    }

    public Set<Atom> getAtoms(IDatablockType iDatablockType, int i) {
        Set<Atom> atoms = new HashSet<>();
        atoms.add(translateToAtom(iDatablockType, i));
        return atoms;

    }

    public Atom translateToAtom(IDatablockType iDatablockType, int i) {
        return new SimpleAtom(
                Integer.parseInt(getProperties(iDatablockType, i).get(0).toString()),
                Element.valueOf(getProperties(iDatablockType, i).get(1).toString()),
                coordFactory.create((double[]) getProperties(iDatablockType, i).get(2)));

    }

    public List getProperties(IDatablockType iDatablockType, Integer i) {
        List properties = new ArrayList();
        IAtomSite atom = (IAtomSite) iDatablockType.getAtomSiteCategory().getAtomSite().get(i);
        String index = atom.getId();
        String element = atom.getTypeSymbol();
        double[] coords = getCoord(iDatablockType, i);
        properties.add(0, index);
        properties.add(1, element);
        properties.add(2, coords);

        return properties;
    }

    public double[] getCoord(IDatablockType iDatablockType, int i) {
        IAtomSite atom = (IAtomSite) iDatablockType.getAtomSiteCategory().getAtomSite().get(i);
        double x = ((ICartn)atom.getCartnX().getValue()).getValue().doubleValue();
        double y = ((ICartn)atom.getCartnY().getValue()).getValue().doubleValue();
        double z = ((ICartn)atom.getCartnZ().getValue()).getValue().doubleValue();
        double[] coords = {x, y, z};
        return coords;
    }
}
