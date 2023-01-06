package three_states_utlity;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	static public Connection getConnection() {
		try {
			Connection con = DriverManager.getConnection(Constlabels.dburl,Constlabels.dbUserName,Constlabels.dbPwd);
			return con;
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return null;
	}

}
