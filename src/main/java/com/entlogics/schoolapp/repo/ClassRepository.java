package com.entlogics.schoolapp.repo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entlogics.schoolapp.models.SchoolClass;

@Repository
public class ClassRepository implements IClassRepository {
	
	
	public SessionFactory sfactory;

	@Autowired
	public void setSfactory(SessionFactory sfactory) {
		this.sfactory = sfactory;
	}

	@Override
	public int addClass(SchoolClass c) {
		System.out.println("Inside addClass() in repo");
	
		Session session = sfactory.getSessionFactory().openSession();

		session.beginTransaction();
		session.save(c);
		session.getTransaction().commit();
		return c.getClassId();

	}
}
