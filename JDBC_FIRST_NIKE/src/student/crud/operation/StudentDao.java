package student.crud.operation;

import java.sql.SQLException;
import java.util.List;

public interface StudentDao {
	Integer save(Student student) throws SQLException;
    Integer update(Student student) throws SQLException;
    Integer delete(Student student) throws SQLException;
    List<Student> read() throws SQLException;
    Student read(Integer id) throws SQLException;
}
