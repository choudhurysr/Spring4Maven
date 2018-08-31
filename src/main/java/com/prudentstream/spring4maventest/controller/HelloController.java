package com.prudentstream.spring4maventest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HelloController {
	@RequestMapping("/hello")
	public ModelAndView sayHello(
			@RequestParam(value = "name", required = false, defaultValue = "Learner") String name) { 
		ModelAndView mv = new ModelAndView("hello");
		mv.addObject("testMsg", "Spring 4 Maven Hello Test");
		mv.addObject("name", name);
		return mv;
	}
}