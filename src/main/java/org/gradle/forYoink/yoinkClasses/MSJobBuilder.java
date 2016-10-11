package org.gradle.forYoink.yoinkClasses;

import org.gradle.interfaces.JobForYoink;
import org.gradle.interfaces.domain.MolecularSystem;

interface MSJobBuilder {

    JobForYoink buildFromMS(MolecularSystem MS, String parameters);
}