package org.gradle.interfaces;

import java.util.List;

import org.gradle.pdbml.v40.generated.*;
import org.gradle.pdbml.v40.generated.AtomSiteType.AtomSite;

/**
 * Interface for the two generated DatablockType classes. 
 * Necessary to allow dynamic reading of the two pdbml file formats.
 * 
 * @author Christian Ouali Turki
 *
 */
public interface DatablockTypeInterface {
	
	AtomSiteType getAtomSiteCategory();
	

}
