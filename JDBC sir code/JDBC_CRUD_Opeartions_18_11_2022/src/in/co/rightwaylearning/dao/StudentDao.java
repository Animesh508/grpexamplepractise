package in.co.rightwaylearning.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import in.co.rightwaylearning.models.Student;

public interface StudentDao {

	public Integer save(Student student) throws SQLException;
	public Integer update(Student student) throws SQLException;
	public Integer delete(Student student) throws SQLException;
	public ResultSet read() throws SQLException;
	public ResultSet read(Integer id ) throws SQLException;

}
