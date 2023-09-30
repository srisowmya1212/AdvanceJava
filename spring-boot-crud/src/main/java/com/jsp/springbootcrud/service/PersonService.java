package com.jsp.springbootcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springbootcrud.dao.PersonDao;
import com.jsp.springbootcrud.dto.Person;

@Service
public class PersonService {
	@Autowired
	PersonDao dao;
	
    public Person savePerson(Person person) {
    	return dao.savePerson(person);
    
    }
    public List<Person> getAllPerson(){
    	return dao.getAllPerson();
    } 
    public Person getById(int id) {
    	return dao.getById(id);
    }
    public Person delete(int id) {
    	return dao.delete(id);
    }
    public Person update(Person person ) {
    	return dao.update(person);
    }
    
}
