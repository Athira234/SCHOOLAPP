package com.entlogics.schoolapp.services;

import java.util.List;

import com.entlogics.schoolapp.models.Exam;

public interface IExamService {

	public int addExam(Exam e);

	public List<Exam> getExams(int classId, int subjectId);

}
