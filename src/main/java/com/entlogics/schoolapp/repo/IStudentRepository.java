package com.entlogics.schoolapp.repo;

import java.util.List;

import org.hibernate.mapping.Array;

import com.entlogics.schoolapp.models.Student;
import com.entlogics.schoolapp.models.StudentExam;
import com.entlogics.schoolapp.models.StudentSubject;

public interface IStudentRepository {

	public int addStudent(Student s);

	public Student findStudent(int studentId);



	public List<Student> findStudents(List<Integer> studentClassId);

	public void addSubject(StudentSubject stsubjects);

	public void addExam(StudentExam stexams);

}
