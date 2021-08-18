package com.entlogics.schoolapp.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entlogics.schoolapp.models.Exam;
import com.entlogics.schoolapp.models.School;
import com.entlogics.schoolapp.models.SchoolClass;
import com.entlogics.schoolapp.models.SchoolSubject;
import com.entlogics.schoolapp.models.Student;
import com.entlogics.schoolapp.models.StudentExam;
import com.entlogics.schoolapp.models.StudentSubject;
import com.entlogics.schoolapp.models.Subject;

public class SchoolRepository implements ISchoolRepository {

	// create session factory
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(School.class)
			.addAnnotatedClass(SchoolClass.class).addAnnotatedClass(Student.class).addAnnotatedClass(Subject.class)
			.addAnnotatedClass(Exam.class).addAnnotatedClass(SchoolSubject.class)
			.addAnnotatedClass(StudentSubject.class).addAnnotatedClass(StudentExam.class).buildSessionFactory();

	// create and open session
	Session session = factory.getSessionFactory().openSession();

	@Override
	public List<School> findAllSchools() {
		// find list of schools
		// start transaction
		session.beginTransaction();
		// getting list of schools from database
		List<School> schools = session.createQuery("from School").getResultList();
		System.out.println(schools);
		// commit
		session.getTransaction().commit();
		// factory.close();
		return schools;

	}

	public void testfindAllSchools() {
		// test method for testing findAllSchools()
		List<School> schools = findAllSchools();
		System.out.println("school list is :" + schools);
	}

	@Override
	public School findSchool(int schoolId) {
		// find details of one school
		session.beginTransaction();
		// getting school with particular schoolId
		School school = session.get(School.class, schoolId);
		System.out.println("School details :" + school);
		session.getTransaction().commit();
		// factory.close();

		return school;
	}

	public void testfindSchool() {
		// test method for testing findSchool()
		School s = findSchool(1);
		System.out.println("School details :" + s);
	}

	@Override
	public List<SchoolClass> findAllClasses(int schoolId) {
		// find all classes in a school
		List<SchoolClass> classes = session.createQuery("from SchoolClass where school_id=" + schoolId).getResultList();
		return classes;
	}

	public void testfindAllClasses() {
		// test method for testing findAllClasses()
		List<SchoolClass> classes = findAllClasses(1);
		System.out.println("Classes :" + classes);
	}

	@Override
	public List<Subject> findAllSubjects(int schoolId) {
		// find all subjects of a school
		// getting school Object with schoolId
		School school = session.get(School.class, schoolId);
		// getting list of schoolsubject Objects of school
		List<SchoolSubject> ss = school.getSubjectsOfSchool();

		// for each entry with particular schoolId find subjects
		ListIterator litr = ss.listIterator();
		List<Subject> subjects = new ArrayList<Subject>();
		while (litr.hasNext()) {

			SchoolSubject ss1 = (SchoolSubject) litr.next();

			subjects.add(ss1.getSubject());
		}

		return subjects;

	}

	public void testfindAllSubjects() {
		// test method for testing findAllSubjects()
		List<Subject> subjects = findAllSubjects(1);
		System.out.println("Subjects :" + subjects);
	}

	@Override
	public List<Student> findAllStudents(int schoolId) {

		// find all students of a school
		// getting school Object with schoolId
		School school = session.get(School.class, schoolId);
		// getting list of classes of school
		List<SchoolClass> sc = school.getClassesOfSchool();

		// for each entry with particular schoolId find students
		ListIterator litr = sc.listIterator();
		List<Student> students = new ArrayList<Student>();
		while (litr.hasNext()) {

			SchoolClass sc1 = (SchoolClass) litr.next();

			students.addAll(sc1.getStudentsOfClass());
		}
		return students;
	}

	public void testfindAllStudents() {
		// test method for testing findAllStudents()
		List<Student> students = findAllStudents(1);
		System.out.println("Students :" + students);
	}

	@Override
	public List<Exam> findAllExams(int schoolId) {
		// find all exams of a school
		// getting school Object with schoolId
		School school = session.get(School.class, schoolId);
		// getting list of classes of school
		List<SchoolClass> sc = school.getClassesOfSchool();

		// for each entry with particular schoolId find exams
		ListIterator litr = sc.listIterator();
		List<Exam> exams = new ArrayList<Exam>();
		while (litr.hasNext()) {

			SchoolClass sc1 = (SchoolClass) litr.next();

			exams.addAll(sc1.getExamsOfClass());
		}
		return exams;
	}

	public void testfindAllExams() {
		// test method for testing findAllExams()
		List<Exam> exams = findAllExams(1);
		System.out.println("Exams:" + exams);
	}

	@Override
	public int createSchool(School school) {
		// save school
		session.beginTransaction();
		school.setSchoolName("KPRGSGHSS");
		school.setSchoolAddress("KANNUR");
		school.setSchoolEmail("kpr@gmail.com");
		school.setSchoolPhone("2780622");
		session.save(school);
		session.getTransaction().commit();
		return school.getSchoolId();
	}

	public void testCreateSchool() {
		School school = new School();
		System.out.println("Created new School with id" + createSchool(school));
	}

	@Override
	public void editSchool(School school, int schoolId) {
		session.beginTransaction();
		school.setSchoolName("MAMBARAM HSS");
		school.setSchoolAddress("KANNUR");
		school.setSchoolEmail("HSS@gmail.com");
		school.setSchoolPhone("2780623");
		session.save(school);
		session.getTransaction().commit();
		System.out.println("EDITED");
	}

	public void testEditSchool() {
		School school = findSchool(1);
		editSchool(school, 1);
	}

	@Override
	public void deleteSchool(int schoolId) {
		session.beginTransaction();
		// School s = session.get(School.class, schoolId);
		session.createQuery("delete from School where school_id=" + schoolId).executeUpdate();
		session.getTransaction().commit();
		System.out.println("deleted school :" + schoolId);
	}

	public void testdeleteSchool() {

		deleteSchool(15);
	}

	public static void main(String[] args) {
		SchoolRepository repo = new SchoolRepository();
		repo.testfindAllSchools();
		repo.testfindSchool();
		repo.testfindAllClasses();
		repo.testfindAllSubjects();
		repo.testfindAllStudents();
		repo.testfindAllExams();
		// repo.testCreateSchool();
		repo.testEditSchool();
		repo.testdeleteSchool();
	}
}