package tree_states_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;


import three_states_utility.Constlabels_NIKE;
import three_states_utility.DbConnection_NIKE;
@Repository("moviesRecordDao")
public class MoviesRecordDaoImpl implements MoviesRecordDao{
	public Connection con;
	
	public MoviesRecordDaoImpl() {
		try {
			this.con = DbConnection_NIKE.getConnection();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public ResultSet getMoviesDetails() {
		try {
			PreparedStatement stm = con.prepareStatement(Constlabels_NIKE.getMovieQuery);
			ResultSet result = stm.executeQuery();
			return result;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

}
