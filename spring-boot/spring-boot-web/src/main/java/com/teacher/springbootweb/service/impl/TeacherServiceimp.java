package com.teacher.springbootweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.teacher.springbootweb.Entity.Teacher;
import com.teacher.springbootweb.Repository.TeacherRepository;
import com.teacher.springbootweb.service.TeacherService;
@Service
@Repository
public class TeacherServiceimp implements TeacherService{

	@Autowired
	TeacherRepository teacherRepository;
	@Override
	public Teacher saveTeacher(Teacher teacher) {
		 
		return teacherRepository.save(teacher);
	}
	@Override
	public List<Teacher> getAllTeacher() {
		 
		return  teacherRepository.findAll();
	}
	@Override
	public Teacher getTeacherById(int id) {
		 
		return teacherRepository.findById(id).get();
	}
	@Override
	public Teacher updateTeacher(Teacher teacher) {
		 
		return teacherRepository.save(teacher);
	}
	@Override
	public void delete(int id) {
		 teacherRepository.deleteById(id);
		
	}

}
