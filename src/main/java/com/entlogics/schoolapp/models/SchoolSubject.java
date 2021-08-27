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
@Table(name = "lt_school_subject")
@IdClass(SchoolSubject.class)
public class SchoolSubject implements Serializable {
	@Id
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "school_id")
	private School school;
	@Id
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "subject_id")
	private Subject subject;
	@Column(name = "subject_HOD")
	private String subjectHOD;

	public SchoolSubject() {
		super();

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
