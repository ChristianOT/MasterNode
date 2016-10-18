package forYoink.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.wallerlab.yoink.molecular.domain.SimpleAtom;

@Service
public interface AtomRepositoryForYoink extends CrudRepository<SimpleAtom, String> {

}
