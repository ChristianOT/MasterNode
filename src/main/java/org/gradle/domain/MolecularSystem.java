package org.gradle.domain;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public class MolecularSystem {

	@GraphId
	private Long id;
	
	private String nameOfSystem;
	public Integer numberOfMolecules;
	public Integer numberOfAtoms;
	public Set<Molecule> molecules = new HashSet<Molecule>();

	public String getNameOfSystem() {
		return nameOfSystem;
	}

	public void setNameOfSystem(String nameOfSystem) {
		this.nameOfSystem = nameOfSystem;
	}

	public Integer getNumberOfMolecules() {
		return numberOfMolecules;
	}

	public void setNumberOfMolecules(Integer numberOfMolecules) {
		this.numberOfMolecules = numberOfMolecules;
	}

	public Integer getNumberOfAtoms() {
		return numberOfAtoms;
	}

	public void setNumberOfAtoms(Integer numberOfAtoms) {
		this.numberOfAtoms = numberOfAtoms;
	}

	public Set<Molecule> getMolecules() {
		return molecules;
	}

	public void setMolecules(Set<Molecule> molecules) {
		this.molecules = molecules;
	}

	@Override
	public String toString() {
		return "MolecularSystem [nameOfSystem=" + nameOfSystem + ", numberOfMolecules=" + numberOfMolecules
				+ ", numberOfAtoms=" + numberOfAtoms + ", molecules=" + molecules + "]";
	}

}
