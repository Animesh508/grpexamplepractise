package in.co.rightwaylearning.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.co.rightwaylearning.dao.StudentDao;
import in.co.rightwaylearning.models.Student;

public class StudentServicesImpl implements StudentServices {

	StudentDao studentDao;
	
	@Override
	public Integer saveStudentObject(Student student) throws SQLException {
		return studentDao.save(student);
	}

	@Override
	public Integer updateStudentObject(Student student) throws SQLException{
		return studentDao.update(student);
	}

	@Override
	public Integer deleteStudent(Student student) throws SQLException{
		return studentDao.delete(student);
	}

	@Override
	public List<Student> readAllRecords() throws SQLException{
		 List<Student> list= new ArrayList<>();
         ResultSet records = studentDao.read();
		 
		while (records.next()) {
			Student s = new Student(records.getInt(1), records.getString(2), records.getString(3), records.getInt(4),records.getString(5));
			list.add(s);
		}
		
		return list;
	}

	@Override
	public Student readSingleObject(Integer id) throws SQLException {
		Student s = null;
		ResultSet records = studentDao.read(id);
		if(records.next()) {
        	 s = new Student(records.getInt(1), records.getString(2), records.getString(3), records.getInt(4),records.getString(5));
        }
		return s;
	}

}
