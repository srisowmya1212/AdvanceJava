package com.jsp.demo2Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCarObj {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig2.class);
		Car car=(Car) applicationContext.getBean("car");
		car.run();
	}

}
