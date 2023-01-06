package com.tc.college.client;

import java.util.Iterator;
import java.util.List;

import com.tc.college.controller.MineController;
import com.tc.college.models.Student;

public class Controller {
	public static void main(String[] args) {
		MineController mine = new MineController();
		Student s = new Student(1, "Giraffe", "Gajbaye", 66, "T");
		
		Integer i = mine.insertStudentObject(s);
		System.out.println("number of object inserted " + i);
		
		List<Student> data = mine.getAllStudentsData();
		Iterator<Student> itr = data.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
