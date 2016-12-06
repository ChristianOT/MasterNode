package org.forYoink.database.repositories;

import org.forYoink.api.model.molecular.MolecularSystem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public interface MolecularSystemRepositoryForYoink extends MongoRepository<MolecularSystem, Long> {

}
