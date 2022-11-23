package student.crud.operation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.first.ConnectionObject;

public class StudentDaoImple implements StudentDao{
	Connection con;
	
	public StudentDaoImple() {
		con = ConnectionObject.getConnection();
	}
	
	@Override
	public Integer save(Student student) throws SQLException {
		PreparedStatement stm = con.prepareStatement("insert into student value(?,?,?,?,?)");
		stm.setInt(1, student.getId());
		stm.setString(2, student.getFirstName());
		stm.setString(3,student.getLastName());
		stm.setInt(4,student.getAge());
		stm.setString(5,student.getGender());
		return stm.executeUpdate();
	}
	
	@Override
	public Integer update(Student student) throws SQLException {
		
		PreparedStatement stm = con.prepareStatement("update student set firstName =?, lastName =?, age=?, gender=? where id=?");
		stm.setString(1, student.getFirstName());
		stm.setString(2, student.getLastName());
		stm.setInt(3,student.getAge());
		stm.setString(4, student.getGender());
		stm.setInt(5, student.getId());
		return stm.executeUpdate();
	}
	
	@Override
	public Integer delete(Student student) throws SQLException {
		
		PreparedStatement stm = con.prepareStatement("delete from student where id =?");
		stm.setInt(1,student.getId());
		return stm.executeUpdate();
	}
	
	@Override
	public List<Student> read() throws SQLException {
		List<Student> list = new ArrayList<>();
		
		PreparedStatement stm = con.prepareStatement("select * from student");
		ResultSet records = stm.executeQuery();
		
		while (records.next()) {
			Student s = new Student(records.getInt(1), records.getString(2), records.getString(3), records.getInt(4), records.getString(5));
			list.add(s);
		}
		return list;
	}
	
	@Override
	public Student read(Integer id) throws SQLException {
		Student s = null;
		PreparedStatement stm = con.prepareStatement("select * from student where id =?");
		stm.setInt(1, id);
		ResultSet records = stm.executeQuery();
		if(records.next()) {
			s = new Student(records.getInt(1), records.getString(2), records.getString(3), records.getInt(4), records.getString(5));
			
		}
		return s;
	}

}
