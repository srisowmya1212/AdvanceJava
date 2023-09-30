package com.jsp.controller;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dto.Person;
import com.jsp.service.PersonService;
import com.jsp.util.MyConfig;


public class SavePerson {

	public static void main(String[] args) {

	
		Person person=new Person();
		person.setId(3);
		person.setName("arun");
		person.setAge(20);
		person.setEmail("arun@gmail.com");
		person.setPassword("Arun456");
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
		PersonService personService=(PersonService) applicationContext.getBean("personService");//personservice is not a valid bean id.
		//bean id is class name where the first letter is small and second letter is uppercase
		
		personService.savePerson(person);
		
		

		if(person!=null) {
			System.out.println("data inserted");
		}
		else {
			System.out.println("plz check the code");
		}
		
		
		
		
		
		
	}

}
