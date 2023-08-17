package com.jsp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

@Controller
public class studentcontroller {
	@Autowired
	StudentService service;

//	
//	@RequestMapping("/loadstudent")
//	public ModelAndView load()
//	{
//		ModelAndView view =new ModelAndView("save.jsp");
//		view.addObject("load",new Student());
//		return view;
//	}
//	@RequestMapping("/save")
//	public ModelAndView save(@ModelAttribute Student student)
//	{
//		ModelAndView view=new ModelAndView("home.jsp");
//		view.addObject("student","data saved");
//		return view;
//	}
 
//	Student student;

	@RequestMapping("/loadstudent")
	public ModelAndView load() {
		ModelAndView view = new ModelAndView("save.jsp");
		view.addObject("load", new Student());
		return view;
	}

	@RequestMapping("/save")
	public ModelAndView save(@ModelAttribute Student student) {
		Student student2 = service.save(student);
		if (student2 != null) {
			ModelAndView view = new ModelAndView("home.jsp");
			view.addObject("student", "saved data");
			return view;
		} else {

			ModelAndView view = new ModelAndView("/loadstudent");
			return view;
		}
	}

	@RequestMapping("/displaystudent")
	public ModelAndView display(@ModelAttribute Student student) {

		ModelAndView view = new ModelAndView("getall.jsp");
		view.addObject("list", service.GetAll(student));
		
		return view;
	}

	@RequestMapping("/editstudent")
	public ModelAndView edit(@ModelAttribute Student student) {
		ModelAndView view = new ModelAndView("update.jsp");
		view.addObject("update", service.GetById(student));
		return view;
	}

	@RequestMapping("/update")
	public ModelAndView update(@ModelAttribute Student student) {
		service.UpDate(student);
		ModelAndView view = new ModelAndView("/displaystudent");
		view.addObject("update", student);
		return view;
	}

	@RequestMapping("/delete")
	public ModelAndView delete(@ModelAttribute Student student) {
		service.Delete(student);
		ModelAndView view = new ModelAndView("/displaystudent");
		return view;
	}
}
