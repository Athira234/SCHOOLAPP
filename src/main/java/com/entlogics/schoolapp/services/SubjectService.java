package com.entlogics.schoolapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entlogics.schoolapp.models.Subject;
import com.entlogics.schoolapp.repo.ISubjectRepository;

@Service
public class SubjectService implements ISubjectService {
	public ISubjectRepository subrepo;

	@Autowired
	public void setSubrepo(ISubjectRepository subrepo) {
		this.subrepo = subrepo;
	}

	@Override
	public int addSubject(Subject sub) {

		System.out.println("inside addSubject() SchoolService");
		subrepo.addSubject(sub);
		return sub.getSubjectId();

	}

}
