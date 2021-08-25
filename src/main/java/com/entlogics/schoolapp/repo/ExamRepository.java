package com.entlogics.schoolapp.repo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entlogics.schoolapp.models.Exam;
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

}
