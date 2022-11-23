package student.crud.operation;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

public class Controller {
	static StudentDao studentDao = new StudentDaoImple();
	
	public static void main(String[] args) throws SQLException {
//		Student s = new Student(1, "cool", "nike", 23 , "M");
//		int i = studentDao.save(s);
		System.out.println("Number of object saved" + i);
		
		List<Student> records = studentDao.read();
		
		Iterator<Student> itr = records.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
