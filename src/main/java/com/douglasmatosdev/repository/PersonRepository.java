package com.douglasmatosdev.repository;

import com.douglasmatosdev.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
