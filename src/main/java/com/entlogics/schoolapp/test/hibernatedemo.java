package com.entlogics.schoolapp.test;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entlogics.schoolapp.models.School;
import com.entlogics.schoolapp.repo.SchoolRepository;


public class hibernatedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.buildSessionFactory();

// create session
Session session = factory.getCurrentSession();
session.beginTransaction();
		if(session.isConnected())
			System.out.println("connected.......");
		
		session.getTransaction().commit();
		factory.close();
	}

}
