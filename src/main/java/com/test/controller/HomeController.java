package com.test.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@EnableAutoConfiguration
public class HomeController {
	
	@RequestMapping("/")
	public ModelAndView home(){
		return new ModelAndView("home");
	}

	@RequestMapping("/page1")
	public ModelAndView firstPage(){
		return new ModelAndView("page1");
	}
}
