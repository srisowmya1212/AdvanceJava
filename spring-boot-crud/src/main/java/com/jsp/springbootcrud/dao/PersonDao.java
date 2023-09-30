package com.jsp.springbootcrud.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.springbootcrud.dto.Person;
import com.jsp.springbootcrud.repository.PersonRepository;

@Repository
public class PersonDao {
	@Autowired
	PersonRepository personRepository;
	
	public Person savePerson(Person person) {
		return personRepository.save(person);
	}
	public List<Person> getAllPerson(){
		return personRepository.findAll();
	}
	public Person getById(int id) {
		Optional<Person> optional=personRepository.findById(id);
		return optional.get();
	}
    public Person update(Person person) {
    	Optional<Person> optional=personRepository.findById(person.getId());
    	if(optional.get()!=null) {
    		return personRepository.save(person);
    	}
    	return null;
    }
    public Person delete(int id) {
    	Optional<Person> optional=personRepository.findById(id);
    	if(optional.get()!=null) {
    	 personRepository.delete(optional.get());
    	 return optional.get();
    	}
		return null;
    }

}
