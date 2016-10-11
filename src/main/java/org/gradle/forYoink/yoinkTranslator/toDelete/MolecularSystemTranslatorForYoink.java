package org.gradle.forYoink.yoinkTranslator.toDelete;

import org.gradle.domain.SimpleMolecularSystem;
import org.gradle.interfaces.domain.MolecularSystem;
import org.gradle.interfaces.pdbml.IDatablockType;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MolecularSystemTranslatorForYoink {

	@Resource
	private MoleculeTranslatorForYoink moleculeTranslatorForYoink;

	public MolecularSystem translate(IDatablockType item) {
		return new SimpleMolecularSystem(item.getDatablockName(), moleculeTranslatorForYoink.translate(item));
	}
}