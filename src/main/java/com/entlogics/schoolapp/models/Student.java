package com.entlogics.schoolapp.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "dt_student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private int studentId;
	@Column(name = "class_id")
	private int studentClassId;

	@Column(name = "student_name")
	private String studentName;
	@Column(name = "roll_number")
	private int rollNumber;
	@Column(name = "address")
	private String studentAddress;
	@Column(name = "email")
	private String studentEmail;
	@Column(name = "phonenumber")
	private String studentPhone;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "class_id", referencedColumnName = "class_id", insertable = false, updatable = false)
	private SchoolClass classOfStudent;
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
	List<StudentExam> examsForStudent;
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
	List<StudentSubject> subjectsOfStudent;

	public Student() {
		super();

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

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public int getStudentClassId() {
		return studentClassId;
	}

	public void setStudentClassId(int studentClassId) {
		this.studentClassId = studentClassId;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}

}
