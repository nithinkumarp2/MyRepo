package com.jsp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

@Component
public class StudentService {

	@Autowired
	StudentDao dao;
	public Student save(Student student)
	{
		return dao.save(student);
	}
	
	public Student UpDate(Student student)
	{
		return dao.UpDate(student);
	}
	
	public Student Delete(Student student)
	{
		return dao.Delete(student);
	}
	
	public List<Student> GetAll(Student student)
	{
		return dao.GetAll(student);
	}
	public Student GetById(Student student)
	{
		return dao.GetById(student);
	}
}
