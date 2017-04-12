package com.panda.distributed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.panda.distributed.dao.PersonRepository;
import com.panda.distributed.domain.Person;

@RestController
public class PersonController {

	@Autowired
	PersonRepository personRepository;
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public List<Person> savePerson(@RequestBody String personName) {
		Person person = new Person(personName);
		personRepository.save(person);
		
		List<Person> people = personRepository.findAll(new PageRequest(0, 10)).getContent();
		return people;
	}
}
