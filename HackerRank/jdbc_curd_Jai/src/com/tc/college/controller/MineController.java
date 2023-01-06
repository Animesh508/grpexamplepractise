package com.tc.college.controller;

import java.util.List;

import com.tc.college.models.Student;
import com.tc.college.services.IstudentServices;
import com.tc.college.services.StudentServicesImpl;



public class MineController {
	
	public IstudentServices istudentServices = new StudentServicesImpl();

	public Integer insertStudentObject(Student student) {
		if (student != null && student.getId() != null) {
			return istudentServices.saveStudentObject(student);
		}
		return null;
	}

	public List<Student> getAllStudentsData() {
		return istudentServices.getStudentAllData();
	}

	

}
