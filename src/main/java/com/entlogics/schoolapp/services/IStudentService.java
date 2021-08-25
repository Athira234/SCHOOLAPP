package com.entlogics.schoolapp.services;

import java.util.List;

import org.hibernate.mapping.Array;

import com.entlogics.schoolapp.models.Student;

public interface IStudentService {

 public	int addStudent(Student s);

public Student getStudent(int studentId);

public List<Student> getStudents(List<Integer> studentClassId);

}
