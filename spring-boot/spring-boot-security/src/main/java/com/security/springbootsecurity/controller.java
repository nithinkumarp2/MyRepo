package com.security.springbootsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class controller {

	@GetMapping("/")
	public ModelAndView home()
	{
		ModelAndView m=new ModelAndView("home.html");
		return m;
	}
}
