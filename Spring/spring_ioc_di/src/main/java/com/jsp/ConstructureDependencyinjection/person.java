package com.jsp.ConstructureDependencyinjection;

public class person {
private int id;
private String name;
private int age;
public person(int id, String name, int age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}
public void display()
{
	System.out.println("id : "+id);
	System.out.println("name : "+name);
	System.out.println("age : "+age);
}
}
