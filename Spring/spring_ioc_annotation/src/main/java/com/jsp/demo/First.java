 package com.jsp.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class First {
public static void main(String[] args) {
	ApplicationContext app=new  AnnotationConfigApplicationContext(config.class);
	  TestFirst test=(TestFirst) app.getBean("testFirst");
	test.Test();
}
}
