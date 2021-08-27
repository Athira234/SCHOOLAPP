package com.entlogics.schoolapp.controllers;

import java.util.List;
import java.util.ListIterator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.entlogics.schoolapp.models.Exam;
import com.entlogics.schoolapp.models.School;
import com.entlogics.schoolapp.models.SchoolClass;
import com.entlogics.schoolapp.models.Student;
import com.entlogics.schoolapp.models.Subject;
import com.entlogics.schoolapp.services.ISchoolService;

@Controller
@ComponentScan
public class SchoolController {

	ISchoolService iSchoolService;

	@Autowired
	public void setiSchoolService(ISchoolService iSchoolService) {
		this.iSchoolService = iSchoolService;
	}

	@RequestMapping("/schools")
	String getAllSchools(Model model) {
		System.out.println("Inside School Controller getAllschools() method");
		List<School> schools = iSchoolService.getAllSchools();
		ListIterator litr = schools.listIterator();

		while (litr.hasNext()) {
			School s = (School) litr.next();
			System.out.println("School Object is : " + s);
		}
		model.addAttribute("schoolList", schools);
		return "list-school";
	}

	@RequestMapping("/schools/{schoolId}")
	String getSchool(@PathVariable int schoolId, Model model) {
		System.out.println("Inside getSchool() method in SchoolController ");
		School s = iSchoolService.getSchool(schoolId);
		model.addAttribute("school", s);

		return "schooldetails";
	}

	@RequestMapping("/schools/{schoolId}/classes")
	String getAllClassesOfSchool(@PathVariable int schoolId, Model model)

	{
		System.out.println("Inside getAllClassesOfSchool() method in SchoolController ");
		List<SchoolClass> classesOfSchool = iSchoolService.getAllClasses(schoolId);
		System.out.println(classesOfSchool);
		ListIterator litr = classesOfSchool.listIterator();
		while (litr.hasNext()) {
			SchoolClass sc = (SchoolClass) litr.next();
			System.out.println("Class Object is : " + sc);
		}
		model.addAttribute("classList", classesOfSchool);
		return "classes";
	}

	@RequestMapping("/schools/{schoolId}/students")
	String getAllStudentsOfSchool(@PathVariable int schoolId, Model model) {
		System.out.println("Inside getAllStudentsOfSchool() method in SchoolController ");
		List<Student> studentsOfSchool = iSchoolService.getAllStudents(schoolId);
		System.out.println("student of class" + studentsOfSchool);
		ListIterator litr = studentsOfSchool.listIterator();

		while (litr.hasNext()) {
			Student st = (Student) litr.next();
			System.out.println("Student Object is : " + st);
		}
		model.addAttribute("studentList", studentsOfSchool);
		return "students";
	}

	@RequestMapping("/schools/{schoolId}/subjects")
	String getAllSubjectsOfSchool(@PathVariable int schoolId, Model model) {
		System.out.println("Inside getAllSubjectsOfSchool() method in SchoolController ");
		List<Subject> subjects = iSchoolService.getAllSubjects(schoolId);
		ListIterator litr = subjects.listIterator();

		while (litr.hasNext()) {
			Subject s = (Subject) litr.next();
		}
		model.addAttribute("subjectList", subjects);
		return "subjects";
	}

	@RequestMapping("/schools/{schoolId}/exams")
	String getAllExamsOfSchool(@PathVariable int schoolId, Model model) {
		System.out.println("Inside getAllExamsOfSchool() method in SchoolController ");
		List<Exam> examsOfSchool = iSchoolService.getAllExams(schoolId);
		ListIterator litr = examsOfSchool.listIterator();

		while (litr.hasNext()) {
			Exam e = (Exam) litr.next();
			System.out.println("exam Object is : " + e);
		}
		model.addAttribute("examList", examsOfSchool);
		return "exams";
	}

	@RequestMapping("/schools/add")
	String createSchool(Model m) {
		System.out.println("Inside createSchool() method in SchoolController ");
		School theSchool = new School();
		m.addAttribute("school", theSchool);
		return "new-school-form";
	}

	@RequestMapping("/schools/details")
	public String saveSchool(@ModelAttribute("school") School school) {
		System.out.println("Inside saveSchool() method in SchoolController ");
		iSchoolService.createSchool(school);
		return "success";
	}

	@RequestMapping("/schools/delete/{schoolId}")
	String deleteSchool(@PathVariable int schoolId) {
		System.out.println("Inside deleteSchool() method in SchoolController ");
		// call delete method in service class
		iSchoolService.deleteSchool(schoolId);
		return "success";
	}

	@RequestMapping("/schools/edit/{schoolId}")
	String editSchool(@PathVariable int schoolId, Model m) {
		System.out.println("Inside editSchool() method in SchoolController ");
		School school;
		school = iSchoolService.getSchool(schoolId);
		System.out.println(school);
		m.addAttribute("school", school);
		return "edit-school-form";
	}

	@RequestMapping("/schools/edit/editdetails")
	public String updateSchool(@ModelAttribute("theschool") School school) {
		System.out.println("Inside updateSchool() method in SchoolController ");
		iSchoolService.editSchool(school);
		return "success";
	}

}