package com.entlogics.schoolapp.repo;

import java.util.List;

import com.entlogics.schoolapp.models.Exam;

public interface IExamRepository {

	public int addExam(Exam e);

	public List<Exam> findExams(int classId, int subjectId);

}
