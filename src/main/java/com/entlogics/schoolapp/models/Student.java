package com.entlogics.schoolapp.models;

import java.util.List;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;
	private String studentEmail;
	private String studentPhone;
	private SchoolClass classOfStudent;
	List<StudentExam> examsForStudent;
	List<StudentSubject> subjectsOfStudent;

	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	public SchoolClass getClassOfStudent() {
		return classOfStudent;
	}

	public void setClassOfStudent(SchoolClass classOfStudent) {
		this.classOfStudent = classOfStudent;
	}

	public List<StudentExam> getExamsForStudent() {
		return examsForStudent;
	}

	public void setExamsForStudent(List<StudentExam> examsForStudent) {
		this.examsForStudent = examsForStudent;
	}

	public List<StudentSubject> getSubjectsOfStudent() {
		return subjectsOfStudent;
	}

	public void setSubjectsOfStudent(List<StudentSubject> subjectsOfStudent) {
		this.subjectsOfStudent = subjectsOfStudent;
	}

}
