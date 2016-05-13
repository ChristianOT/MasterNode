package org.gradle.dataBaseRepositories;

import org.gradle.domain.Molecule;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface MoleculeRepository extends CrudRepository<Molecule, String>{

}
