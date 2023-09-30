package com.jdbc.controller;

import com.jdbc.service.PersonService;

public class DeleteById {
  public static void main(String[] args) {
	PersonService service=new  PersonService();
	service.deleteService(1);
	System.out.println("row deleted");
}
}
