package org.gradle.dataBaseRepositories;

import java.util.List;

import org.gradle.domain.MolecularSystem;
import org.springframework.data.repository.CrudRepository;

public interface MolecularSystemRepository extends CrudRepository<MolecularSystem, String>{

	List<MolecularSystem> findByNameOfSystem(String nameOfSystem);

}
