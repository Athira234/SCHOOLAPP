package com.entlogics.schoolapp.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.entlogics.schoolapp.models.Student;
import com.entlogics.schoolapp.models.StudentExam;
import com.entlogics.schoolapp.models.StudentSubject;
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
		System.out.println("inside addStudent() StudentService");
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
		System.out.println("inside getStudents() Method in StudentService");
		List<Student> students = srepo.findStudents(studentClassId);
		return students;
	}

	@Override
	public void addSubjectsForStudent(StudentSubject stsubjects) {
		System.out.println("inside addSubjectsForStudent() Method in Studentservice");
		srepo.addSubject(stsubjects);
	}

	@Override
	public void addExamsForStudent(StudentExam stexams) {

		System.out.println("inside addExamsForStudent() Method in Studentservice");
		srepo.addExam(stexams);
	}

}
