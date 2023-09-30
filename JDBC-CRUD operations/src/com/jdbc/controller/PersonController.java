package com.jdbc.controller;

import com.jdbc.service.PersonService;

public class PersonController {

	public static void main(String[] args) {
		PersonService service=new PersonService();
		int res=service.createTableService();
		if(res==0) {//eU returns only 0 if it returns 1 that means 1 row is affected.So take only res==0
			System.out.println("Table created successfully");
		}
		else {
			System.out.println("Plz check the code");
		}
		
	}

}
