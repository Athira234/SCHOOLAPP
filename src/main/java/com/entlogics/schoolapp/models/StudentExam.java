package com.entlogics.schoolapp.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "lt_student_exam")
@IdClass(StudentExam.class)
public class StudentExam implements Serializable {
	@Id
	@Column(name = "student_id")
	private int studentId;
	@ManyToOne
	@JoinColumn(name = "student_id", referencedColumnName = "student_id", insertable = false, updatable = false)
	private Student student;

	@Id
	@Column(name = "exam_id")
	private int examId;
	@ManyToOne
	@JoinColumn(name = "exam_id", referencedColumnName = "exam_id", insertable = false, updatable = false)
	private Exam exam;

	@Column(name = "marks")
	private int marks;

	@Column(name = "grade")
	private char grade;

	enum resultstatus {
		PASS, FAIL;
	}

	@Column(name = "result_status")
	private resultstatus resultstatus;

	@Column(name = "is_present")
	private boolean isPresent;

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

	public boolean isPresent() {
		return isPresent;
	}

	public void setPresent(boolean isPresent) {
		this.isPresent = isPresent;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getExamId() {
		return examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public resultstatus getResultstatus() {
		return resultstatus;
	}

	public void setResultstatus(resultstatus resultstatus) {
		this.resultstatus = resultstatus;
	}

}
