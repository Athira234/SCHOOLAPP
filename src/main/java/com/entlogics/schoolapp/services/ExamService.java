package com.entlogics.schoolapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entlogics.schoolapp.models.Exam;
import com.entlogics.schoolapp.repo.IExamRepository;

@Service
public class ExamService implements IExamService {
	public IExamRepository erepo;

	@Autowired
	public void setRepo(IExamRepository erepo) {
		this.erepo = erepo;
	}
	@Override
	public int addExam(Exam e) {

		System.out.println("inside addExam() ExamService");
		erepo.addExam(e);
		return e.getExamId();
	}
	@Override
	public List<Exam> getExams(int classId, int subjectId) {
		System.out.println("inside getExams() ExamService");
		List<Exam> exams = erepo.findExams(classId,subjectId);

		return exams;
	}

}
