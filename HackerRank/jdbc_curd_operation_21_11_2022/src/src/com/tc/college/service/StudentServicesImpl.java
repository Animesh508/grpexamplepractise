package src.com.tc.college.service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import src.com.tc.college.dao.IStudentDao;
import src.com.tc.college.dao.StudentDaoImpl;
import src.com.tc.college.models.Student;
import src.com.tc.college.models.TransectionStatus;

public class StudentServicesImpl implements IStudentServices {

	public IStudentDao iStudentDao = new StudentDaoImpl();

	@Override
	public Integer saveStudentObject(Student student) {
		if (student != null) {
			return iStudentDao.saveStudentObject(student);
		}
		return null;
	}

	@Override
	public List<Student> getStudentAllData() {
		try {
			List<Student> list = new ArrayList<>();
			ResultSet data = iStudentDao.getStudentAllData();
			while (data.next()) {
				Student student = new Student(data.getInt(1), data.getString(2), data.getString(3), data.getInt(4),
						data.getString(5));
				list.add(student);
			}
			return list;
		} catch (Exception e) {
			System.out.println(e);
		}

		return null;
	}

	@Override
	public Student getSingleObject(Integer id) {
		try {
		ResultSet data = iStudentDao.getStudentObject(id);
		if(data.next()) {
			Student student = new Student(data.getInt(1), data.getString(2), data.getString(3), data.getInt(4),
					data.getString(5));
			return student;
		}
		}catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}

	@Override
	public Integer updateStudentObject(Student student) {
		return iStudentDao.updateStudentObject(student);
	}

	@Override
	public Integer deleteStudentObject(Integer id) {
		return iStudentDao.deleteStudentObject(id);
	}

	@Override
	public TransectionStatus fundTransper(Integer custNo, Integer payeeCustNo, Double bal) {
	  return iStudentDao.fundTransper(custNo, payeeCustNo, bal);
	}

}
