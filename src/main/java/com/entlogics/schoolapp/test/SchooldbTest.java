package com.entlogics.schoolapp.test;

import java.util.List;

import com.entlogics.schoolapp.models.School;
import com.entlogics.schoolapp.repo.SchoolRepository;

public class SchooldbTest {

	public static void main(String[] args) {
	
		   SchoolRepository repo=new SchoolRepository();
		      List<School> schools= repo.findAllSchools();
		      
		      System.out.println(schools);
		      

}
}