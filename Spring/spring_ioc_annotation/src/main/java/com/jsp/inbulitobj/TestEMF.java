package com.jsp.inbulitobj;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestEMF {

	public static void main(String[] args) {
		ApplicationContext app=new AnnotationConfigApplicationContext(myconfig.class);
		EntityManagerFactory emf=(EntityManagerFactory) app.getBean("create");
		System.out.println(emf);
	}
}
