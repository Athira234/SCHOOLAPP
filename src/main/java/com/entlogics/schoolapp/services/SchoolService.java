package com.entlogics.schoolapp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entlogics.schoolapp.models.Exam;
import com.entlogics.schoolapp.models.School;
import com.entlogics.schoolapp.models.SchoolClass;
import com.entlogics.schoolapp.models.SchoolSubject;
import com.entlogics.schoolapp.models.Student;
import com.entlogics.schoolapp.models.StudentSubject;
import com.entlogics.schoolapp.models.Subject;
import com.entlogics.schoolapp.repo.ISchoolRepository;
import com.entlogics.schoolapp.repo.SchoolRepository;

@Service
public class SchoolService implements ISchoolService {

	public static List<School> listOfSchools = new ArrayList<School>();

	public ISchoolRepository repo;

	@Autowired
	public void setRepo(ISchoolRepository repo) {
		this.repo = repo;
	}

	/*
	 * @Override public void createDatabase() {
	 * System.out.println("Creating Database...."); // create school objects
	 * 
	 * School s1 = new School(1, "KPRGSGHSS", "KANNUR,KERALA", "8978907859"); School
	 * s2 = new School(2, "MAHATHMA HS", "BENGALORE", "9978907859"); School s3 = new
	 * School(3, "NEHRU HSS", "BENGALORE,KARNATAKA", "899907859");
	 * 
	 * // create Subject objects
	 * 
	 * Subject sub1 = new Subject(1, "MATHS"); Subject sub2 = new Subject(2,
	 * "ENGLISH"); Subject sub3 = new Subject(3, "SCIENCE"); Subject sub4 = new
	 * Subject(4, "HINDI");
	 * 
	 * // adding subjects in school objects
	 * 
	 * SchoolSubject ss1 = new SchoolSubject(s1, sub1); SchoolSubject ss2 = new
	 * SchoolSubject(s1, sub2); SchoolSubject ss3 = new SchoolSubject(s1, sub3);
	 * SchoolSubject ss4 = new SchoolSubject(s2, sub1); SchoolSubject ss5 = new
	 * SchoolSubject(s2, sub2); SchoolSubject ss6 = new SchoolSubject(s2, sub3);
	 * SchoolSubject ss7 = new SchoolSubject(s3, sub1); SchoolSubject ss8 = new
	 * SchoolSubject(s3, sub2); SchoolSubject ss9 = new SchoolSubject(s3, sub3);
	 * 
	 * // create schoolsubject list List<SchoolSubject> ssList1 = new
	 * ArrayList<SchoolSubject>(); List<SchoolSubject> ssList2 = new
	 * ArrayList<SchoolSubject>(); List<SchoolSubject> ssList3 = new
	 * ArrayList<SchoolSubject>();
	 * 
	 * ssList1.add(ss1); ssList1.add(ss2); ssList1.add(ss3); ssList2.add(ss4);
	 * ssList2.add(ss5); ssList2.add(ss6); ssList3.add(ss7); ssList3.add(ss8);
	 * ssList3.add(ss9); s1.setSubjectsOfSchool(ssList1);
	 * s2.setSubjectsOfSchool(ssList2); s3.setSubjectsOfSchool(ssList3); // create
	 * Class objects SchoolClass c1 = new SchoolClass(1, "STD-1"); SchoolClass c2 =
	 * new SchoolClass(2, "STD-2"); SchoolClass c3 = new SchoolClass(3, "STD-3");
	 * 
	 * // create class list List<SchoolClass> scList = new ArrayList<SchoolClass>();
	 * List<SchoolClass> scList1 = new ArrayList<SchoolClass>(); List<SchoolClass>
	 * scList2 = new ArrayList<SchoolClass>(); scList.add(c1); scList1.add(c2);
	 * scList2.add(c3);
	 * 
	 * s1.setClassesOfSchool(scList); s2.setClassesOfSchool(scList1);
	 * s3.setClassesOfSchool(scList2);
	 * 
	 * // create Student objects Student st1 = new Student(1, "ANIL"); Student st2 =
	 * new Student(2, "ANIKHA"); Student st3 = new Student(3, "VAIGA"); Student st4
	 * = new Student(4, "VISHNU");
	 * 
	 * Student st5 = new Student(5, "ANILA"); Student st6 = new Student(6, "ANIKH");
	 * Student st7 = new Student(7, "VAIGA"); Student st8 = new Student(8, "VIMAL");
	 * 
	 * Student st9 = new Student(9, "ANUMOL"); Student st10 = new Student(10,
	 * "AARAV"); Student st11 = new Student(11, "ISHANI"); Student st12 = new
	 * Student(12, "SHIVANI"); // create student list List<Student> stList = new
	 * ArrayList<Student>(); List<Student> stList1 = new ArrayList<Student>();
	 * List<Student> stList2 = new ArrayList<Student>();
	 * 
	 * stList.add(st1); stList.add(st2); stList.add(st3); stList.add(st4);
	 * 
	 * stList1.add(st5); stList1.add(st6); stList1.add(st7); stList1.add(st8);
	 * 
	 * stList2.add(st9); stList2.add(st10); stList2.add(st11); stList2.add(st12);
	 * 
	 * // adding students to class students list c1.setStudentsOfClass(stList);
	 * c2.setStudentsOfClass(stList1); c3.setStudentsOfClass(stList2); // create
	 * Exam objects Exam e1 = new Exam(1, "UNIT_TEST", "20-02-2021", "2:30PM"); Exam
	 * e2 = new Exam(2, "ANNUAL_TEST", "20-03-2021", "1:30PM"); // create Exam list
	 * List<Exam> eList = new ArrayList<Exam>(); eList.add(e1); eList.add(e2); //
	 * adding exams to class c1.setExamsOfClass(eList); c2.setExamsOfClass(eList);
	 * c3.setExamsOfClass(eList); listOfSchools.add(s1); listOfSchools.add(s2);
	 * listOfSchools.add(s3);
	 * 
	 * System.out.println("Size of the School Database is :" +
	 * listOfSchools.size());
	 * System.out.println("Creating Database Succesfully..."); }
	 */

	@Override
	public List<School> getAllSchools()

	{
		listOfSchools = repo.findAllSchools();

		return listOfSchools;
	}

	@Override
	public School getSchool(int schoolId) {

		School school = repo.findSchool(schoolId);
		

		return school;

	}

	public List<SchoolClass> getAllClasses(int schoolId) {

		List<SchoolClass> classesOfSchool = repo.findAllClasses(schoolId);

		return classesOfSchool;
	}

	@Override
	public List<Student> getAllStudents(int schoolId) {

		List<Student> studentsOfClass = repo.findAllStudents(schoolId);
		return studentsOfClass;
	}

	@Override

	public List<Subject> getAllSubjects(int schoolId) {
		List<Subject> subjects = repo.findAllSubjects(schoolId);

		return subjects;
	}

	@Override

	public List<Exam> getAllExams(int schoolId) {

		List<Exam> examOfClass = repo.findAllExams(schoolId);

		return examOfClass;
	}

	@Override
	public int createSchool(School school) {
		repo.createSchool(school);
		return school.getSchoolId();
	}

	@Override
	public void editSchool(School school) {
		repo.editSchool(school);

	}

	@Override
	public void deleteSchool(int schoolId) {
		repo.deleteSchool(schoolId);

	}

	@Override
	public void createDatabase() {
		// TODO Auto-generated method stub

	}

}
