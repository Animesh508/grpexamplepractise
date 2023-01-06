package src.com.tc.college.controller;

import java.util.List;

import src.com.tc.college.models.Student;
import src.com.tc.college.models.TransectionStatus;
import src.com.tc.college.service.IStudentServices;
import src.com.tc.college.service.StudentServicesImpl;

public class MineController {

	public IStudentServices iStudentServices = new StudentServicesImpl();

	public Integer insertStudentObject(Student student) {
		if (student != null && student.getId() != null) {
			return iStudentServices.saveStudentObject(student);
		}
		return null;
	}

	public List<Student> getAllStudentsData() {
		return iStudentServices.getStudentAllData();
	}
	
	public Student getStudentObject(Integer id) {
		return iStudentServices.getSingleObject(id);
	}
	
	public Integer updateStudentObject(Student student) {
		return iStudentServices.updateStudentObject(student);
	}
	
	public Integer deleteStudentObject(Integer id) {
		return iStudentServices.deleteStudentObject(id);
	}
	
	 public TransectionStatus fundTransper(Integer custNo, Integer payeeCustNo, Double bal) {
		 return iStudentServices.fundTransper(custNo, payeeCustNo, bal);
	 }	
}
