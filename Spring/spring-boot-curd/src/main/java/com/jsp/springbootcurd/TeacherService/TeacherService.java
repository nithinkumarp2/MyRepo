package com.jsp.springbootcurd.TeacherService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springbootcurd.Dao.TeacherDao;
import com.jsp.springbootcurd.Dto.Teacher;

@Service
public class TeacherService {
	@Autowired
	  TeacherDao dao;
	
	public Teacher SaveTeacher(Teacher teacher)
	{
		 return dao.SaveTeacher(teacher);
	}
	
	 public List<Teacher> GetAllTeacher()
	 {
		 return dao.GetAllTeacher();
	 }
	 
	 public Optional<Teacher> GetTeacherById(int id)
	 {
		 return dao.GetTeacherById(id);
	 }
	 
	 public Teacher updateTeacher(Teacher teacher)
	 {
		 return dao.updateTeacher(teacher);
	 }
	 
	 public String deleteTEacher(int id)
	 {
		 return dao.deleteTEacher(id);
	 }
}
