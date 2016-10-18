package forYoink.yoinkClasses;

import org.wallerlab.yoink.api.model.bootstrap.Job;
import org.wallerlab.yoink.api.model.molecular.MolecularSystem;

interface MSAdaptiveProcessor {

	Job process(MolecularSystem MS, String fileName);

}
