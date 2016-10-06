package org.gradle.yoinkTranslator;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Resource;

import org.gradle.interfaces.MolecularSystem;
import org.gradle.interfaces.Molecule;
import org.gradle.interfaces.Translator;
import org.gradle.pdbml.IDatablockType;
import org.gradle.yoinkClasses.SimpleMolecularSystem;
import org.springframework.stereotype.Service;

@Service
public class MolecularSystemTranslatorForYoink implements Translator<MolecularSystem, IDatablockType>{

	@Resource
	private MoleculeTranslatorForYoink moleculeTranslatorForYoink;
	
	private Set<MolecularSystem> msList;
	
	public Set<MolecularSystem> translate(IDatablockType item){
		
		Set<Molecule> molecules = moleculeTranslatorForYoink.translate(item);
		MolecularSystem ms = new SimpleMolecularSystem(item.getDatablockName(),molecules);
        msList = new HashSet<>();
		msList.add(ms);
		
		return msList;
	}
}
