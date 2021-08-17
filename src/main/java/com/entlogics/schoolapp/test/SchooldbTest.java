package com.entlogics.schoolapp.test;

import java.util.List;

import com.entlogics.schoolapp.models.School;
import com.entlogics.schoolapp.repo.SchoolRepository;

public class SchooldbTest {

	public static void main(String[] args) {

		SchoolRepository repo = new SchoolRepository();
		repo.testfindAllSchools();
		repo.testfindSchool();
		repo.testfindAllClasses();
		repo.testfindAllSubjects();
		repo.testfindAllStudents();
		repo.testfindAllExams();
		//repo.testCreateSchool();
		repo.testEditSchool();
		repo.testdeleteSchool();
	}
}