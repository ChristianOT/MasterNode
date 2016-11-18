package org.gradle.service.translator.old;

import org.gradle.domain.MolecularSystem;
import org.gradle.domain.Molecule;
import org.gradle.interfaces.pdbml.IDatablockType;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.xml.bind.JAXBElement;
import java.util.List;

@Service
public class MolecularSystemTranslator {

    @Resource
    public MoleculeTranslator moleculeTranslator;

    public MolecularSystem translate(JAXBElement item) {
        List<Molecule> molecules = moleculeTranslator.translate((JAXBElement<IDatablockType>) item);
        int numOfAtoms = 0;
        MolecularSystem molecularSystem = new MolecularSystem();
        for (int i = 0; i < molecules.size(); i++) {
            molecularSystem.setNameOfSystem(getMoleculeName(molecules.get(0)));
            molecularSystem.setNumberOfMolecules(molecules.size());
            numOfAtoms = numOfAtoms + molecules.get(i).atomCount;
            molecularSystem.setNumberOfAtoms(numOfAtoms);
            molecularSystem.molecules.add(molecules.get(i));
        }
        return molecularSystem;
    }

    public String getMoleculeName(Molecule molecule) {
        return molecule.getFileName().substring(0, 4);
    }

}
