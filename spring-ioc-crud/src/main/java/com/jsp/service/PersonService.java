package com.jsp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dao.PersonDao;
import com.jsp.dto.Person;

@Component
public class PersonService {
	@Autowired
	PersonDao dao;
	
	public Person savePerson(Person person) {
		return dao.save(person);
		
	}
	public Person deletePerson(int id) {
		return dao.delete(id);
	}
	public List<Person> getAllPerson(){
		return dao.getAllData();
	}
	public Person updatePerson(Person person) {
		return dao.update(person);
	}
	public List<Person> loginPerson(Person person){
		return dao.login(person);
	}
	public Person getByIdPerson(int id) {
		return dao.getById(id);
	}

}
