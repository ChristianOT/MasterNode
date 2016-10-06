package org.gradle.yoinkTranslator;

import org.gradle.interfaces.Atom;
import org.gradle.interfaces.MolecularSystem;
import org.gradle.interfaces.Molecule;
import org.gradle.interfaces.Translator;
import org.gradle.pdbml.IDatablockType;
import org.gradle.pdbml.v42.generated.DatablockType;
import org.gradle.domain.SimpleAtom;
import org.gradle.domain.SimpleMolecularSystem;
import org.gradle.domain.SimpleMolecule;
import org.wallerlab.yoink.api.model.molecular.Coord;
import org.wallerlab.yoink.api.model.molecular.Element;
import org.wallerlab.yoink.api.service.Factory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by christian on 06/10/2016.
 */
public class YoinkTranslator implements Translator<MolecularSystem, IDatablockType> {

    public Factory<Coord, double[]> simpleCoordFactory;

    @Override
    public Set<MolecularSystem> translate(IDatablockType iDatablockType) {
        Set<MolecularSystem> molecularSystems = new HashSet<>();
        int n = iDatablockType.getAtomSiteCategory().getAtomSite().size();
        for (int i = 0; i < n; i++) {
            molecularSystems.add(translateToMolecularSystem(iDatablockType, i));
        }
        return molecularSystems;
    }

    public MolecularSystem translateToMolecularSystem(IDatablockType iDatablockType, int i) {
        return new SimpleMolecularSystem(iDatablockType.getDatablockName(), getMolecules(iDatablockType, i));
    }

    public Set<Molecule> getMolecules(IDatablockType iDatablockType, int i) {
        Set<Molecule> molecules = new HashSet<>();
        molecules.add(translateToMolecule(iDatablockType, i));
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
                simpleCoordFactory.create((double[]) getProperties(iDatablockType, i).get(2)));

    }

    public List getProperties(IDatablockType iDatablockType, Integer i) {
        List properties = new ArrayList();

        DatablockType dt = (DatablockType) iDatablockType;

        String index = dt.getAtomSiteCategory().getAtomSite().get(i).getId();
        String element = dt.getAtomSiteCategory().getAtomSite().get(i).getTypeSymbol();
        double[] coords = getCoord(iDatablockType, i);
        properties.add(0, index);
        properties.add(1, element);
        properties.add(2, coords);

        return properties;
    }

    public double[] getCoord(IDatablockType iDatablockType, int i) {

        DatablockType dt = (DatablockType) iDatablockType;

        double x = dt.getAtomSiteCategory().getAtomSite().get(i).getCartnX().getValue().getValue().doubleValue();
        double y = dt.getAtomSiteCategory().getAtomSite().get(i).getCartnY().getValue().getValue().doubleValue();
        double z = dt.getAtomSiteCategory().getAtomSite().get(i).getCartnZ().getValue().getValue().doubleValue();
        double[] coords = {x, y, z};
        return coords;
    }
}
