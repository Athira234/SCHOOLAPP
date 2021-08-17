package com.entlogics.schoolapp.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "lt_student_subject")
@IdClass(StudentSubject.class)
public class StudentSubject implements Serializable{
	@Id
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "student_id")
	private Student student;
	@Id
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "subject_id")
	private Subject subject;
	@Column(name = "attendance_percentage")
	private float attendancePercentage;
	@Column(name = "number_of_assignments")
	private int numberOfAssignments;

	public int getNumberOfAssignments() {
		return numberOfAssignments;
	}

	public void setNumberOfAssignments(int numberOfAssignments) {
		this.numberOfAssignments = numberOfAssignments;
	}

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
