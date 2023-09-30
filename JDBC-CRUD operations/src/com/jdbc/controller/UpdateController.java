package com.jdbc.controller;

import com.jdbc.dto.PersonDto;
import com.jdbc.service.PersonService;

public class UpdateController {
	public static void main(String[] args) {
		PersonService service=new PersonService();
		 service.updateService();
		System.out.println("updated successfully");
	}

}
