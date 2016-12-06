package org.forYoink.api.service.bootstrap;


import org.forYoink.api.model.bootstrap.Job;

import java.util.List;

public interface MSJobBuilder<T, K> {

    List<Job> buildFromMS(T t, K K);
}
