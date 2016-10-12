package org.gradle.forYoink.repositories;

import org.gradle.domain.SimpleMolecule;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface MoleculeRepositoryForYoink extends CrudRepository<SimpleMolecule, String> {

}
