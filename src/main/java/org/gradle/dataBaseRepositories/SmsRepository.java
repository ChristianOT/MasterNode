package org.gradle.dataBaseRepositories;

import org.gradle.domain.SimpleMolecularSystem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface SmsRepository extends JpaRepository<SimpleMolecularSystem, Long>{

}
