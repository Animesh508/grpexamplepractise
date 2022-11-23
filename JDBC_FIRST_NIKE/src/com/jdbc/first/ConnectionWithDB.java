package com.jdbc.first;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class ConnectionWithDB {
	public static void main(String[] args) {
		try {
			Connection con = ConnectionObject.getConnection();
			PreparedStatement statement = con.prepareStatement("select * from employees where officeCode = ? ");
			statement.setInt(1, 6);
			ResultSet result = statement.executeQuery();
			
			while(result.next()) {
				System.out.println(result.getInt(1) + " " + result.getString(2) +" "+ result.getString(3));
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
