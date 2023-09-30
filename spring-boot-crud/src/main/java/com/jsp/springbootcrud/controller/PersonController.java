package com.jsp.springbootcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springbootcrud.dto.Person;
import com.jsp.springbootcrud.service.PersonService;

@RestController
public class PersonController {
	@Autowired
	PersonService service;
	@PostMapping("/person")
	public Person save(@RequestBody Person person) {
		return service.savePerson(person);
		
	}
	@GetMapping("/person")
     public List<Person> getAll(){
		return service.getAllPerson();
	}
	@GetMapping("/person{id}")
	public Person getById(@PathVariable int id) {
		return service.getById(id);
	}
	@PutMapping("/person")
	public Person update(@RequestBody Person person) {
		return  service.update(person);
	}
	@DeleteMapping("/person")
	public Person delete(@RequestParam int id) {
		return service.delete(id);
	}
	
}
