package org.forYoink.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.forYoink.domain.SimpleMolecularSystem;

@Service
public interface MolecularSystemRepositoryForYoink extends CrudRepository<SimpleMolecularSystem, String> {

}
