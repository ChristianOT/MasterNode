package org.gradle.domain;

import org.gradle.interfaces.domain.Atom;
import org.gradle.interfaces.domain.MolecularSystem;
import org.gradle.interfaces.domain.Molecule;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@NodeEntity
public class SimpleMolecularSystem implements MolecularSystem {

    @GraphId
    private Long id;

    private String nameOfSystem;

    @Relationship(type = "BELONGS_TO", direction = Relationship.UNDIRECTED)
    public Set<Molecule> molecules;

    public SimpleMolecularSystem() { }

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

    public Long getId() {
        return id;
    }

    public String getNameOfSystem() {
        return nameOfSystem;
    }

    @Override
    public String toString() {
        return "SimpleMolecularSystem{" +
                "id=" + id +
                ", nameOfSystem='" + nameOfSystem + '\'' +
                ", molecules=" + molecules +
                '}';
    }
}