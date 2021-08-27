package com.entlogics.schoolapp.controllers;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entlogics.schoolapp.models.Exam;
import com.entlogics.schoolapp.models.School;
import com.entlogics.schoolapp.models.SchoolClass;
import com.entlogics.schoolapp.models.Student;
import com.entlogics.schoolapp.models.Subject;
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
	public String welcome(Model model) {
		System.out.println("Inside welcome() method in welcomecontroller");
		School school = iSchoolService.getSchool(1);
		List<Subject> subjects = new ArrayList<Subject>();
		List<SchoolClass> classes = new ArrayList<SchoolClass>();
		subjects.addAll(iSchoolService.getAllSubjects(1));
		classes.addAll(iSchoolService.getAllClasses(1));
		model.addAttribute("classList", classes);
		model.addAttribute("subjectList", subjects);
		return "welcome";
	}

}
