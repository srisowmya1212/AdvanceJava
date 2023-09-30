package com.jsp.constructorinjection;

public class Person {
	int id;
	String name;
	int age;
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public void display() {
		System.out.println("person id: "+id);
		System.out.println("person name: "+name);
		System.out.println("person age: "+age);
	}

}
