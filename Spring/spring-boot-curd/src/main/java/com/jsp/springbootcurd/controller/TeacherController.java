package com.jsp.springbootcurd.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springbootcurd.Dto.Teacher;
import com.jsp.springbootcurd.TeacherService.TeacherService;

 
@RestController
public class TeacherController {


	@Autowired
	TeacherService service;
	@RequestMapping("/save")
	@PostMapping("/Teacher")
	public Teacher SaveTeacher(@RequestBody Teacher teacher)
	{
		return service.SaveTeacher(teacher);
	}
	
	@GetMapping("/Teacher")
	 public List<Teacher> GetAllTeacher()
	 {
		 return service.GetAllTeacher();
	 }
	
	@GetMapping("/Teacher/{id}")
	 public Optional<Teacher> GetTeacherById(@PathVariable int id)
	 {
		 return service.GetTeacherById(id);
	 }
	@PutMapping("/Teacher")
	 public Teacher updateTeacher(@RequestBody Teacher teacher)
	 {
		 return service.updateTeacher(teacher);
	 }
	@DeleteMapping("/Teacher")
	 public String deleteTEacher(@RequestParam  int id)
	 {
		 return service.deleteTEacher(id);
	 }
}
