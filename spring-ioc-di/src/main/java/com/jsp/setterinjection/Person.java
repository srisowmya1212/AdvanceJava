package com.jsp.setterinjection;

public class Person {
	int id;
	String name;
	int age;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
		
	}
	public void display() {
		System.out.println("Person id: "+id);
		System.out.println("Person name: "+name);
		System.out.println("Person age:  "+age);
		
	}

}
