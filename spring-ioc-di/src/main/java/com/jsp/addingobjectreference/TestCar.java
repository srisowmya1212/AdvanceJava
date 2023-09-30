package com.jsp.addingobjectreference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("mycar.xml");
		Car car=(Car)applicationContext.getBean("car1");//using constructor dependency injection
		car.run();
	}

}
