package com.jsp.SetterDependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class patientcontainer {

	public static void main(String[] args) {

		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("patient.xml");
		patient patient=( patient) applicationContext.getBean("pat");
		patient.run();
	}

}
