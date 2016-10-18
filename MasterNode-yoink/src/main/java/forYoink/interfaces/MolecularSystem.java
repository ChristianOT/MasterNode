package forYoink.interfaces;

import java.util.Set;


public interface MolecularSystem {
    Set<Atom> getAtoms();

    Set<Molecule> getMolecules();
}