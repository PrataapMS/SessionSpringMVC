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
public class PersonController {
	
	Person p1 = new Person();
	
	@ModelAttribute("personObj")
    public Person getInitializeMyObject() {
        return p1;
    }
	
	@RequestMapping(value="/person-form")
	public ModelAndView personPage(@ModelAttribute("personObj") Person personObj) {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println();
		Map<String, Object> test =modelAndView.getModel();
		System.out.println("Hello your here1"+test);
		System.out.println("Tesing modelAttribute : "+personObj.getFirstName());	
		System.out.println("Sesson id of personObj = "+test.get("personObj"));
		return new ModelAndView("person-page", "person-entity", new Person());
	}
	
	@RequestMapping(value="/process-person")
	public ModelAndView processPerson(@ModelAttribute Person person) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("person-result-page");
		
		modelAndView.addObject("pers", person);
		modelAndView.addObject("personObj", person);
		System.out.println(modelAndView.getModel());
		return modelAndView;
	}
	
}
