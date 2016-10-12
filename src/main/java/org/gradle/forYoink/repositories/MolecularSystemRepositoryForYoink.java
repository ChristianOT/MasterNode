package org.gradle.forYoink.repositories;

import org.gradle.domain.SimpleMolecularSystem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface MolecularSystemRepositoryForYoink extends CrudRepository<SimpleMolecularSystem, String> {

}