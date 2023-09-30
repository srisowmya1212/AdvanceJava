package com.jdbc.controller;

import com.jdbc.service.PersonService;

public class SavePerson {
	public static void main(String[] args) {
		PersonService service=new PersonService();
		int res=service.insertService(4,"satyam",38,"satyam@gmail.com","satyam12");
		
			System.out.println("Data saved");
		
	}

}
