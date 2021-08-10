package com.entlogics.schoolapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entlogics.schoolapp.services.ISchoolService;

@Controller
@RequestMapping("/")
public class WelcomeController {

	public ISchoolService iSchoolService;

	
   @Autowired
	public void setiSchoolService(ISchoolService iSchoolService) {
		this.iSchoolService = iSchoolService;
	}



	@RequestMapping("/")
	public String welcome() {
		System.out.println("Inside welcome method");
		iSchoolService.createDatabase();
		return "welcome";
	}

}
