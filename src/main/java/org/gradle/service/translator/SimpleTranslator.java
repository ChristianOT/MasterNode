package org.gradle.service.translator;

import org.gradle.domain.SimpleAtom;
import org.gradle.domain.SimpleMolecularSystem;
import org.gradle.domain.SimpleMolecule;
import org.gradle.interfaces.domain.Atom;
import org.gradle.interfaces.domain.MolecularSystem;
import org.gradle.interfaces.domain.Molecule;
import org.gradle.interfaces.pdbml.IAtomSite;
import org.gradle.interfaces.pdbml.ICartn;
import org.gradle.interfaces.pdbml.IDatablockType;
import org.gradle.forYoink.yoinkClasses.SimpleCoordFactory;
import org.springframework.stereotype.Service;
import org.wallerlab.yoink.api.model.molecular.Element;
import org.wallerlab.yoink.api.service.math.Vector;
import org.wallerlab.yoink.math.linear.SimpleVector3DFactory;

import javax.xml.bind.JAXBElement;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toSet;


@Service
public class SimpleTranslator {

    private Vector.Vector3DType myVector3D = Vector.Vector3DType.COMMONS;

    private SimpleVector3DFactory simpleVector3DFactory = new SimpleVector3DFactory(myVector3D);

    private SimpleCoordFactory simpleCoordFactory = new SimpleCoordFactory(simpleVector3DFactory);

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
                    IAtomSite atom = (IAtomSite) item.getValue().getAtomSiteCategory().getAtomSite().get(i);
                    Double x = ((ICartn) atom.getCartnX().getValue()).getValue().doubleValue();
                    Double y = ((ICartn) atom.getCartnY().getValue()).getValue().doubleValue();
                    Double z = ((ICartn) atom.getCartnZ().getValue()).getValue().doubleValue();
                    double[] coords = {x, y, z};
                    return new SimpleAtom(Integer.parseInt(atom.getId()), Element.valueOf(atom.getTypeSymbol())
                            , simpleCoordFactory.create(coords));
                })
                .collect(toSet());
    }
}

