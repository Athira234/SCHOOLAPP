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
public class StudentSubject implements Serializable {
	public StudentSubject() {
		super();

	}

	@Id
	@Column(name = "student_id")
	private int studentId;
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "student_id", referencedColumnName = "student_id", insertable = false, updatable = false)
	private Student student;
	@Id
	@Column(name = "subject_id")
	private int subjectId;
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "subject_id", referencedColumnName = "subject_id", insertable = false, updatable = false)
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

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

}
