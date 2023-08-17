package com.jsp.ConstructureDependencyinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class personconfi {

	public static void main(String[] args) {
		 ApplicationContext applicationContext=new ClassPathXmlApplicationContext("mySpring1.xml");
		  person person=(person) applicationContext.getBean("person1");
		  person.display();
		 

	}

}
