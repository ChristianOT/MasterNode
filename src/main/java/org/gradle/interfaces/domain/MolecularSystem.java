package org.gradle.interfaces.domain;

import java.util.Set;


public interface MolecularSystem {
    Set<Atom> getAtoms();

    Set<Molecule> getMolecules();
}