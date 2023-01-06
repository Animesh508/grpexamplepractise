package src.com.tc.college.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import src.com.tc.college.models.Student;
import src.com.tc.college.models.TransectionStatus;

public class StudentDaoImpl implements IStudentDao {

	public Connection con;

	public StudentDaoImpl() {
		try {
			this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "root");
		} catch (Exception e) {
		}
	}

	@Override
	public Integer saveStudentObject(Student student) {
		try {
			PreparedStatement stm = con.prepareStatement("insert into student values(?,?,?,?,?)");
			stm.setInt(1, student.getId());
			stm.setString(2, student.getFirstName());
			stm.setString(3, student.getLastName());
			stm.setInt(4, student.getAge());
			stm.setString(5, student.getGender());

			int updatedRows = stm.executeUpdate();
			return updatedRows;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	@Override
	public ResultSet getStudentAllData() {
		try {
			PreparedStatement stm = con.prepareStatement("select * from student");
			ResultSet data = stm.executeQuery();
			return data;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	@Override
	public ResultSet getStudentObject(Integer id) {
		try {
			PreparedStatement stm = con.prepareStatement("select * from student where id = ?");
			stm.setInt(1, id);
			ResultSet data = stm.executeQuery();
			return data;

		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	@Override
	public Integer updateStudentObject(Student student) {
		try {
			PreparedStatement stm = con.prepareStatement(
					"update student set first_name = ? , last_name = ?, age = ? , gender = ? where id = ?");

			stm.setString(1, student.getFirstName());
			stm.setString(2, student.getLastName());
			stm.setInt(3, student.getAge());
			stm.setString(4, student.getGender());
			stm.setInt(5, student.getId());

			return stm.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	@Override
	public Integer deleteStudentObject(Integer id) {
		if (id != null) {
			try {
				PreparedStatement stm = con.prepareStatement("delete from student where id = ?");
				stm.setInt(1, id);
				return stm.executeUpdate();

			} catch (Exception e) {
				System.out.println(e);
			}
		}
		return null;
	}
	
	private Double getBalance(Integer mineCutNo) {
		try {
			PreparedStatement stm = con.prepareStatement("select * from account where cust_no = ?");
		    stm.setInt(1, mineCutNo);
		    ResultSet r = stm.executeQuery();
		    if(r.next()) {
		    Double currentBal = r.getDouble(4);
		    return currentBal;
		    }
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return null;
	}

	@Override
	public TransectionStatus fundTransper(Integer mineCutNo, Integer payeeCustNo, Double bal) {
		try {
			Double currentBal = getBalance(mineCutNo);
			 if(currentBal >= bal) {
				 
				 con.setAutoCommit(false);
				 
				 PreparedStatement stm = con.prepareStatement("update account set bal= ? where cust_no= ?");
				 stm.setDouble(1, currentBal - bal);
				 stm.setInt(2, mineCutNo);
				 stm.executeUpdate();
				 
				 int d = 10/0;
				 Double currentPayeeBal = getBalance(payeeCustNo);
				 
				 PreparedStatement stm1 = con.prepareStatement("update account set bal= ? where cust_no= ?");
				 stm1.setDouble(1, currentPayeeBal + bal);
				 stm1.setInt(2, payeeCustNo);
				 stm1.executeUpdate();
				 
				 
				 TransectionStatus tx = new TransectionStatus();
				 tx.setStatus(true);
				 tx.setMessage("balance transper ");
				 
				 con.commit();
				 return tx;
				 
			 }
			 
			 
				 TransectionStatus tx = new TransectionStatus();
				 tx.setStatus(false);
				 tx.setMessage("Insufficient balance");
				 return tx;
			 
						
		}catch(Exception e) {
			try {
			   con.rollback();
			}catch(Exception e1) {}
			System.out.println(e);
		}
		
		return null;
	}

}
