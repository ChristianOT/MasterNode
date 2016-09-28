package org.gradle.yoinkClasses;

import org.wallerlab.yoink.api.model.bootstrap.Job;
import org.wallerlab.yoink.api.model.molecular.MolecularSystem;

interface MSAdaptiveProcessor {
	
	public Job process(MolecularSystem MS,String fileName);

}
