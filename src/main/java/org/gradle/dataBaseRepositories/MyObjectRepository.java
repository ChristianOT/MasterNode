package org.gradle.dataBaseRepositories;

import java.util.List;

import org.gradle.domain.MyObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface MyObjectRepository extends JpaRepository<MyObject, Long> {

	List<MyObject> findByContent(String url);

}
