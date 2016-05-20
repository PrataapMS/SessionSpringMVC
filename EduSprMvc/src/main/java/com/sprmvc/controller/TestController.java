package com.sprmvc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.sprmvc.bean.Person;

@Controller
@SessionAttributes("personObj")
public class TestController {
	
	@RequestMapping(value="/test-message")
	public ModelAndView personPage(@ModelAttribute("personObj") Person personObj) {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("test");
		
		modelAndView.addObject("testModel", personObj);
		modelAndView.addObject("personObj", personObj);
		
		System.out.println("Testing modelAttribute : " + personObj.getFirstName());
		System.out.println("I am here, in TestController!!!");
		
		return modelAndView;
	}
	
	@RequestMapping(value="/logout")
	public ModelAndView logout(@ModelAttribute("personObj") Person personObj) {
		
		ModelAndView modelAndView = new ModelAndView();
		if(personObj!=null && !personObj.getFirstName().equals("Logged Out")){
			personObj.setFirstName(null);
			personObj.setAge(null);
			modelAndView.setViewName("test");
			modelAndView.addObject("loggedout", "Logged Out!");
			System.out.println("Logged Out!");
			return modelAndView;
		}
		modelAndView.setViewName("person-page");
		
		modelAndView.addObject("testModel", personObj);
		modelAndView.addObject("personObj", personObj);
		
		System.out.println("Testing modelAttribute : " + personObj.getFirstName());
		System.out.println("I am here, in TestController!!!");
		
		return modelAndView;
	}
}
