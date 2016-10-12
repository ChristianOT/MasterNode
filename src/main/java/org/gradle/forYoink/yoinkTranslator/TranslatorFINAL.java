package org.gradle.forYoink.yoinkTranslator;

import org.gradle.domain.SimpleAtom;
import org.gradle.domain.SimpleMolecularSystem;
import org.gradle.domain.SimpleMolecule;
import org.gradle.forYoink.yoinkClasses.SimpleCoordFactory;
import org.gradle.interfaces.domain.Atom;
import org.gradle.interfaces.domain.MolecularSystem;
import org.gradle.interfaces.domain.Molecule;
import org.gradle.interfaces.pdbml.IAtomSite;
import org.gradle.interfaces.pdbml.ICartn;
import org.gradle.interfaces.pdbml.IDatablockType;
import org.gradle.interfaces.service.Translator;
import org.springframework.stereotype.Service;
import org.wallerlab.yoink.api.model.molecular.Element;
import org.wallerlab.yoink.api.service.math.Vector;
import org.wallerlab.yoink.math.linear.SimpleVector3DFactory;

import javax.xml.bind.JAXBElement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by christian on 11/10/2016.
 */
@Service
public class TranslatorFINAL implements Translator<MolecularSystem, JAXBElement<IDatablockType>> {

    public Vector.Vector3DType myVector3D = Vector.Vector3DType.COMMONS;

    public SimpleVector3DFactory simpleVector3DFactory = new SimpleVector3DFactory(myVector3D);

    public SimpleCoordFactory coordFactory = new SimpleCoordFactory(simpleVector3DFactory);

    private int moleculeCounter = 0;

    @Override
    public MolecularSystem translate(JAXBElement<IDatablockType> item) {
        return new SimpleMolecularSystem(item.getValue().getDatablockName(), translateToMolecule(item.getValue()));
    }

    public Set<Molecule> translateToMolecule(IDatablockType item) {
        moleculeCounter++;
        Set<Molecule> molecules = new HashSet<>();
        Molecule molecule = new SimpleMolecule(moleculeCounter, translateToAtom(item));
        molecules.add(molecule);
        return molecules;

    }

    public Set<Atom> translateToAtom(IDatablockType iDatablockType) {

        Set<Atom> atoms = new HashSet<>();
        System.out.println("number of Atoms: " + iDatablockType.getAtomSiteCategory().getAtomSite().size());
        int nAtoms = iDatablockType.getAtomSiteCategory().getAtomSite().size();
        int i;
        for (i = 0; i < nAtoms; i++) {
            Atom atom = new SimpleAtom(
                    Integer.parseInt(getProperties(iDatablockType, i).get(0).toString()),
                    Element.valueOf(getProperties(iDatablockType, i).get(1).toString()),
                    coordFactory.create((double[]) getProperties(iDatablockType, i).get(2)));
            atoms.add(atom);
        }
        return atoms;
    }

    public List getProperties(IDatablockType iDatablockType, Integer i) {
        List properties = new ArrayList();
        IAtomSite atom = (IAtomSite) iDatablockType.getAtomSiteCategory().getAtomSite().get(i);
        double cx = ((ICartn) atom.getCartnX().getValue()).getValue().doubleValue();
        double cy = ((ICartn) atom.getCartnY().getValue()).getValue().doubleValue();
        double cz = ((ICartn) atom.getCartnZ().getValue()).getValue().doubleValue();
        double[] coords = {cx, cy, cz};
        String element = atom.getTypeSymbol();
        String index = atom.getId();
        properties.add(0, index);
        properties.add(1, element);
        properties.add(2, coords);
        return properties;
    }
}
