package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dto.Person;
import com.jsp.service.PersonService;
import com.jsp.util.MyConfig;

public class GetByIdPerson {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
		PersonService personService=(PersonService) applicationContext.getBean("personService");
		Person person=personService.getByIdPerson(2);
		if(person!=null) {
			System.out.println("person id: "+person.getId());
			System.out.println("person name: "+person.getName());
			System.out.println("person age: "+person.getEmail());
			System.out.println("person email: "+person.getAge());
			System.out.println("person password: "+person.getPassword());
		}
		else {
			System.out.println("plz check the code");
		}
	}

}
