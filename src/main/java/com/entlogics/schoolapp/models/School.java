package com.entlogics.schoolapp.models;

import java.util.List;

public class School {
	private int schoolId;

	private String schoolName;
	private String schoolAddress;
	private String schoolEmail;
	private String schoolPhone;
	List<Student> studentsOfSchool;
	List<Exam> examsOfSchool;
	List<SchoolSubject> subjectsOfSchool;
	List<SchoolClass> classesOfSchool;

	public School(int schoolId, String schoolName, String schoolAddress, String schoolPhone) {
		super();
		this.schoolId = schoolId;
		this.schoolName = schoolName;
		this.schoolAddress = schoolAddress;
		this.schoolPhone = schoolPhone;
	}

	
	







	public School() {
		// TODO Auto-generated constructor stub
	}










	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	public String getSchoolEmail() {
		return schoolEmail;
	}

	public void setSchoolEmail(String schoolEmail) {
		this.schoolEmail = schoolEmail;
	}

	public String getSchoolPhone() {
		return schoolPhone;
	}

	public void setSchoolPhone(String schoolPhone) {
		this.schoolPhone = schoolPhone;
	}

	public List<Student> getStudentsOfSchool() {
		return studentsOfSchool;
	}

	public void setStudentsOfSchool(List<Student> studentsOfSchool) {
		this.studentsOfSchool = studentsOfSchool;
	}

	public List<Exam> getExamsOfSchool() {
		return examsOfSchool;
	}

	public void setExamsOfSchool(List<Exam> examsOfSchool) {
		this.examsOfSchool = examsOfSchool;
	}

	public List<SchoolSubject> getSubjectsOfSchool() {
		return subjectsOfSchool;
	}

	public void setSubjectsOfSchool(List<SchoolSubject> subjectsOfSchool) {
		this.subjectsOfSchool = subjectsOfSchool;
	}

	public List<SchoolClass> getClassesOfSchool() {
		return classesOfSchool;
	}

	public void setClassesOfSchool(List<SchoolClass> classesOfSchool) {
		this.classesOfSchool = classesOfSchool;
	}
	@Override
	public String toString() {
		return "School [schoolId=" + schoolId + ", schoolName=" + schoolName + ", schoolAddress=" + schoolAddress
				+ ", schoolEmail=" + schoolEmail + ", schoolPhone=" + schoolPhone + ", studentsOfSchool="
				+ studentsOfSchool + ", examsOfSchool=" + examsOfSchool + ", subjectsOfSchool=" + subjectsOfSchool
				+ ", classesOfSchool=" + classesOfSchool + "]";
	}
}
