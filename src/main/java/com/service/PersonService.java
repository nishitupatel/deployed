package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Person;

@Service
public interface PersonService {

	public List<Person> getAllPersons();
	public Person addPerson(Person p);
}
