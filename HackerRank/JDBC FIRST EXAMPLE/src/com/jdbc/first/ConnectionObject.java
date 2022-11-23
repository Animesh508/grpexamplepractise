package com.jdbc.first;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionObject {
	static Connection con;
	public static Connection getConnection() {
		try {
			if(con == null) {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","root");
			}
		}catch(Exception e) {
			
		}
		return con;
	}

}
