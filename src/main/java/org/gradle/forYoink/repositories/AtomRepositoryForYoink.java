package org.gradle.forYoink.repositories;

import org.gradle.domain.SimpleAtom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface AtomRepositoryForYoink extends CrudRepository<SimpleAtom, String> {

}
