package forYoink.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.wallerlab.yoink.molecular.domain.SimpleMolecularSystem;

@Service
public interface MolecularSystemRepositoryForYoink extends CrudRepository<SimpleMolecularSystem, String> {

}
