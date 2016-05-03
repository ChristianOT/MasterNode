package org.gradle.dataBaseRepositories;

import org.gradle.domain.DatablockType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface DatablockTypeRepository extends JpaRepository<DatablockType, Long>{

}
