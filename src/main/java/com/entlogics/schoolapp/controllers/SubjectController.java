package com.entlogics.schoolapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.entlogics.schoolapp.models.Subject;
import com.entlogics.schoolapp.services.ISubjectService;

@Controller
@ComponentScan
public class SubjectController {

	ISubjectService iSubjectService;

	@Autowired
	public void setiSubjectService(ISubjectService iSubjectService) {
		this.iSubjectService = iSubjectService;
	}

	@RequestMapping("/subjects")
	public String subject() {
		System.out.println("inside subject() method");
		return "subject";
	}

	@RequestMapping("subjects/addSubjectForm")
	String loadNewSubjectForm(Model m) {
		System.out.println("Inside loadNewSubjectForm() method in SubjectController ");
		Subject sub = new Subject();
		m.addAttribute("subject", sub);
		return "new-subject-form";
	}

	@RequestMapping("subjects/subjectdetails")
	public String saveSubject(@ModelAttribute("subject") Subject sub) {
		System.out.println("Inside saveSubject() method in SubjectController ");
		iSubjectService.addSubject(sub);
		return "success";
	}
}
