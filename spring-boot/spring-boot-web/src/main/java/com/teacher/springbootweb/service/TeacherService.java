package com.teacher.springbootweb.service;

import java.util.List;

import com.teacher.springbootweb.Entity.Teacher;

public interface TeacherService {

	Teacher saveTeacher(Teacher teacher);
	List<Teacher> getAllTeacher();
	Teacher getTeacherById(int id);
	Teacher updateTeacher(Teacher teacher);
	void delete(int id);
}
