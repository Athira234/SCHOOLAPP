package com.entlogics.schoolapp.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "lt_student_exam")
@IdClass(StudentExam.class)
public class StudentExam implements Serializable {
    @Id
	@ManyToOne
	@JoinColumn(name = "student_id")
	private Student student;
	
    @Id
	@ManyToOne
	@JoinColumn(name ="exam_id")
	private Exam exam;
    
	@Column(name = "marks")
	private int marks;
	
	@Column(name = "grade")
	private char grade;
	
	@Column(name = "result_status")
	private char resultstatus;
	
	@Column(name = "is_present")
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
