package org.forYoink.database.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;
import org.forYoink.molecular.domain.SimpleMolecule;

@Service
public interface MoleculeRepositoryForYoink extends MongoRepository<SimpleMolecule, Long> {

}
