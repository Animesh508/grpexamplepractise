package com.tc.college.dao;

import java.sql.ResultSet;
import java.util.List;

import com.tc.college.models.Student;
import com.tc.college.models.TransectionStatus;

public interface Istudentdao {
	public Integer saveStudentObject(Student student);
	public ResultSet getStudentAllData();
	public int[] saveStudentBatch(List<Student> list);
	public ResultSet getStudentobject(Integer id);
	public Integer updateStudentObject(Student student);
	public Integer deleteStudentObject (Integer id);
	public TransectionStatus fundTransper(Integer mineAcc, Integer payeeAccount, Double bal);

}
