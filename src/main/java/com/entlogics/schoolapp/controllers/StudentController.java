package com.entlogics.schoolapp.controllers;

import java.util.List;
import java.util.ListIterator;

import org.hibernate.mapping.Array;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.entlogics.schoolapp.models.School;
import com.entlogics.schoolapp.models.Student;
import com.entlogics.schoolapp.services.IClassService;
import com.entlogics.schoolapp.services.IStudentService;

@Controller
@ComponentScan
public class StudentController {

IStudentService iStudentService;
	
	@Autowired
	public void setiStudentService(IStudentService iStudentService) {
		this.iStudentService = iStudentService;
	}



	@RequestMapping("/students")
	String getStudents(@RequestParam(value="classId") List<Integer> studentClassId, Model model) {
       
		System.out.println("inside getStudents() Method");
		System.out.println("classid :"+studentClassId);
		List<Student> students = iStudentService.getStudents(studentClassId);
		
		ListIterator litr = students.listIterator();
       
		while (litr.hasNext()) {

			Student s = (Student) litr.next();

			System.out.println("Student Object is : " + s);
		}

		model.addAttribute("studentList", students);
				

		return "student";
	}
	
	
	@RequestMapping("/students/{studentId}")
	String getStudent(@PathVariable int studentId, Model model) {
		Student s = iStudentService.getStudent(studentId);
		model.addAttribute("student", s);

		return "student-details";
	}
	
	
	
	
	@RequestMapping("/students/addStudentForm")
	String loadNewStudentForm(Model m) {

		System.out.println("inside loadNewStudentForm() method in StudentController");
		Student theStudent = new Student();

		
		m.addAttribute("student", theStudent);
		return "new-student-form";
	}

	@RequestMapping("/students/studentdetails")
	public String saveStudent(@ModelAttribute("student") Student s) {
		System.out.println("Save student");
		iStudentService.addStudent(s);
		return "success";
	}
	

	
	
}
