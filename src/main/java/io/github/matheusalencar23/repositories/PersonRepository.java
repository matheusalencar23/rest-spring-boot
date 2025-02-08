package io.github.matheusalencar23.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.matheusalencar23.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{}
