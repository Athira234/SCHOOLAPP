package com.entlogics.schoolapp.repo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.entlogics.schoolapp.models.Subject;

@Repository
public class SubjectRepository implements ISubjectRepository {
	public SessionFactory sfactory;

	@Autowired
	public void setSfactory(SessionFactory sfactory) {
		this.sfactory = sfactory;
	}

	@Override
	public int addSubject(Subject sub) {
		System.out.println("Inside addSubject() in SubjectRepository");
		Session session = sfactory.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(sub);
		session.getTransaction().commit();
		return sub.getSubjectId();

	}

}
