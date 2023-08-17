package com.jsp.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Test1 {
	@RequestMapping("/test1")
	public ModelAndView test1() {

		ModelAndView view = new ModelAndView("index.jsp");
		view.addObject("msg", "hello");
		return view;
	}
//	@RequestMapping("/test2")
//	public ModelAndView test2()
//	{
 		student student=new student();
//		student.setId(1);
//		student.setName("nithin");
//		student.setAge(25);
//		ModelAndView view=new ModelAndView("student.jsp");
//	/	view.addObject("stu", student );
//		return view;
//	}
	
	
	@RequestMapping("/load")
	public ModelAndView load()
	{
		ModelAndView view=new ModelAndView("register.jsp");
		 view.addObject("stu1",new student());
		 return view;
	}
	
	@RequestMapping("/save")
	public ModelAndView save(@ModelAttribute student student )
	{
		ModelAndView view=new  ModelAndView("student.jsp");
		view.addObject("stu",student);
		return view;
	}
}
