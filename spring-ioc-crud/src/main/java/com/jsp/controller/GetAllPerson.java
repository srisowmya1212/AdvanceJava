package com.jsp.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dto.Person;
import com.jsp.service.PersonService;
import com.jsp.util.MyConfig;

public class GetAllPerson {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		PersonService personService = (PersonService) applicationContext.getBean("personService");
		List<Person> list = personService.getAllPerson();
		if (personService != null) {
			for (Person person : list) {
				System.out.println("-------------------------------");
				System.out.println("person id: " + person.getId());
				System.out.println("person name: " + person.getName());
				System.out.println("person age: " + person.getAge());
				System.out.println("person email: " + person.getEmail());
				System.out.println("person password: " + person.getPassword());
				System.out.println("--------------------------------------");
			}
		} else {
			System.out.println("plz check the code");
		}
	}
}
