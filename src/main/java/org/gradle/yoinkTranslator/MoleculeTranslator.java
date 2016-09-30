/*
package org.gradle.yoinkTranslator;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.gradle.interfaces.Translator;
import org.gradle.pdbml.v40.generated.DatablockType;
import org.wallerlab.yoink.api.model.molecular.Molecule;
import org.wallerlab.yoink.molecular.domain.SimpleMolecule;

public class MoleculeTranslator implements Translator<Molecule, DatablockType>{

	@Resource
	private AtomTranslator atomTranslator;
	
	private int moleculeCounter = 0;
	
	public List<Molecule> translate(DatablockType item){
		
		moleculeCounter++;
		
		List<Molecule> molecules = new ArrayList<Molecule>();
		Molecule molecule = new SimpleMolecule(moleculeCounter, atomTranslator.translate(item));
		molecules.add(molecule);
	
		return molecules;
		
	}
}
*/
