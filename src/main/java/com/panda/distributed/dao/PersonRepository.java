package com.panda.distributed.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.panda.distributed.domain.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{

}
