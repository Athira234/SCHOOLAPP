package com.entlogics.schoolapp.models;

import java.util.List;

public class Exam {
	private int examId;
	private String examName;
	private String examDate;
	private String examTime;
	private Subject subjectForExam;
	private SchoolClass classOfExam;
	List<StudentExam> studentsOfExam;

	public Exam(int examId, String examName, String examDate, String examTime) {
		super();
		this.examId = examId;
		this.examName = examName;
		this.examDate = examDate;
		this.examTime = examTime;
	}

	public Subject getSubjectForExam() {
		return subjectForExam;
	}

	public void setSubjectForExam(Subject subjectForExam) {
		this.subjectForExam = subjectForExam;
	}

	public SchoolClass getClassOfExam() {
		return classOfExam;
	}

	public void setClassOfExam(SchoolClass classOfExam) {
		this.classOfExam = classOfExam;
	}

	public int getExamId() {
		return examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public String getExamDate() {
		return examDate;
	}

	public void setExamDate(String examDate) {
		this.examDate = examDate;
	}

	public String getExamTime() {
		return examTime;
	}

	public void setExamTime(String examTime) {
		this.examTime = examTime;
	}

	public List<StudentExam> getStudentsOfExam() {
		return studentsOfExam;
	}

	public void setStudentsOfExam(List<StudentExam> studentsOfExam) {
		this.studentsOfExam = studentsOfExam;
	}

}
