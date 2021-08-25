package com.entlogics.schoolapp.services;

import java.util.List;

import org.hibernate.mapping.Array;

import com.entlogics.schoolapp.models.Student;
import com.entlogics.schoolapp.models.StudentExam;
import com.entlogics.schoolapp.models.StudentSubject;

public interface IStudentService {

 public	int addStudent(Student s);

public Student getStudent(int studentId);

public List<Student> getStudents(List<Integer> studentClassId);

public void addSubjectsForStudent(StudentSubject stsubjects);

public void addExamsForStudent(StudentExam stexams);

}
