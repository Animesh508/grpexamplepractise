package com.sales.in_jai;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DisplayMovieDetails_jai {
	@Autowired
	@Qualifier("con")
	Connection con;
	
	public void showDetails() {
		try {
			PreparedStatement stm = con.prepareStatement("select * from movies");
			ResultSet result = stm.executeQuery();
			while(result.next()) {
				System.out.println(result.getString());
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	

}
