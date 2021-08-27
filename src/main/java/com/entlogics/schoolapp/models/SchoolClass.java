package com.entlogics.schoolapp.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "dt_class")
public class SchoolClass {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "class_id", nullable = false)
	private int classId;
	@Column(name = "class_name")
	private String className;
	@Column(name = "class_teacher")
	private String classTeacherName;
	@Column(name = "school_id")
	private Integer classSchoolId;
	@ManyToOne
	@JoinColumn(name = "school_id", referencedColumnName = "school_id", insertable = false, updatable = false)
	private School schoolOfClass;

	@OneToMany(mappedBy = "classOfStudent", cascade = CascadeType.ALL)
	private List<Student> studentsOfClass;

	@OneToMany(mappedBy = "classOfExam", cascade = CascadeType.ALL)
	private List<Exam> examsOfClass;

	public SchoolClass() {
		super();

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

	public int getClassSchoolId() {
		return classSchoolId;
	}

	public void setClassSchoolId(int classSchoolId) {
		this.classSchoolId = classSchoolId;
	}

	@Override
	public String toString() {
		return "SchoolClass [classId=" + classId + ", className=" + className + ", classTeacherName=" + classTeacherName
				+ "]";
	}

	/*
	 * @Override public String toString() { return "SchoolClass [classId=" + classId
	 * + ", className=" + className + ", classTeacherName=" + classTeacherName +
	 * ", schoolOfClass=" + schoolOfClass + ", studentsOfClass=" + studentsOfClass +
	 * ", examsOfClass=" + examsOfClass + "]"; }
	 */

}
