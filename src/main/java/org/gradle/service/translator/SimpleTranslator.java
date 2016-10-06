package org.gradle.service.translator;

import java.util.HashSet;
import java.util.Set;
import java.util.Set;
import java.util.stream.IntStream;

import org.gradle.interfaces.Atom;
import org.gradle.interfaces.MolecularSystem;
import org.gradle.interfaces.Molecule;
import org.gradle.pdbml.IAtomSiteType;
import org.gradle.yoinkClasses.SimpleAtom;
import org.gradle.yoinkClasses.SimpleMolecularSystem;
import org.gradle.yoinkClasses.SimpleMolecule;

import org.gradle.pdbml.IDatablockType;
import org.gradle.pdbml.v42.generated.AtomSiteType;
import org.springframework.stereotype.Service;
import org.wallerlab.yoink.api.model.molecular.Coord;
import org.wallerlab.yoink.api.model.molecular.Element;
import org.wallerlab.yoink.api.service.Factory;
import org.wallerlab.yoink.molecular.domain.SimpleCoordFactory;


import static java.util.stream.Collectors.toSet;

import javax.annotation.Resource;
import javax.xml.bind.JAXBElement;


@Service
public class SimpleTranslator {

    private Factory<Coord,double[]> coordFactory;

    public MolecularSystem translate(JAXBElement<IDatablockType> item) {
        System.out.println("FORTYorFORTYTwo " + item.getDeclaredType());
        Set<Molecule> molecules = translateToMolecule(item);
        return new SimpleMolecularSystem(item.getValue().getDatablockName(), molecules);
    }

    public Set<Molecule> translateToMolecule(JAXBElement<IDatablockType> item) {
        Integer solventCounter = 0;
        Integer singleAtomCounter = 0;
        Set<Atom> atoms = translateToAtom(item);
        Set<Molecule> molecules = new HashSet<>();
        Molecule molecule = new SimpleMolecule(1, atoms);
        molecules.add(molecule);
        return molecules;
    }

    public Set<Atom> translateToAtom(JAXBElement<IDatablockType> item) {
        return IntStream.range(0, item.getValue().getAtomSiteCategory().getAtomSite().size())
                .mapToObj(i -> {
                    AtomSiteType.AtomSite atom = (AtomSiteType.AtomSite)item.getValue().getAtomSiteCategory().getAtomSite().get(i);
                    Double x = atom.getCartnX().getValue().getValue().doubleValue();
                    Double y = atom.getCartnY().getValue().getValue().doubleValue();
                    Double z = atom.getCartnZ().getValue().getValue().doubleValue();
                    double[] coords = {x, y, z};
                    return new SimpleAtom(Integer.parseInt(atom.getId()), Element.valueOf(atom.getTypeSymbol()), coordFactory.create(coords));
                })
                .collect(toSet());
    }
}

