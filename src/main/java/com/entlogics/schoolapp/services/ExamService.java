package com.entlogics.schoolapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entlogics.schoolapp.models.Exam;
import com.entlogics.schoolapp.repo.IExamRepository;
import com.entlogics.schoolapp.repo.ISchoolRepository;

@Service
public class ExamService implements IExamService {
	public IExamRepository erepo;

	@Autowired
	public void setRepo(IExamRepository erepo) {
		this.erepo = erepo;
	}
	@Override
	public int addExam(Exam e) {

		System.out.println("inside addExam() SchoolService");
		erepo.addExam(e);
		return e.getExamId();
	}

}
