package com.tc.college.dao;

import java.sql.ResultSet;

import com.tc.college.models.Student;
import com.tc.college.models.TransectionStatus;

public interface IStudentDao {

	public Integer saveStudentObject(Student student);
	public ResultSet getStudentAllData();
	public ResultSet getStudentObject(Integer id);
	public Integer updateStudentObject(Student student);
	public Integer deleteStudentObject(Integer id);
    public TransectionStatus fundTransper(Integer mineAcc, Integer payeeAccount, Double bal);	
}
