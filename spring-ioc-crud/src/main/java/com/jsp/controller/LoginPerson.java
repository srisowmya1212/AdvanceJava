package com.jsp.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dto.Person;
import com.jsp.service.PersonService;
import com.jsp.util.MyConfig;

public class LoginPerson {
	public static void main(String[] args) {
		Person person = new Person();
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		PersonService personService = (PersonService) applicationContext.getBean("personService");
		person.setEmail("satyam@gmail.com");
		person.setPassword("Satyam456");
		List<Person> list = personService.loginPerson(person);
		if (list != null) {
			for (Person person2 : list) {
				System.out.println("-------------------------------");
				System.out.println("person id: " + person2.getId());
				System.out.println("person name: " + person2.getName());
				System.out.println("person age: " + person2.getAge());
				System.out.println("person email: " + person2.getEmail());
				System.out.println("person password: " + person2.getPassword());
				System.out.println("--------------------------------------");
			}
		}else {
			System.out.println("plz check the code");
		}
	}

}
