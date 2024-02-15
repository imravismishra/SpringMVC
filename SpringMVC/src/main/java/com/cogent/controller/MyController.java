package com.cogent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@GetMapping("/")
	public String home() {
		return "home";
	}
//	
//	@PostMapping("/send")
//	public String get(@RequestBody String name)
//	{
//		System.out.println(name);
//		return "home";
//	}

	@PostMapping("/send")
	public ModelAndView get(@RequestBody String name) {
		System.out.println(name);
		ModelAndView mv = new ModelAndView("show");
		mv.addObject("n", name);

		return mv;
	}
}
