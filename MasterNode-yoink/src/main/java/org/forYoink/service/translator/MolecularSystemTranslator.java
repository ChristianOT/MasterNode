package org.forYoink.service.translator;

import org.forYoink.interfaces.pdbml.IAtomSite;
import org.forYoink.interfaces.pdbml.ICartn;
import org.forYoink.interfaces.pdbml.IDatablockType;
import org.forYoink.yoinkClasses.SimpleCoordFactory;
import org.springframework.stereotype.Service;
import org.wallerlab.yoink.api.model.molecular.Atom;
import org.wallerlab.yoink.api.model.molecular.Element;
import org.wallerlab.yoink.api.model.molecular.MolecularSystem;
import org.wallerlab.yoink.api.model.molecular.Molecule;
import org.wallerlab.yoink.api.service.math.Vector;
import org.wallerlab.yoink.api.service.molecular.Translator;
import org.wallerlab.yoink.math.linear.SimpleVector3DFactory;
import org.forYoink.domain.SimpleAtom;
import org.forYoink.domain.SimpleMolecularSystem;
import org.forYoink.domain.SimpleMolecule;

import javax.xml.bind.JAXBElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by christian on 11/10/2016.
 */
@Service
public class MolecularSystemTranslator implements Translator<MolecularSystem, JAXBElement<IDatablockType>> {

    private Vector.Vector3DType myVector3D = Vector.Vector3DType.COMMONS;

    private SimpleVector3DFactory simpleVector3DFactory = new SimpleVector3DFactory(myVector3D);

    private SimpleCoordFactory coordFactory = new SimpleCoordFactory(simpleVector3DFactory);

    private int moleculeCounter = 0;

    @Override
    public MolecularSystem translate(JAXBElement<IDatablockType> item) {
        return new SimpleMolecularSystem(item.getValue().getDatablockName(), translateToMolecule(item.getValue()));
    }

    public List<Molecule> translateToMolecule(IDatablockType item) {
        moleculeCounter++;
        List<Molecule> molecules = new ArrayList<>();
        Molecule molecule = new SimpleMolecule(moleculeCounter, translateToAtom(item));
        molecules.add(molecule);
        return molecules;

    }

    public List<Atom> translateToAtom(IDatablockType iDatablockType) {

        List<Atom> atoms = new ArrayList<>();
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
        String index = atom.getId();
        double cx = ((ICartn) atom.getCartnX().getValue()).getValue().doubleValue();
        double cy = ((ICartn) atom.getCartnY().getValue()).getValue().doubleValue();
        double cz = ((ICartn) atom.getCartnZ().getValue()).getValue().doubleValue();
        double[] coords = {cx, cy, cz};
        String element = atom.getTypeSymbol();
        properties.add(0, index);
        properties.add(1, element);
        properties.add(2, coords);
        return properties;
    }
}
