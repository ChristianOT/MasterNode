package org.gradle.dataBaseRepositories;

import org.gradle.yoinkClasses.SimpleAtom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface AtomRepositoryForYoink extends CrudRepository<SimpleAtom, String> {

}
