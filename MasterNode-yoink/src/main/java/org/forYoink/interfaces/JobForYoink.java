package org.forYoink.interfaces;

import org.wallerlab.yoink.api.model.bootstrap.JobParameter;
import org.wallerlab.yoink.api.model.regionizer.Region;
import org.wallerlab.yoink.api.model.molecular.MolecularSystem;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by christian on 10/10/2016.
 */
public interface JobForYoink<T> {

    MolecularSystem getMolecularSystem();

    void setMolecularSystem(MolecularSystem var1);

    Map<JobParameter, Object> getParameters();

    void setParameters(Map<JobParameter, Object> var1);

    Map<Region.Name, Region> getRegions();

    void setRegions(Map<Region.Name, Region> var1);

    T getInput();

    void setInput(T var1);

    Map<String, Object> getProperties();

    void setProperties(Map<String, Object> var1);

    List<List<Integer>> getInteractionList();

    void SetInteractionList(List<List<Integer>> var1);

    List<Double> getInteractionWeight();

    void SetInteractionWeight(List<Double> var1);

    void setClusters(List<Set<Integer>> var1);

    List<Set<Integer>> getClusters();


}
