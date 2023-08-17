package com.jsp.springbootfirst;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo {
// @RequestMapping("test1")
	@GetMapping("/test1")
	public String test1() {
		return "hello";
	}

	@GetMapping("/test2")
	public Student test2() {
		Student student = new Student();
		student.setId(1);
		student.setName("vvvvv");
		student.setAge(24);
		return student;
	}

	@PostMapping("/test4")
	public String test4(@RequestBody Student student) {
		System.out.println(student.getId() + " " + student.getName() + " " + student.getAge());
		return "data";
	}

	@PostMapping("/test5")
	public List<Student> test5(@RequestBody Student student) {
		return student.getlist();
	}
}
