package org.gradle.pdbml;

import org.gradle.pdbml.v40.generated.AtomSiteType;
import org.gradle.pdbml.IAtomSiteType;

import java.util.List;

/**
 * Created by christian on 30/09/2016.
 */
public interface IDatablockType {

    String getDatablockName();
    IAtomSiteType getAtomSiteCategory();
}
