package org.gradle.interfaces;

import java.util.List;
import java.util.Set;


public interface MolecularSystem {
    Set<Atom> getAtoms();

    Set<Molecule> getMolecules();
}