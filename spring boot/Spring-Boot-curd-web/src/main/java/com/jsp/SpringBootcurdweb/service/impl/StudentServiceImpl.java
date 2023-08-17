package com.jsp.SpringBootcurdweb.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jsp.SpringBootcurdweb.Entity.Student;
import com.jsp.SpringBootcurdweb.Repository.StudentRepository;
import com.jsp.SpringBootcurdweb.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		 
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		 
		return  studentRepository.save(student);
	}

	@Override
	public Student getStudentById(long id) {
		 
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		 
		return studentRepository.save(student);
	}

	@Override
	public void delete(long id) {
		 
		 studentRepository.deleteById(id);
		
	}

}
