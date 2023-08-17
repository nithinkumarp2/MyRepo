package com.jsp.school.Dao;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.ReflectionUtils;
import org.springframework.stereotype.Repository;
import org.springframework.util.ReflectionUtils.FieldFilter;

import com.jsp.school.Dto.Teacher;
import com.jsp.school.Repository.SchoolRepositry;

import jakarta.persistence.Id;
@Repository
public class TeacherDao {
@Autowired
SchoolRepositry srepository;

	public Teacher save(Teacher teacher)
	{
		return srepository.save(teacher);
	}
	
	 public List<Teacher> GetAllTeacher()
	 {
		 return srepository.findAll();   
	 }
	 
	 
	    public Teacher updateProductByFields(int id, Teacher teacher) {
	    	  Optional<Teacher> opt= srepository.findById(id);
	    	  if(opt!=null) {
	  		opt.get().setName(teacher.getName());
	  		opt.get().setAge(teacher.getAge());
	  		opt.get().setPhno(teacher.getPhno());
	      return srepository.save(id,teacher);
	    	  }
	    	  return null;
	    }
	    
	 public Teacher GetById(int id){
		 
		 return srepository.findById(id).get();
	 }
	 
	 public Teacher update(Teacher teacher)
	 {
		Optional<Teacher> opt= srepository.findById(teacher.getId());
		if (opt  !=null) {
			return srepository.save(teacher);
		}
		 return null;
	 }
	 public Teacher Delet(int id)
	 {
		 Optional<Teacher> opt=srepository.findById(id);
		 if (opt.get()!=null) {
			  srepository.delete(opt.get() );
		}
		 return null;
	 }
}
