package com.jsp.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.inbulitobj.myconfig;

public class TestCar {
public static void main(String[] args) {
	ApplicationContext app=new AnnotationConfigApplicationContext(myconfig.class);
	car car=(car)app.getBean("car");
	car.musicplayer.play();
}
}
