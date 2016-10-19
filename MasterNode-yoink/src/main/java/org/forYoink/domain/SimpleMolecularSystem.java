package org.forYoink.domain;


import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.wallerlab.yoink.api.model.molecular.Atom;
import org.wallerlab.yoink.api.model.molecular.MolecularSystem;
import org.wallerlab.yoink.api.model.molecular.Molecule;

import java.util.*;

@NodeEntity
public class SimpleMolecularSystem implements MolecularSystem {

    @GraphId
    private Long id;

    private String nameOfSystem;

    @Relationship(type = "BELONGS_TO", direction = Relationship.UNDIRECTED)
    private List<Molecule> molecules;

    public SimpleMolecularSystem() { }

    public SimpleMolecularSystem(String nameOfSystem, List<Molecule> molecules) {
        this.nameOfSystem = nameOfSystem;
        this.molecules = molecules;
    }

    public List<Atom> getAtoms() {
        List<Atom> atoms = new ArrayList<>();
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

    public List<Molecule> getMolecules() {
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