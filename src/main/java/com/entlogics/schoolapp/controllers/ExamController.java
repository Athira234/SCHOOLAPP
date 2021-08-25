package com.entlogics.schoolapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entlogics.schoolapp.models.Exam;
import com.entlogics.schoolapp.services.IExamService;

@Controller
@ComponentScan
public class ExamController {

	IExamService iExamService;
	
	@Autowired
	public void setiExamService(IExamService iExamService) {
		this.iExamService = iExamService;
	}
	@RequestMapping("/exams")
	public String exam() {
       
		System.out.println("inside exam() method");
	
		return "exam";
	}
	@RequestMapping("/exams/addExamForm")
	public String loadNewExamForm(Model m) {

		System.out.println("inside loadNewExamForm() method in ExamController");
		Exam e= new Exam();

		
		m.addAttribute("exam", e);
		return "new-exam-form";
	}

	@RequestMapping("/exams/examsdetails")
	public String saveExam(@ModelAttribute("exam") Exam e) {
		System.out.println("Save exam");
		iExamService.addExam(e);
		return "success";
	}
	
	
	
}
