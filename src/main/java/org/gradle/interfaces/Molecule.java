package org.gradle.interfaces;

import java.util.Set;

import org.wallerlab.yoink.api.model.molecular.Coord;
import org.wallerlab.yoink.api.model.regionizer.Region.Name;

public interface Molecule {
    Name getName();

    void setName(Name var1);

    Set<Atom> getAtoms();

    int getIndex();

    Coord getCenterOfMass();

    void setCenterOfMass(Coord var1);
}