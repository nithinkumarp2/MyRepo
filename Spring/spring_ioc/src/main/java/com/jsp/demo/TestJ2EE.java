 package com.jsp.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJ2EE {

	public static void main(String[] args) {
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("myspring.xml");
		Employee employee=(Employee) applicationContext.getBean("emp1");
		employee.test1();
	}
}
