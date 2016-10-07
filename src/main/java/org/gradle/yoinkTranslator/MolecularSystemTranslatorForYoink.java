package org.gradle.yoinkTranslator;

import org.gradle.domain.SimpleMolecularSystem;
import org.gradle.interfaces.MolecularSystem;
import org.gradle.pdbml.IDatablockType;
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