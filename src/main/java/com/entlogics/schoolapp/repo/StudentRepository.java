package com.entlogics.schoolapp.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.mapping.Array;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entlogics.schoolapp.models.School;
import com.entlogics.schoolapp.models.SchoolSubject;
import com.entlogics.schoolapp.models.Student;
import com.entlogics.schoolapp.models.Subject;

@Repository
public class StudentRepository implements IStudentRepository {
	public SessionFactory sfactory;

	@Autowired
	public void setSfactory(SessionFactory sfactory) {
		this.sfactory = sfactory;
	}

	@Override
	public int addStudent(Student s) {
		System.out.println("Inside addStudent() in repo");

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
		ListIterator litr = ls.listIterator();
		//int j=0;
		List<Student> students = new ArrayList<Student>();

		//for (int i = 0; i <= studentClassId.size(); i++) {
			//System.out.println("count ="+i);
		int i=0;
		   for(Integer j:studentClassId)
		   {	   
			for(Student s:ls){ 
				if (s.getStudentClassId() == j)
				System.out.println("count ="+i++);
         if (s.getStudentClassId()==j) {
					
					students.add(s);
				}  
				}  
		   }
			/*while (litr.hasNext()) {
				//System.out.println("count ="+j);
				
				Student s1 = (Student) litr.next();
				System.out.println("studentClassId :"+s1.getStudentClassId());
				if (s1.getStudentClassId() == studentClassId.get(i)) {
					
					students.add(s1);
				}
				*/
				//students.add(s1);
		

	//	}
		System.out.println(students);

		session.getTransaction().commit();

		return students;
	}

}
