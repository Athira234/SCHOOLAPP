package com.entlogics.schoolapp.repo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.entlogics.schoolapp.models.Exam;
import com.entlogics.schoolapp.models.School;
import com.entlogics.schoolapp.models.SchoolClass;
import com.entlogics.schoolapp.models.SchoolSubject;
import com.entlogics.schoolapp.models.Student;
import com.entlogics.schoolapp.models.StudentExam;
import com.entlogics.schoolapp.models.StudentSubject;
import com.entlogics.schoolapp.models.Subject;

@Repository
public class SchoolRepository implements ISchoolRepository {

	// create session factory
			SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(School.class)
									.addAnnotatedClass(SchoolClass.class)
									.addAnnotatedClass(Student.class)
									.addAnnotatedClass(Subject.class)
									.addAnnotatedClass(Exam.class)
									.addAnnotatedClass(SchoolSubject.class)
									.addAnnotatedClass(StudentSubject.class)
									.addAnnotatedClass(StudentExam.class)
									.buildSessionFactory();
			// create session
			Session session = factory.getCurrentSession();
	@Override
	public List<School> findAllSchools() {
		session.beginTransaction();
		List<School> schools=session.createQuery("from School").getResultList();
		System.out.println(schools);
		session.getTransaction().commit();
		factory.close();
		return schools;
		
	}

	@Override
	public School findSchool(int schoolId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SchoolClass> findAllClasses(int schoolId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Subject> findAllSubjects(int schoolId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAllStudents(int schoolId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Exam> findAllExams(int schoolId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createSchool(School school) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void editSchool(School school, int schoolId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSchool(int schoolId) {
		// TODO Auto-generated method stub
		
	}

}
