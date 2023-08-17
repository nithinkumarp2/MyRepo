package com.jsp.springbootfirst;

import java.util.List;

public class Student {
private int id;
private String name;
private int age;
private List<Student> students;


public List<Student> getlist() {
	return students;
}
public void setlist(List<Student> students) {
	this.students = students;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
