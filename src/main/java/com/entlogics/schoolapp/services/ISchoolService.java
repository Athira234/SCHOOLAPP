package com.entlogics.schoolapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.entlogics.schoolapp.models.Exam;
import com.entlogics.schoolapp.models.School;
import com.entlogics.schoolapp.models.SchoolClass;
import com.entlogics.schoolapp.models.SchoolSubject;
import com.entlogics.schoolapp.models.Student;
import com.entlogics.schoolapp.models.Subject;

public interface ISchoolService {

	public List<School> getAllSchools();

	public School getSchool(int schoolId);

	public List<SchoolClass> getAllClasses(int schoolId);

	public List<Subject> getAllSubjects(int schoolId);

	public List<Student> getAllStudents(int schoolId);

	public List<Exam> getAllExams(int schoolId);

	public int createSchool(School school);

	public void editSchool(School school);

	public void deleteSchool(int schoolId);

}
