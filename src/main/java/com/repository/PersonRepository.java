package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{

	@Query(value = "select first_name from person_table where no=(:id);", nativeQuery = true)
	public String byQuery(@Param("id") Integer id);	
}
