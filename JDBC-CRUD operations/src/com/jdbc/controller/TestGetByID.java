package com.jdbc.controller;

import com.jdbc.dto.PersonDto;
import com.jdbc.service.PersonService;

public class TestGetByID {
    public static void main(String[] args) {
		PersonService service=new PersonService();
		PersonDto person=service.getByIdService(1);
		
		if(person.getId()!=0) {
			System.out.println("Person Id: "+person.getId());
			System.out.println("Name: "+person.getName());
			System.out.println("Age :"+ person.getAge());
			System.out.println("Email : "+person.getEmail());
			System.out.println("Password: "+person.getPassword());
			
		}
		else {
			System.out.println("plz check the id");
		}
	}
}
