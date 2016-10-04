package org.gradle.service.translator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

import org.gradle.domain.Atom;
import org.gradle.domain.MolecularSystem;
import org.gradle.domain.Molecule;
import org.gradle.pdbml.IDatablockType;
import org.gradle.pdbml.v42.generated.AtomSiteType;
import org.springframework.stereotype.Service;

import org.gradle.pdbml.IAtomSiteType;

import static java.util.stream.Collectors.toSet;

import javax.xml.bind.JAXBElement;


@Service
public class AtomTranslatorV42 {

    public MolecularSystem translate(JAXBElement<IDatablockType> item) {
        System.out.println("FORTYorFORTYTwo " + item.getDeclaredType());
        Set<Molecule> molecules = translateToMolecule(item);
        return new MolecularSystem(item.getValue().getDatablockName(), molecules);
    }

    public Set<Molecule> translateToMolecule(JAXBElement<IDatablockType> item) {
        Integer solventCounter = 0;
        Integer singleAtomCounter = 0;
        Set<Atom> atoms = translateToAtom(item);
        Set<Molecule> molecules = new HashSet<>();
        Molecule molecule = new Molecule("test", atoms);
        molecules.add(molecule);
        return molecules;
    }

    public Set<Atom> translateToAtom(JAXBElement<IDatablockType> item) {
        return IntStream.range(0, item.getValue().getAtomSiteCategory().getAtomSite().size())
                .mapToObj(i -> {
                    AtomSiteType.AtomSite atom = (AtomSiteType.AtomSite) item.getValue().getAtomSiteCategory().getAtomSite().get(i);
                    Double x = atom.getCartnX().getValue().getValue().doubleValue();
                    Double y = atom.getCartnY().getValue().getValue().doubleValue();
                    Double z = atom.getCartnZ().getValue().getValue().doubleValue();
                    return new Atom(atom.getTypeSymbol(), x, y, z, atom.getLabelCompId(), atom.getGroupPDB().getValue().toString(), atom.getTypeSymbol());
                })
                .collect(toSet());
    }
}

