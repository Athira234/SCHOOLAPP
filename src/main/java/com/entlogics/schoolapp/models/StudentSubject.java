package com.entlogics.schoolapp.models;

public class StudentSubject {

	private Student student;
	private Subject subject;
	private float attendancePercentage;

	public StudentSubject(Student student, Subject subject) {
		super();
		this.student = student;
		this.subject = subject;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public float getAttendancePercentage() {
		return attendancePercentage;
	}

	public void setAttendancePercentage(float attendancePercentage) {
		this.attendancePercentage = attendancePercentage;
	}

	

}
