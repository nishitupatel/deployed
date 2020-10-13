package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.*;
import com.repository.PersonRepository;
import com.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	PersonRepository peropo;
	
	public List<Person> getAllPersons ()	{
		
		return peropo.findAll();
	}

	@Override
	public Person addPerson(Person p) {
		return peropo.save(p);
	}

}
