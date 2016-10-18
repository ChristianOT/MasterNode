package forYoink.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.wallerlab.yoink.molecular.domain.SimpleMolecule;

@Service
public interface MoleculeRepositoryForYoink extends CrudRepository<SimpleMolecule, String> {

}
