package org.forYoink.molecular.domain;


import org.springframework.data.annotation.Id;
import org.forYoink.api.model.molecular.Atom;
import org.forYoink.api.model.molecular.Coord;
import org.forYoink.api.model.molecular.Molecule;
import org.forYoink.api.model.regionizer.Region;

import java.util.List;

public class SimpleMolecule implements Molecule {

    @Id
    public Long id;                // id for storing in database

    private int index;

    private List<Atom> atoms;

    protected Region.Name name;

    private Coord centerOfMass;

    public SimpleMolecule() {
    }

    public SimpleMolecule(int index, List<Atom> atoms) {
        this.index = index;
        this.atoms = atoms;
    }

    /**
     * get the molecular name
     */
    @Override
    public Region.Name getName() {
        return name;
    }

    /**
     * set the molecular name
     */
    @Override
    public void setName(Region.Name value) {
        this.name = value;
    }

    /**
     * get atoms in molecule
     */
    @Override
    public List<Atom> getAtoms() {
        return this.atoms;
    }

    /**
     * get molecular index in molecular system
     */
    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public Coord getCenterOfMass() {
        return this.centerOfMass;
    }

    @Override
    public void setCenterOfMass(Coord centerOfMass) {
        this.centerOfMass = centerOfMass;

    }

    @Override
    public String toString() {
        return "SimpleMolecule{" +
                "index=" + index +
                " atoms=" + atoms.size() +
                '}';
    }
}