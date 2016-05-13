package org.gradle.domain;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;


@NodeEntity
public class Molecule {

	@GraphId
	private Long id;
	
	private String fileName;
	public Integer atomCount = 0;
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

	public void setAtoms(Set<Atom> atoms) {
		this.atoms = atoms;
	}

	@Override
	public String toString() {
		return "Molecule [atomCount=" + atomCount + ", fileName=" + fileName + ", atoms=" + atoms + "]";
	}

}
