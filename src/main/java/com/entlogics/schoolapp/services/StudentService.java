package com.entlogics.schoolapp.services;

import java.util.List;

import org.hibernate.mapping.Array;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entlogics.schoolapp.models.School;
import com.entlogics.schoolapp.models.Student;
import com.entlogics.schoolapp.repo.IClassRepository;
import com.entlogics.schoolapp.repo.IStudentRepository;
@Service
public class StudentService implements IStudentService {
	public IStudentRepository srepo;
    @Autowired
	public void setSrepo(IStudentRepository srepo) {
		this.srepo = srepo;
	}

	@Override
	public int addStudent(Student s) {
		System.out.println("inside addStudent() SchoolService");
		srepo.addStudent(s);
		return s.getStudentId();
	
	}

	@Override
	public Student getStudent(int studentId) {
		Student s = srepo.findStudent(studentId);

		return s;
	}

	@Override

	public List<Student> getStudents(List<Integer> studentClassId) {
		System.out.println("inside findStudents() Method in service");
		List<Student> students = srepo.findStudents(studentClassId);

		return students;
	}

}