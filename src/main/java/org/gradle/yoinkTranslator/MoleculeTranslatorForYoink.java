package org.gradle.yoinkTranslator;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Resource;

import org.gradle.interfaces.Molecule;
import org.gradle.interfaces.Translator;
import org.gradle.pdbml.IDatablockType;
import org.gradle.domain.SimpleMolecule;
import org.springframework.stereotype.Service;

@Service
public class MoleculeTranslatorForYoink implements Translator<Molecule, IDatablockType>{

	@Resource
	private AtomTranslatorForYoink atomTranslatorForYoink;
	
	private int moleculeCounter = 0;
	
	public Set<Molecule> translate(IDatablockType item){
		
		moleculeCounter++;
		
		Set<Molecule> molecules = new HashSet<>();
		Molecule molecule = new SimpleMolecule(moleculeCounter, atomTranslatorForYoink.translate(item));
		molecules.add(molecule);
	
		return molecules;
		
	}
}
