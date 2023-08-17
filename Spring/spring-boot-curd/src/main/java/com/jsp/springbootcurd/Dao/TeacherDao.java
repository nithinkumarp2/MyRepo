package com.jsp.springbootcurd.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.springbootcurd.Dto.Teacher;
import com.jsp.springbootcurd.Repository.TeacherRepository;

 @Repository
public class TeacherDao {
	 @Autowired
	TeacherRepository teacherRepository;
	 
	 public Teacher SaveTeacher(Teacher teacher)
	 {
		 
		 return teacherRepository.save(teacher);
	 }
	 
	 public List<Teacher> GetAllTeacher()
	 {
		 return  teacherRepository.findAll();
	 }
	 
	 public Optional<Teacher> GetTeacherById(int id)
	 {
		 return teacherRepository.findById(id);
	 }
	 
	 public Teacher updateTeacher(Teacher teacher)
	 {
		Optional<Teacher> optional= teacherRepository.findById(teacher.getId());
		if (optional!=null) {
			 return teacherRepository.save(teacher);
		}
		 return null;
	 }
	 
	 public String deleteTEacher(int id)
	 {
		 Optional<Teacher> optional=teacherRepository.findById(id);
		 if (optional!=null) {
			teacherRepository.delete(optional.get());
			return "data deleted successfully";
		}
		return null;
	 }
}
