/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gradle.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.gradle.interfaces.Atom;
import org.gradle.interfaces.MolecularSystem;
import org.gradle.interfaces.Molecule;

/**
 * the domain model for molecular system.
 * 
 * @author Min Zheng
 *
 */
@Entity
public class SimpleMolecularSystem implements MolecularSystem {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	
	@Lob
	private final List<Molecule> molecules;

	public SimpleMolecularSystem(List<Molecule> molecules) {
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

	/**
	 * get all molecules in molecular system.
	 */
	@Override
	public List<Molecule> getMolecules() {
		return this.molecules;
	}

}