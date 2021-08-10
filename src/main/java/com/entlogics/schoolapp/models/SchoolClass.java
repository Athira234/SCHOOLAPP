package com.entlogics.schoolapp.models;

import java.util.List;

public class SchoolClass {
	private int classId;
	private String className;
	private String classTeacherName;
	private School schoolOfClass;
	List<Student> studentsOfClass;
	List<Exam> examsOfClass;

	public SchoolClass(int classId, String className) {
		super();
		this.classId = classId;
		this.className = className;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getClassTeacherName() {
		return classTeacherName;
	}

	public void setClassTeacherName(String classTeacherName) {
		this.classTeacherName = classTeacherName;
	}

	public School getSchoolOfClass() {
		return schoolOfClass;
	}

	public void setSchoolOfClass(School schoolOfClass) {
		this.schoolOfClass = schoolOfClass;
	}

	public List<Student> getStudentsOfClass() {
		return studentsOfClass;
	}

	public void setStudentsOfClass(List<Student> studentsOfClass) {
		this.studentsOfClass = studentsOfClass;
	}

	public List<Exam> getExamsOfClass() {
		return examsOfClass;
	}

	public void setExamsOfClass(List<Exam> examsOfClass) {
		this.examsOfClass = examsOfClass;
	}

	

}
