package org.gradle.forYoink.yoinkTranslator.toDelete;

import org.gradle.domain.SimpleMolecule;
import org.gradle.interfaces.domain.Molecule;
import org.gradle.interfaces.service.Translator;
import org.gradle.interfaces.pdbml.IDatablockType;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Set;

@Service
public class MoleculeTranslatorForYoink implements Translator<Set<Molecule>, IDatablockType>{

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
