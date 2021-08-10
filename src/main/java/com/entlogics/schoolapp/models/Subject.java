package com.entlogics.schoolapp.models;

import java.util.List;

public class Subject {
	private int subjectId;
	private String subjectName;
	List<Exam> examsForSubject;
	List<StudentSubject> studentsLearningSubject;
	List<SchoolSubject> schoolsHavingSubject;

	public Subject(int subjectId, String subjectName) {
		super();
		this.subjectId = subjectId;
		this.subjectName = subjectName;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public List<Exam> getExamsForSubject() {
		return examsForSubject;
	}

	public void setExamsForSubject(List<Exam> examsForSubject) {
		this.examsForSubject = examsForSubject;
	}

	public List<StudentSubject> getStudentsLearningSubject() {
		return studentsLearningSubject;
	}

	public void setStudentsLearningSubject(List<StudentSubject> studentsLearningSubject) {
		this.studentsLearningSubject = studentsLearningSubject;
	}

	public List<SchoolSubject> getSchoolsHavingSubject() {
		return schoolsHavingSubject;
	}

	public void setSchoolsHavingSubject(List<SchoolSubject> schoolsHavingSubject) {
		this.schoolsHavingSubject = schoolsHavingSubject;
	}

}
