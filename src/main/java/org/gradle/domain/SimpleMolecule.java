package org.gradle.domain;

import org.gradle.interfaces.Atom;
import org.gradle.interfaces.Molecule;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.wallerlab.yoink.api.model.molecular.Coord;
import org.wallerlab.yoink.api.model.regionizer.Region.Name;

import java.util.Set;

@NodeEntity
public class SimpleMolecule implements Molecule {

    @GraphId
    private Long id;

    private int index;

    @Relationship(type="ATOM",direction=Relationship.UNDIRECTED)
    public Set<Atom> atoms;
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

    @Override
    public String toString() {
        return "SimpleMolecule{" +
                "id=" + id +
                ", index=" + index +
                ", atoms=" + atoms +
                ", name=" + name +
                ", centerOfMass=" + centerOfMass +
                '}';
    }
}
