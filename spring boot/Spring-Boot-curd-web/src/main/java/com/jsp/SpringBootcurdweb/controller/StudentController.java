package com.jsp.SpringBootcurdweb.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.SpringBootcurdweb.Entity.Student;
import com.jsp.SpringBootcurdweb.service.StudentService;

@RestController
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

//	 @RequestMapping(value = "/students", method = RequestMethod.GET)
//	    @ResponseBody
	@GetMapping("/students")
	public Model listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return model;
	}

	@GetMapping("/students/new")
	public ModelAndView createStudent() {
		Student student = new Student();
		ModelAndView model = new ModelAndView("create_student.html");
		model.addObject("student", student);
		return model;
	}

	@PostMapping("/students")
	public Model saveStudent(Model model, Student student) {
		studentService.saveStudent(student);
//		ModelAndView model=new ModelAndView("student.html");
//		model.addObject("student", student);
		model.addAttribute("students", studentService.getAllStudents());
		return model;
	}

	@GetMapping("/students/edit/{id}")
	public ModelAndView editStudent(@PathVariable long id  ,Student student)
	{
		studentService.getStudentById(id);
		ModelAndView model=new ModelAndView("edit_student.html");
 		model.addObject("students", student);
	//	model.addAttribute("students", studentService.getStudentById(id));
		return model;
		
	}

//	@PostMapping("/students/{id}")
	@RequestMapping(value="/students/{id}",method = RequestMethod.POST)
	public ModelAndView  updateStudent(@PathVariable long id , Student student )
	{
		Student student2=studentService.getStudentById(id);
		student2.setFirstName(student.getFirstName());
		student2.setLastName(student.getLastName());
		student2.setEmail(student.getEmail());
		
//		 model.addAttribute("students" ,studentService.getAllStudents());
		 ModelAndView model=new ModelAndView("students.html");
	 		model.addObject("students", student );
	 		model.addObject("students",studentService.getAllStudents());
	 		studentService.updateStudent(student2);
		return model;
	}
	
	@GetMapping("/students/{id}")
	public ModelAndView delete(@PathVariable long id ,  Student student)
	{
		
// 	model.addAttribute("students",student);
//	model.addAttribute("students", studentService.getAllStudents());
	ModelAndView model=new ModelAndView("students.html");
	model.addObject("students", student);
	model.addObject("students", studentService.getAllStudents());
	studentService.delete(id);
	return model;
	
	}
	
	
}
