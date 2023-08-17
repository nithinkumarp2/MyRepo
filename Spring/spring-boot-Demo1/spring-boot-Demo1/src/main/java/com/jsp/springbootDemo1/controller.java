package com.jsp.springbootDemo1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {

	@RequestMapping("/home")
	 
	public ModelAndView home(Student student )
	{
		ModelAndView v=new ModelAndView("home.jsp");
		 v.addObject("name",student);
		 
		System.out.println("hello "+student);
		 
		return v;
	}
}
