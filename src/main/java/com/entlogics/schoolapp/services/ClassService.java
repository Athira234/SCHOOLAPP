package com.entlogics.schoolapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entlogics.schoolapp.models.SchoolClass;
import com.entlogics.schoolapp.repo.IClassRepository;

@Service
public class ClassService implements IClassService {
	
	
	public IClassRepository crepo;
    @Autowired
	public void setCrepo(IClassRepository crepo) {
		this.crepo = crepo;
	}
	@Override
	public int addClass(SchoolClass c) {
		System.out.println("inside addClass() ClassService");
		crepo.addClass(c);
		return c.getClassId();
	}
	

	
}
