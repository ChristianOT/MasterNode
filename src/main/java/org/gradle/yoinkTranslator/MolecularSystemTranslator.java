/*
package org.gradle.yoinkTranslator;

import java.util.List;

import javax.annotation.Resource;

import org.gradle.interfaces.Translator;
import org.gradle.pdbml.v40.generated.DatablockType;
import org.wallerlab.yoink.api.model.molecular.MolecularSystem;
import org.wallerlab.yoink.api.model.molecular.Molecule;
import org.wallerlab.yoink.molecular.domain.SimpleMolecularSystem;

public class MolecularSystemTranslator implements Translator<MolecularSystem, DatablockType>{

	@Resource
	private MoleculeTranslator moleculeTranslator;
	
	private List<MolecularSystem> msList;
	
	public List<MolecularSystem> translate(DatablockType item){
		
		List<Molecule> molecules = moleculeTranslator.translate(item);
		MolecularSystem ms = new SimpleMolecularSystem(molecules);
		msList.add(ms);
		
		return msList;
	}
}
*/
