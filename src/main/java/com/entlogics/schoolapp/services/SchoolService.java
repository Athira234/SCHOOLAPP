package com.entlogics.schoolapp.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.entlogics.schoolapp.models.Exam;
import com.entlogics.schoolapp.models.School;
import com.entlogics.schoolapp.models.SchoolClass;
import com.entlogics.schoolapp.models.Student;
import com.entlogics.schoolapp.models.Subject;
import com.entlogics.schoolapp.repo.ISchoolRepository;

@Service
public class SchoolService implements ISchoolService {

	public ISchoolRepository repo;

	@Autowired
	public void setRepo(ISchoolRepository repo) {
		this.repo = repo;
	}

	@Override
	public List<School> getAllSchools()

	{
		System.out.println("Inside getAllSchools() SchoolService");
		List<School> listOfSchools = repo.findAllSchools();
		return listOfSchools;
	}

	@Override
	public School getSchool(int schoolId) {
		System.out.println("Inside getSchool() SchoolService");
		School school = repo.findSchool(schoolId);
		return school;

	}

	public List<SchoolClass> getAllClasses(int schoolId) {
		System.out.println("Inside getAllClasses() SchoolService");
		List<SchoolClass> classesOfSchool = repo.findAllClasses(schoolId);
		return classesOfSchool;
	}

	@Override
	public List<Student> getAllStudents(int schoolId) {
		System.out.println("Inside getAllStudents() SchoolService");
		List<Student> studentsOfClass = repo.findAllStudents(schoolId);
		return studentsOfClass;
	}

	@Override

	public List<Subject> getAllSubjects(int schoolId) {
		System.out.println("Inside getAllSubjects() SchoolService");
		List<Subject> subjects = repo.findAllSubjects(schoolId);
		return subjects;
	}

	@Override

	public List<Exam> getAllExams(int schoolId) {
		System.out.println("Inside getAllExams() SchoolService");
		List<Exam> examOfClass = repo.findAllExams(schoolId);
		return examOfClass;
	}

	@Override
	public int createSchool(School school) {
		System.out.println("Inside createSchool() SchoolService");
		repo.createSchool(school);
		return school.getSchoolId();
	}

	@Override
	public void editSchool(School school) {
		System.out.println("Inside editSchool() SchoolService");
		repo.editSchool(school);
	}

	@Override
	public void deleteSchool(int schoolId) {
		System.out.println("Inside deleteSchool() SchoolService");
		repo.deleteSchool(schoolId);
	}

}
