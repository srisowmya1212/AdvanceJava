package com.jsp.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestEmployee {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
	   Employee employee	=(Employee) applicationContext.getBean("employee");
	   employee.test();
		
	}

}
