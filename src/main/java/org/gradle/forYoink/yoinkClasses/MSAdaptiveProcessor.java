package org.gradle.forYoink.yoinkClasses;

import org.gradle.interfaces.JobForYoink;
import org.gradle.interfaces.domain.MolecularSystem;

interface MSAdaptiveProcessor {

	JobForYoink process(MolecularSystem MS, String fileName);

}
