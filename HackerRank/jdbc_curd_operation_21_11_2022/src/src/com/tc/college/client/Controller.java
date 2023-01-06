
package src.com.tc.college.client;

import java.util.Iterator;
import java.util.List;

import src.com.tc.college.controller.MineController;
import src.com.tc.college.models.Student;
import src.com.tc.college.models.TransectionStatus;

public class Controller {

	public static void main(String[] args) {
		
		MineController c = new MineController();
		
		// insert single object
//		Student s = new Student();
//		s.setId(3);
//		s.setFirstName("Kedar");
//		s.setLastName("Jadhav");
//		s.setAge(37);
//		s.setGender("male");
//		
//		int i = c.insertStudentObject(s);
//		System.out.println("number of object inserted "+ i);
		
		// read all objects
//		List<Student> data = c.getAllStudentsData();
//		Iterator<Student> itr = data.iterator();
//		while(itr.hasNext()) {
//			Student s1 = itr.next();
//			System.out.println(s1);
//		}
		
		// read single Object & then update
//		Student s1 = c.getStudentObject(3);
//		System.out.println("before update");
//		System.out.println(s1);
//		
//		s1.setLastName("sharma");
//		s1.setAge(32);
//		c.updateStudentObject(s1);
//		
//		System.out.println("after update");
//		Student s2 = c.getStudentObject(3);
//		System.out.println(s2);
		
		// delete  operation
//		Student s3 = c.getStudentObject(3);
//		System.out.println(s3);
//		c.deleteStudentObject(s3.getId());
		
		TransectionStatus obj = c.fundTransper(5678, 1234, 1000.00);
		System.out.println(obj);
		
	}
}
