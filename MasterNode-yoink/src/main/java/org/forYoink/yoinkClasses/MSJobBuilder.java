package org.forYoink.yoinkClasses;

import org.wallerlab.yoink.api.model.bootstrap.Job;
import org.wallerlab.yoink.api.model.molecular.MolecularSystem;

interface MSJobBuilder {

    Job buildFromMS(MolecularSystem MS, String parameters);
}
