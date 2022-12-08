package three_states_utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection_NIKE {
	static public Connection getConnection() {
		try {
			Connection con = DriverManager.getConnection(Constlabels_NIKE.dburl,Constlabels_NIKE.dbUserName,Constlabels_NIKE.dbPwd);
			return con;
		}catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}

}
