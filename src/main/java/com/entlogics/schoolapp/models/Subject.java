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
@Table(name = "dt_subject")
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "subject_id", nullable = false)
	private int subjectId;
	@Column(name = "subject_name")
	private String subjectName;
	@Column(name = "is_elective")
	private boolean isElective;

	@OneToMany(mappedBy = "subjectForExam", cascade = CascadeType.ALL)
	List<Exam> examsForSubject;
	@OneToMany(mappedBy = "subject", cascade = CascadeType.ALL)
	List<StudentSubject> studentsLearningSubject;
	@OneToMany(mappedBy = "subject", cascade = CascadeType.ALL)
	List<SchoolSubject> schoolsHavingSubject;

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(int subjectId, String subjectName) {
		super();
		this.subjectId = subjectId;
		this.subjectName = subjectName;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public List<Exam> getExamsForSubject() {
		return examsForSubject;
	}

	public void setExamsForSubject(List<Exam> examsForSubject) {
		this.examsForSubject = examsForSubject;
	}

	public List<StudentSubject> getStudentsLearningSubject() {
		return studentsLearningSubject;
	}

	public void setStudentsLearningSubject(List<StudentSubject> studentsLearningSubject) {
		this.studentsLearningSubject = studentsLearningSubject;
	}

	public List<SchoolSubject> getSchoolsHavingSubject() {
		return schoolsHavingSubject;
	}

	public void setSchoolsHavingSubject(List<SchoolSubject> schoolsHavingSubject) {
		this.schoolsHavingSubject = schoolsHavingSubject;
	}

	public boolean getIsElective() {
		return isElective;
	}

	public void setElective(boolean isElective) {
		this.isElective = isElective;
	}

	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", subjectName=" + subjectName + ", isElective=" + isElective + "]";
	}

}
