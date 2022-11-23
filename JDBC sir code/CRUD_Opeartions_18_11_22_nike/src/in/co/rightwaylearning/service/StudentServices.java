package in.co.rightwaylearning.service;

import java.sql.SQLException;
import java.util.List;

import in.co.rightwaylearning.models.Student;

public interface StudentServices {

	public Integer saveStudentObject(Student student) throws SQLException;
	public Integer updateStudentObject(Student student) throws SQLException;
	public Integer deleteStudent(Student student) throws SQLException;
	public List<Student> readAllRecords() throws SQLException;
	public Student readSingleObject(Integer id ) throws SQLException;
}
