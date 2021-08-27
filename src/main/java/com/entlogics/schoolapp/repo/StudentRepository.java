package com.entlogics.schoolapp.repo;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.entlogics.schoolapp.models.Student;
import com.entlogics.schoolapp.models.StudentExam;
import com.entlogics.schoolapp.models.StudentSubject;

@Repository
public class StudentRepository implements IStudentRepository {
	public SessionFactory sfactory;

	@Autowired
	public void setSfactory(SessionFactory sfactory) {
		this.sfactory = sfactory;
	}

	@Override
	public int addStudent(Student s) {
		System.out.println("Inside addStudent() in StudentRepository");
		Session session = sfactory.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
		return s.getStudentId();

	}

	@Override
	public Student findStudent(int studentId) {
		Session session = sfactory.getSessionFactory().openSession();

		session.beginTransaction();
		Student student = session.get(Student.class, studentId);
		System.out.println("Student details :" + student);
		session.getTransaction().commit();

		return student;
	}

	@Override
	public List<Student> findStudents(List<Integer> studentClassId) {
		System.out.println("inside findStudents() Method in repo");
		Session session = sfactory.getSessionFactory().openSession();
		session.beginTransaction();
		List<Student> ls = session.createQuery("from Student").getResultList();
		System.out.println(ls);
		List<Student> students = new ArrayList<Student>();
		int i = 0;
		for (Integer j : studentClassId) {
			for (Student s : ls) {
				if (s.getStudentClassId() == j)
					System.out.println("count =" + i++);
				if (s.getStudentClassId() == j) {

					students.add(s);
				}
			}
		}
		System.out.println(students);
		session.getTransaction().commit();
		return students;
	}

	@Override
	public void addSubject(StudentSubject stsubjects) {

		System.out.println("Inside addSubject() in StudentRepository");
		Session session = sfactory.getSessionFactory().openSession();
		session.beginTransaction();
		session.createNativeQuery(
				"INSERT INTO  lt_student_subject(student_id,subject_id,attendance_percentage,number_of_assignments) VALUES (?,?,?,?)")
				.setParameter(1, stsubjects.getStudentId()).setParameter(2, stsubjects.getSubjectId())
				.setParameter(3, stsubjects.getAttendancePercentage())
				.setParameter(4, stsubjects.getNumberOfAssignments()).executeUpdate();

		session.getTransaction().commit();

	}

	@Override
	public void addExam(StudentExam stexams) {
		System.out.println("Inside addExam() in StudentRepository");
		Session session = sfactory.getSessionFactory().openSession();
		session.beginTransaction();
		session.createNativeQuery(
				"INSERT INTO  lt_student_exam(student_id,exam_id,marks,is_present,result_status,grade) VALUES (?,?,?,?,?,?)")
				.setParameter(1, stexams.getStudentId()).setParameter(2, stexams.getExamId())
				.setParameter(3, stexams.getMarks()).setParameter(4, stexams.isPresent())
				.setParameter(5, stexams.getResultstatus()).setParameter(6, stexams.getGrade()).executeUpdate();
		session.getTransaction().commit();

	}

}
