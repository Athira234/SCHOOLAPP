package com.entlogics.schoolapp.controllers;

import java.util.List;
import java.util.ListIterator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.entlogics.schoolapp.models.Exam;
import com.entlogics.schoolapp.services.IExamService;
import com.entlogics.schoolapp.services.ISchoolService;

@Controller
@ComponentScan
public class ExamController {

	IExamService iExamService;

	@Autowired
	public void setiExamService(IExamService iExamService) {
		this.iExamService = iExamService;
	}

	ISchoolService iSchoolService;

	@Autowired
	public void setiSchoolService(ISchoolService iSchoolService) {
		this.iSchoolService = iSchoolService;
	}

	@RequestMapping("/exams")
	public String getExams(@RequestParam(value = "classId") int classId,
			@RequestParam(value = "subjectId") int subjectId, Model model) {
		System.out.println("Inside getExams() method in Exam Controller");
		List<Exam> exams = iExamService.getExams(classId, subjectId);
		ListIterator litr = exams.listIterator();

		while (litr.hasNext()) {

			Exam exam = (Exam) litr.next();

			System.out.println("Exam Object is : " + exam);
		}
		model.addAttribute("examsList", exams);
		return "exam";
	}

	@RequestMapping("/exams/addExamForm")
	public String loadNewExamForm(Model m) {
		System.out.println("inside loadNewExamForm() method in ExamController");
		Exam e = new Exam();
		m.addAttribute("exam", e);
		return "new-exam-form";
	}

	@RequestMapping("/exams/examsdetails")
	public String saveExam(@ModelAttribute("exam") Exam e) {
		System.out.println("inside saveExam() method in ExamController");
		iExamService.addExam(e);
		return "success";
	}

}
