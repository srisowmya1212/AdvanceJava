package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dto.Person;
import com.jsp.service.PersonService;
import com.jsp.util.MyConfig;

public class UpdatePerson {
	public static void main(String[] args) {
		
		Person person=new Person();
		person.setId(2);
		person.setName("vani");
		person.setAge(40);
		person.setEmail("satyam@gmail.com");
		person.setPassword("Satyam456");
		
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
		PersonService personService=(PersonService) applicationContext.getBean("personService");
		
		
		Person person2=personService.updatePerson(person);
		if(person2!=null) {
			System.out.println("data updated..");
		}
		else {
			System.out.println("plz check the code");
		}
	}

}
