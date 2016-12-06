package org.forYoink.molecular.domain;

import org.springframework.data.annotation.Id;
import org.forYoink.api.model.molecular.Atom;
import org.forYoink.api.model.molecular.MolecularSystem;
import org.forYoink.api.model.molecular.Molecule;

import java.util.*;

/**
 * the domain model for molecular system.
 * <p>
 * - added id property to allow storage inside a database
 * by using org.springframework.data
 * - added nameOfSystem property to
 * <p>
 * - added two constructors (empty and +nameOfSystem)
 *
 * @author Min Zheng
 */
public class SimpleMolecularSystem implements MolecularSystem {

    @Id
    public String id;

    private List<Molecule> molecules;

    private String nameOfSystem;

    public SimpleMolecularSystem() {
    }

    public SimpleMolecularSystem(List<Molecule> molecules) {
        this.molecules = molecules;
    }

    public SimpleMolecularSystem(String name, List<Molecule> molecules) {
        this.nameOfSystem = name;
        this.molecules = molecules;
    }

    /**
     * get all atoms in the molecular system.
     */
    @Override
    public List<Atom> getAtoms() {
        List<Atom> atoms = new ArrayList<Atom>();
        for (Molecule molecule : molecules) {
            for (Atom atom : molecule.getAtoms()) {
                atoms.add(atom);
            }
        }
        return atoms;
    }

    public String getId() {
        return id;
    }

    /**
     * get all molecules in molecular system.
     */
    @Override
    public List<Molecule> getMolecules() {
        return this.molecules;
    }

    public String getNameOfSystem() {
        return nameOfSystem;
    }

    public void setNameOfSystem(String nameOfSystem) {
        this.nameOfSystem = nameOfSystem;
    }

    @Override
    public String toString() {
        return "SimpleMolecularSystem{" +
                "id=" + id +
                ", molecules=" + molecules +
                ", nameOfSystem='" + nameOfSystem + '\'' +
                '}';
    }
}