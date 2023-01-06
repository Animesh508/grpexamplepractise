package com.tc.college.services;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mysql.cj.protocol.Resultset;
import com.tc.college.dao.Istudentdao;
import com.tc.college.dao.StudentDAoImpl;
import com.tc.college.models.Student;
@Component
public class StudentServicesImpl implements IstudentServices {
	@Autowired
	@Qualifier("StudentDAoImpl")
	public Istudentdao istudentdao;
	
	@Override
	public Integer saveStudentObject(Student student) {
		if (student != null) {
			return istudentdao.saveStudentObject(student);
		}
		return null;
	}
	@Override
	public List<Student> getStudentAllData() {
		try {
			List<Student> list = new ArrayList<>();
			ResultSet data = istudentdao.getStudentAllData();
			while(data.next()) {
				Student student = new Student(data.getInt(1), data.getString(2), data.getString(3), data.getInt(4), data.getString(5));
				list.add(student);
			}
			return list;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	@Override
	public Student getSingleObject(Integer id) {
		try {
			ResultSet data = istudentdao.getStudentObject(Id);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
}