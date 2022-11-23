package com.tc.college.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Result;
import com.tc.college.models.Student;

public class StudentDAoImpl implements Istudentdao {
	public Connection con;

	public StudentDAoImpl() {
		try{
			this.con =DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","root");
			
		}catch(Exception e) {
			
		}
		
	}
	@Override
	public Integer saveStudentObject(Student student) {
		try {
			PreparedStatement stm = con.prepareStatement("insert into student values(?,?,?,?,?)");
			stm.setInt(1, student.getId());
			stm.setString(2, student.getFirstName());
			stm.setString(3, student.getLastName());
			stm.setInt(4, student.getAge());
			stm.setString(5, student.getGender());
			
			int updatedRows = stm.executeUpdate();
			return updatedRows;
		}catch(Exception e) {
			System.out.println(e);
		}
		return null;
		
	}
	@Override
	public ResultSet getStudentAllData() {
		try {
			PreparedStatement stm = con.prepareStatement("select * from student");
			ResultSet data = stm.executeQuery();
			return data;
		}catch(Exception e) {
			System.out.println(e);
		}
		return null;
		
	}
	
	
	

}
