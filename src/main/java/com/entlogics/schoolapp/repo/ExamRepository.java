package com.entlogics.schoolapp.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entlogics.schoolapp.models.Exam;
import com.entlogics.schoolapp.models.Student;
@Repository
public class ExamRepository implements IExamRepository {
	public SessionFactory sfactory;

	@Autowired
	public void setSfactory(SessionFactory sfactory) {
		this.sfactory = sfactory;
	}

	@Override
	public int addExam(Exam e) {
		System.out.println("Inside addExam() in repo");

		Session session = sfactory.getSessionFactory().openSession();

		session.beginTransaction();

		session.save(e);
		session.getTransaction().commit();
		return e.getExamId();
	}

	@Override
	public List<Exam> findExams(int classId, int subjectId) {
		System.out.println("Inside findExams() in Exam repo");
		Session session = sfactory.getSessionFactory().openSession();
		session.beginTransaction();
		List<Exam> exams = session.createQuery("from Exam").getResultList();
		
		ListIterator litr = exams.listIterator();
	
		List<Exam> exams1 = new ArrayList<Exam>();

		for (Exam e : exams) {
				if (e.getClassId() == classId && e.getSubjectId()==subjectId)
					
					exams1.add(e);
				}
			
		session.getTransaction().commit();
			
		return exams1;
	
	}

}
