package com.jsp.school.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.school.Dao.TeacherDao;
import com.jsp.school.Dto.Teacher;

import jakarta.persistence.Id;

@Service
public class TeacherService {

	@Autowired
	TeacherDao dao;

	public Teacher save(Teacher teacher) {
		return dao.save(teacher);
	}

	public List<Teacher> GetAllTeacher() {
		return dao.GetAllTeacher();
	}

//	public Teacher updateProductByFields(int id,Teacher teacher) {
//
//		return dao.updateProductByFields(id, teacher);
//	}
	public Teacher GetById(int id)
	{
		return dao.GetById(id);
	}
	public Teacher update(Teacher teacher)
	{
		return dao.update(teacher);
	}
	public Teacher Delete(int id)
	{
		return dao.Delet(id);
	}
}
