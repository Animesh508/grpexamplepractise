package in.co.rightwaylearning.controller;

import java.sql.ResultSet;

import in.co.rightwaylearning.models.Student;
import in.co.rightwaylearning.service.StudentServices;

public class FrontController {
	
	StudentServices studentServices;
	
	public Integer save(Student student) {
		int i = 0;
		try {
		 i = studentServices.saveStudentObject(student);	
		}catch(Exception e) {}
		return i;
	}
	public Integer update(Student student){
		try {}catch(Exception e) {}
		return null;
	}
	public Integer delete(Student student) {
		try {}catch(Exception e) {}
		return null;
	}
	public ResultSet read(){
		try {}catch(Exception e) {}
		return null;
	}
	public ResultSet read(Integer id ) {
		try {}catch(Exception e) {}
		return null;
	}

}
