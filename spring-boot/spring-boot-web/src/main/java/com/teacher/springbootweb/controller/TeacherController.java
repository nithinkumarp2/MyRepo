package com.teacher.springbootweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.teacher.springbootweb.Entity.Teacher;
import com.teacher.springbootweb.service.impl.TeacherServiceimp;

import jakarta.servlet.http.HttpServlet;

@RestController
public class TeacherController {
	@Autowired
	TeacherServiceimp serviceimp;

	@GetMapping("/teacher")
	public Model getAllTeacher(Model model) {
		model.addAttribute("teacher", serviceimp.getAllTeacher());

		return model;
	}

	@GetMapping("/teacher/new")
	public ModelAndView CerateTeacher(Teacher teacher) {
		ModelAndView model = new ModelAndView("save.html");
//		model.addAttribute("save.html", teacher);
		model.addObject("teacher", teacher);
		return model;
	}

	@PostMapping("/teacher")

	public Model saveTeacher(Model model, Teacher teacher) {
		serviceimp.saveTeacher(teacher);
//		ModelAndView model=new ModelAndView("teacher.html");
//		model.addObject("teacher", teacher);
		model.addAttribute("teacher", serviceimp.getAllTeacher());
//				serviceimp.getAllTeacher();
		return model;

	}

	
	@GetMapping("/teacher/update/{id}")
	public ModelAndView getTeacherById(@PathVariable int id, Teacher teacher)
	{
		//model.addAttribute("teacher", teacher);
		ModelAndView model=new ModelAndView("update.html");
		model.addObject("teacher", teacher);
		serviceimp.getTeacherById(id);
		return model;
	}
	
 //	@PutMapping("/teacher/{id}"  )
	@RequestMapping(value = "/teacher/{id}", method = RequestMethod.POST)
	   public ModelAndView updateTeacher( @PathVariable int id, Teacher teacher)
	   {
		Teacher teacher1=serviceimp.getTeacherById(id);
		teacher1.setFirstName(teacher.getFirstName());
		teacher1.setLastName(teacher.getLastName());
		teacher1.setPhoneno(teacher.getPhoneno());
		teacher1.setDob(teacher.getDob());
		teacher1.setAddress(teacher.getAddress());
		teacher1.setSubject(teacher.getSubject());
		teacher1.setUserName(teacher.getUserName());
		teacher1.setUserPass(teacher.getUserPass());
		
		
		ModelAndView model=new ModelAndView("teacher.html");
		model.addObject("teacher", teacher);
		model.addObject("teacher", serviceimp.getAllTeacher());
		serviceimp.updateTeacher(teacher1);
		return model;
	   }
	@GetMapping("/teacher/{id}")
	public ModelAndView delete(@PathVariable int id , Teacher teacher)
	{
		ModelAndView model=new ModelAndView("teacher.html");
		model.addObject("teacher", teacher);
		model.addObject("teacher", serviceimp.getAllTeacher());	
		serviceimp.delete(id);
		return model;
	}
	@GetMapping("/")
	public ModelAndView login( Teacher teacher)
	{
		ModelAndView model=new ModelAndView("login.html");	
	 		model.addObject("teacher", teacher);
		return model;
		
	}
	
//	@GetMapping("/login")
//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	public ModelAndView loginuser(  Teacher teacher ) 
//	{
//		ModelAndView model=new ModelAndView("success.html");
//		ModelAndView m=new ModelAndView("teacher.html");
// 		model.addObject("teacher", teacher);
// 		int id=teacher.getId();
//	Teacher teacher2=	serviceimp.getTeacherById(id);
//		if (teacher2.getUserPass().equals(teacher.getUserPass()))
// 	{
// 			
// 			return m;
// 	}
// 		else
// 		{
// 		System.out.println(teacher.getUserName());
// 		System.out.println(teacher.getUserPass());
//  			return model;
// 		}
//		 
// 	}
	 
}
