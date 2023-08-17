package com.jsp.ConstructureDependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class carcontainerobj {

	public static void main(String[] args) {
ApplicationContext applicationContext=new ClassPathXmlApplicationContext("music.xml");
car car= ( car) applicationContext.getBean("car1");
car.run();
		
	}

}
