package src.com.tc.college.service;

import java.util.List;

import com.tc.college.models.Student;
import com.tc.college.models.TransectionStatus;

public interface IStudentServices {

	public Integer saveStudentObject(Student student);
	public List<Student> getStudentAllData();
	public Student getSingleObject(Integer id);
	public Integer updateStudentObject(Student student);
	public Integer deleteStudentObject(Integer id);
	public TransectionStatus fundTransper(Integer custNo, Integer payeeCustNo, Double bal);	
}
