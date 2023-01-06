package com.tc.college.services;

import java.util.List;

import com.tc.college.models.Student;
import com.tc.college.models.TransectionStatus;

public interface IstudentServices {
	public Integer saveStudentObject(Student student);
	public List<Student> getStudentAllData();
	public int[] saveStudentBatch(List<Student> list);
	public Student getSingleObject(Integer id);
	public Integer uodateStudentObject(Student student);
	public Integer deleteStudentObject (Integer id);
	public TransectionStatus fundTransper(Integer custNo, Integer payeeCustNo, Double bal);
	

}
