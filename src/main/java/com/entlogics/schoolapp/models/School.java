package com.entlogics.schoolapp.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "dt_school")
public class School {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "school_id", nullable = false)
	private int schoolId;
	@Column(name = "name")
	private String schoolName;
	@Column(name = "address")
	private String schoolAddress;
	@Column(name = "email")
	private String schoolEmail;
	@Column(name = "phonenumber")
	private String schoolPhone;

	@OneToMany(mappedBy = "classOfStudent", cascade = CascadeType.ALL)
	List<Student> studentsOfSchool;

	@OneToMany(mappedBy = "classOfExam", cascade = CascadeType.ALL)
	List<Exam> examsOfSchool;

	@OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
	List<SchoolSubject> subjectsOfSchool;

	@OneToMany(mappedBy = "schoolOfClass", cascade = CascadeType.ALL)
	private List<SchoolClass> classesOfSchool;

	public School() {

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
