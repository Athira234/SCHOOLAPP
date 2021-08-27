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
@Table(name = "dt_exam")
public class Exam {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "exam_id")
	private int examId;
	@Column(name = "class_id")
	private int classId;

	@Column(name = "subject_id")
	private int subjectId;
	@Column(name = "exam_name")
	private String examName;
	@Column(name = "exam_date")
	private String examDate;
	@Column(name = "exam_time")
	private String examTime;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "subject_id", referencedColumnName = "subject_id", insertable = false, updatable = false)
	private Subject subjectForExam;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "class_id", referencedColumnName = "class_id", insertable = false, updatable = false)
	private SchoolClass classOfExam;

	@OneToMany(mappedBy = "exam", cascade = CascadeType.ALL)
	List<StudentExam> studentsOfExam;

	public Exam(int examId, String examName, String examDate, String examTime) {
		super();
		this.examId = examId;
		this.examName = examName;
		this.examDate = examDate;
		this.examTime = examTime;
	}

	public Exam() {
		super();
		
	}

	public Subject getSubjectForExam() {
		return subjectForExam;
	}

	public void setSubjectForExam(Subject subjectForExam) {
		this.subjectForExam = subjectForExam;
	}

	public SchoolClass getClassOfExam() {
		return classOfExam;
	}

	public void setClassOfExam(SchoolClass classOfExam) {
		this.classOfExam = classOfExam;
	}

	public int getExamId() {
		return examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public String getExamDate() {
		return examDate;
	}

	public void setExamDate(String examDate) {
		this.examDate = examDate;
	}

	public String getExamTime() {
		return examTime;
	}

	public void setExamTime(String examTime) {
		this.examTime = examTime;
	}

	public List<StudentExam> getStudentsOfExam() {
		return studentsOfExam;
	}

	public void setStudentsOfExam(List<StudentExam> studentsOfExam) {
		this.studentsOfExam = studentsOfExam;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	@Override
	public String toString() {
		return "Exam [examId=" + examId + ", examName=" + examName + "]";
	}

}
