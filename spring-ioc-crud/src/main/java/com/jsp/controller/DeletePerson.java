package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.service.PersonService;
import com.jsp.util.MyConfig;

public class DeletePerson {
	public static void main(String[] args) {
		
	
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
		PersonService personService=(PersonService) applicationContext.getBean("personService");
		personService.deletePerson(3);
		if(personService!=null) {
			System.out.println("data deleted");
		}
		else {
			System.out.println("plz check the code");
		}
	}

}
