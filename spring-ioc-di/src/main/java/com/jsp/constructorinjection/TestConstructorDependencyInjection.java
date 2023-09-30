package com.jsp.constructorinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructorDependencyInjection {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myspring1.xml");
		Person person=(Person) applicationContext.getBean("person1");
	    person.display();
	}

}
