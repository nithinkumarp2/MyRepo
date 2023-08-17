package com.jsp.SetterDependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HospitalContainer {

	public static void main(String[] args) {
		 ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Hospital.xml");
		 Hospital hospital=(Hospital) applicationContext.getBean("hosp");
		 hospital.display();
	}

}
