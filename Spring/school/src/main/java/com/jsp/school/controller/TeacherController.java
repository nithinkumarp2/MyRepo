package com.jsp.school.controller;

import java.util.List;
import java.util.Map;

import org.apache.coyote.http11.Http11InputBuffer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.school.Dto.Teacher;
import com.jsp.school.service.TeacherService;

import jakarta.persistence.Id;
@RestController
public class TeacherController {
@Autowired
TeacherService service;
//@RequestMapping("/")
@PostMapping("/Teacher")
	public Teacher save(@RequestBody Teacher teacher)
	{
	
		return service.save(teacher);
	}
@GetMapping("/Teacher")
public List<Teacher> GetAllTeacher()
{
	return service.GetAllTeacher();
}

//@PatchMapping("/Teacher/{id}")
//public ResponseEntity<Teacher>  GetByTeacher(@PathVariable int id, @RequestBody Teacher teacher)
//{
//	return  new ResponseEntity<Teacher>(service.updateProductByFields(id, teacher),HttpStatus.OK);
////	return service.updateProductByFields(id, teacher);
//}
@GetMapping("/Teacher/{id}")
 public Teacher GetById(@PathVariable int id)
 {
	return service.GetById(id);
 }
@PutMapping("/Teacher")
public Teacher update(@RequestBody Teacher teacher)
{
	return service.update(teacher);
}

@DeleteMapping("/Teacher/{id}")
public Teacher Delete(@PathVariable int id)
{
	return service.Delete(id);
}
}
