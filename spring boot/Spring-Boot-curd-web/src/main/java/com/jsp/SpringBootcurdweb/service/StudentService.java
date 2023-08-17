package com.jsp.SpringBootcurdweb.service;

import java.util.List;

import com.jsp.SpringBootcurdweb.Entity.Student;

public interface StudentService {
	List<Student> getAllStudents();

	Student saveStudent(Student student);

	Student getStudentById(long id);

	Student updateStudent(Student student);

	void delete(long id);

}
