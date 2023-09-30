package com.jdbc.controller;

import java.util.List;

import com.jdbc.dto.PersonDto;
import com.jdbc.service.PersonService;

public class TestGetAll {
	public static void main(String[] args) {
		PersonService service =new PersonService();
		List<PersonDto> list=service.getAllService();
		for(PersonDto person: list) {
			System.out.println(person.getId());
			System.out.println(person.getName());
			System.out.println(person.getAge());
			System.out.println(person.getEmail());
			System.out.println(person.getPassword());
			System.out.println("---------------------");
		}
	}

}
