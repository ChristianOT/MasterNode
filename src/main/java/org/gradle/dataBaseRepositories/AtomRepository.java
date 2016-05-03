package org.gradle.dataBaseRepositories;

import org.gradle.domain.MyAtom;
import org.gradle.domain.SimpleAtom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface AtomRepository extends JpaRepository<MyAtom, Long>{

}
