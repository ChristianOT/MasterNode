package org.gradle.yoinkClasses;

import org.gradle.interfaces.Atom;
import org.gradle.interfaces.Molecule;
import org.wallerlab.yoink.api.model.molecular.Coord;
import org.wallerlab.yoink.api.model.regionizer.Region.Name;

import java.util.Set;

public class SimpleMolecule implements Molecule {
    private final int index;
    private final Set<Atom> atoms;
    protected Name name;
    private Coord centerOfMass;

    public SimpleMolecule(int index, Set<Atom> atoms) {
        this.index = index;
        this.atoms = atoms;
    }

    public Name getName() {
        return this.name;
    }

    public void setName(Name value) {
        this.name = value;
    }

    public Set<Atom> getAtoms() {
        return this.atoms;
    }

    public int getIndex() {
        return this.index;
    }

    public Coord getCenterOfMass() {
        return this.centerOfMass;
    }

    public void setCenterOfMass(Coord centerOfMass) {
        this.centerOfMass = centerOfMass;
    }
}
