package com.entlogics.schoolapp.repo;

import java.util.List;

import org.hibernate.mapping.Array;

import com.entlogics.schoolapp.models.Student;

public interface IStudentRepository {

	public int addStudent(Student s);

	public Student findStudent(int studentId);



	public List<Student> findStudents(List<Integer> studentClassId);

}
