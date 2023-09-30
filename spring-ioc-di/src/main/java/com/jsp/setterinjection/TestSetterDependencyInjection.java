package com.jsp.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSetterDependencyInjection {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myspring.xml");
		Person person=(Person) applicationContext.getBean("person1");
		person.display();
		
		
	}

}
