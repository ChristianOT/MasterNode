package org.gradle.dataBaseRepositories;

import org.gradle.domain.Atom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface AtomRepository extends CrudRepository<Atom, String>{
	
}
