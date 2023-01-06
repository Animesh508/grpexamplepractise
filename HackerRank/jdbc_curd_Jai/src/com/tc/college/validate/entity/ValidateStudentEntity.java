package com.tc.college.validate.entity;

import com.tc.college.models.Student;

public class ValidateStudentEntity {
	public static boolean viladateStudentObject(Student student) {
		if (student != null && student.getId() != null && student.getFirstName() != null && student.getLastName() != null && student.getGender() !=null) {
			return true;			
		}
		System.out.println("validation problem occured while inserting student entity");
		System.out.println(student != null ? student : null);
		
		return false;
	}

}
