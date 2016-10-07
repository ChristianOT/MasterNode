package org.gradle.domain;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;


/**
 * This domain model is adjusted a molecule of a pdbml file. Is set as
 * a neo4j entity.
 * 
 * @author Christian Ouali Turki
 *
 */@NodeEntity
public class Molecule {

	@GraphId
	private Long id;
	private String fileName;
	public Integer atomCount = 0;


	public Molecule() {
	}

	public Molecule(String fileName, Set<Atom> atoms) {
		this.fileName = fileName;
		this.atoms = atoms;
	}

	/*
         * Set of atoms. @Relationship enables the relation between two domain models.
         */
	@Relationship(type="ATOM",direction=Relationship.UNDIRECTED)
	public Set<Atom> atoms = new HashSet<Atom>();

	public Integer getAtomCount() {
		return atomCount;
	}

	public void setAtomCount(Integer atomCount) {
		this.atomCount = atomCount;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Set<Atom> getAtoms() {
		return atoms;
	}

	public void setAtoms(HashSet<Atom> atoms) {
		this.atoms = atoms;
	}

	@Override
	public String toString() {
		return "Molecule [atomCount=" + atomCount + ", fileName=" + fileName + ", atoms=" + atoms + "]";
	}

}
