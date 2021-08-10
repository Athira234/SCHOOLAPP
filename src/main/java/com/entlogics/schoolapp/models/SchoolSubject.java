package com.entlogics.schoolapp.models;

public class SchoolSubject {

	private School school;
	private Subject subject;
	private String subjectHOD;

	public SchoolSubject(School school, Subject subject) {
		super();
		this.school = school;
		this.subject = subject;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public String getSubjectHOD() {
		return subjectHOD;
	}

	public void setSubjectHOD(String subjectHOD) {
		this.subjectHOD = subjectHOD;
	}

}
