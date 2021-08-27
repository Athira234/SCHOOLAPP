package com.entlogics.schoolapp.controllers;

import java.util.ArrayList;
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

import com.entlogics.schoolapp.models.Exam;
import com.entlogics.schoolapp.models.School;
import com.entlogics.schoolapp.models.SchoolClass;
import com.entlogics.schoolapp.models.Student;
import com.entlogics.schoolapp.models.StudentExam;
import com.entlogics.schoolapp.models.StudentSubject;
import com.entlogics.schoolapp.models.Subject;
import com.entlogics.schoolapp.services.IClassService;
import com.entlogics.schoolapp.services.ISchoolService;
import com.entlogics.schoolapp.services.IStudentService;

@Controller
@ComponentScan
public class StudentController {

	IStudentService iStudentService;

	@Autowired
	public void setiStudentService(IStudentService iStudentService) {
		this.iStudentService = iStudentService;
	}

	ISchoolService iSchoolService;

	@Autowired
	public void setiSchoolService(ISchoolService iSchoolService) {
		this.iSchoolService = iSchoolService;
	}

	@RequestMapping("/students")
	String getStudents(@RequestParam(value = "classId") List<Integer> studentClassId, Model model) {
		System.out.println("inside getStudents() Method in StudentController");
		List<Student> students = iStudentService.getStudents(studentClassId);
		ListIterator litr = students.listIterator();

		while (litr.hasNext()) {
			Student s = (Student) litr.next();
			System.out.println("Student Object is : " + s);
		}
		model.addAttribute("studentList", students);
		return "student";
	}

	// Method for getting one student
	@RequestMapping("/students/{studentId}")
	String getStudent(@PathVariable int studentId, Model model) {
		System.out.println("inside getStudent() Method in StudentController");
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
		System.out.println("inside saveStudent() Method in StudentController");
		iStudentService.addStudent(s);
		return "success";
	}

	@RequestMapping("/students/{studentId}/subjects")
	String addSubjectforStudentForm(@PathVariable int studentId, Model model) {
		System.out.println("Inside addSubjectforStudentForm method in studentcontroller");
		Student student = iStudentService.getStudent(studentId);
		System.out.println("student details " + student);
		SchoolClass class1 = student.getClassOfStudent();
		System.out.println("class details " + class1);
		School school = class1.getSchoolOfClass();
		int schoolId = school.getSchoolId();
		List<Subject> subjects = iSchoolService.getAllSubjects(schoolId);
		System.out.println("subjects details " + subjects);
		StudentSubject stsubjects = new StudentSubject();
		model.addAttribute("student", student);
		model.addAttribute("stsubjects", stsubjects);
		model.addAttribute("subjects", subjects);
		return "add-subject-form";
	}

	@RequestMapping("/students/{studentId}/addsubjectdetails")
	public String saveSubjectForStudent(@PathVariable int studentId,
			@ModelAttribute("stsubjects") StudentSubject stsubjects) {
		System.out.println("Inside saveSubjectForStudent() method in studentcontroller");
		stsubjects.setStudentId(studentId);
		iStudentService.addSubjectsForStudent(stsubjects);
		return "success";
	}

	@RequestMapping("/students/{studentId}/exams")
	String addExamforStudentForm(@PathVariable int studentId, Model model) {
		System.out.println("Inside addExamforStudentForm method in studentcontroller");
		Student student = iStudentService.getStudent(studentId);
		System.out.println("student details " + student);
		SchoolClass class1 = student.getClassOfStudent();
		System.out.println("class details " + class1);
		School school = class1.getSchoolOfClass();
		int schoolId = school.getSchoolId();
		List<Exam> exams = iSchoolService.getAllExams(schoolId);
		StudentExam stexams = new StudentExam();
		model.addAttribute("student", student);
		model.addAttribute("stexams", stexams);
		model.addAttribute("exams", exams);
		return "add-exam-form";
	}

	@RequestMapping("/students/{studentId}/addexamdetails")
	public String saveExamForStudent(@PathVariable int studentId, @ModelAttribute("stexams") StudentExam stexams) {
		System.out.println("Inside saveSubjectForStudent() method in studentcontroller");
		stexams.setStudentId(studentId);
		iStudentService.addExamsForStudent(stexams);
		return "success";
	}

}
