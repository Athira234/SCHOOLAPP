package com.entlogics.schoolapp.models;

public class StudentExam {
	private Student student;
	private Exam exam;
	private int marks;
	private char grade;
	private char resultstatus;
	private boolean isPresent;

	public StudentExam(Student student, Exam exam) {
		super();
		this.student = student;
		this.exam = exam;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public char getResultstatus() {
		return resultstatus;
	}

	public void setResultstatus(char resultstatus) {
		this.resultstatus = resultstatus;
	}

	public boolean isPresent() {
		return isPresent;
	}

	public void setPresent(boolean isPresent) {
		this.isPresent = isPresent;
	}

}
