package com.jdbc.first;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionwithDB {
	public static void main(String[] args) {
		try {
			Connection con = ConnectionObject.getConnection();
			PreparedStatement statment =con.prepareStatement("select * from employees where officeCode = ?");
			statment.setInt(1, 6);
			
			ResultSet result = statment.executeQuery();
			while(result.next()) {
				System.out.println(result.getInt(1)+" "+ result.getString(2)+" "+ result.getString(3));
				
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
