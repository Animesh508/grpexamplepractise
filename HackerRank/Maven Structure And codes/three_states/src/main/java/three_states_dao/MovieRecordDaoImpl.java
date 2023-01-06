package three_states_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

import three_states_utlity.Constlabels;
import three_states_utlity.DbConnection;


@Repository("moviesRecordDao")
public class MovieRecordDaoImpl implements MoviesRecordDao {
	
	public Connection con;
	
	
	public void MoviesRecordDaoImpl() {
		try {
			this.con = DbConnection.getConnection();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public ResultSet getMovieDetails() {
		try {
			PreparedStatement stm = con.prepareStatement(Constlabels.getMoviesQuery);
			ResultSet result = stm.executeQuery();
			return result;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

}
