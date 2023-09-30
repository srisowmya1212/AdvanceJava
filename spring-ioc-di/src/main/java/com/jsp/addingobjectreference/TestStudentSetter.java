package com.jsp.addingobjectreference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudentSetter {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("mystudent.xml");
		StudentSetter studentSetter=(StudentSetter) applicationContext.getBean("student1");
		studentSetter.display();
	}

}
