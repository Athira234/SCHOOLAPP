package com.entlogics.schoolapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entlogics.schoolapp.models.SchoolClass;
import com.entlogics.schoolapp.services.IClassService;
import com.entlogics.schoolapp.services.ISchoolService;

@Controller
@ComponentScan
public class ClassController {
	IClassService iClassService;
	
	@Autowired
	public void setiClassService(IClassService iClassService) {
		this.iClassService = iClassService;
	}



	@RequestMapping("/classes")
	String getAllClasses() {
       
		System.out.println("inside getAllClasses() method");
	
		return "class";
	}
	
	
	
	@RequestMapping("/classes/addClassForm")
	String loadNewClassForm(Model m) {
       
		System.out.println("inside loadNewClassForm() method");
		SchoolClass theClass = new SchoolClass();
	//get list of schools
		//sent the list of schools to jsp
		m.addAttribute("schoolClass", theClass);
		return "new-class-form";
	}

	@RequestMapping("/classes/classdetails")
	public String saveClass(@ModelAttribute("schoolClass") SchoolClass c) {
		System.out.println("Inside saveClass() method of SchoolController");
		 iClassService.addClass(c);
		return "success";
	}
}
