package com.entlogics.schoolapp.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.entlogics.schoolapp.models.Exam;
import com.entlogics.schoolapp.models.School;
import com.entlogics.schoolapp.models.SchoolClass;
import com.entlogics.schoolapp.models.Student;
import com.entlogics.schoolapp.models.Subject;

@Repository
public interface ISchoolRepository {

	public List<School> findAllSchools();

	public School findSchool(int schoolId);

	public List<SchoolClass> findAllClasses(int schoolId);

	public List<Subject> findAllSubjects(int schoolId);

	public List<Student> findAllStudents(int schoolId);

	public List<Exam> findAllExams(int schoolId);

	public int createSchool(School school);

	public void editSchool(School school);

	public void deleteSchool(int schoolId);

}
