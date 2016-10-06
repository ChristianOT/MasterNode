package org.gradle.yoinkClasses;

import org.gradle.interfaces.Atom;
import org.gradle.interfaces.MolecularSystem;
import org.gradle.interfaces.Molecule;

import java.util.*;

public class SimpleMolecularSystem implements MolecularSystem {

    private String nameOfSystem;
    private final Set<Molecule> molecules;

    public SimpleMolecularSystem(String nameOfSystem, Set<Molecule> molecules) {
        this.nameOfSystem = nameOfSystem;
        this.molecules = molecules;
    }

    public Set<Atom> getAtoms() {
        HashSet atoms = new HashSet();
        Iterator var2 = this.molecules.iterator();

        while (var2.hasNext()) {
            Molecule molecule = (Molecule) var2.next();
            Iterator var4 = molecule.getAtoms().iterator();

            while (var4.hasNext()) {
                Atom atom = (Atom) var4.next();
                atoms.add(atom);
            }
        }

        return atoms;
    }

    public Set<Molecule> getMolecules() {
        return this.molecules;
    }
}