package com.tc.college.dao;

import java.sql.ResultSet;

import com.tc.college.models.Student;

public interface Istudentdao {
	public Integer saveStudentObject(Student student);
	public ResultSet getStudentAllData();

}
