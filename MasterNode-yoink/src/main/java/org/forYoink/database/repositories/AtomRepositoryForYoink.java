package org.forYoink.database.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;
import org.forYoink.molecular.domain.SimpleAtom;

@Service
public interface AtomRepositoryForYoink extends MongoRepository<SimpleAtom, Long> {

}
