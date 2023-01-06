package three_states_services;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import three_states_dao.MoviesRecordDao;

@Service("movieRecordServices")
public class MoviesRecordServicesImpl implements MovieRecordServices {
	@Autowired
	public MoviesRecordDao moviesRecordDao;
	
	public List<Movie> getMovieDetails() {
		try {
			List<Movie> list = new ArrayList<Movie>();
			ResultSet result = moviesRecordDao.getMovieDetails(); 
			
			
			while(result.next()) {
				Movie m = new Movie(result.getInt(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getString(6), result.getString(7), result.getString(8));
				list.add(m);
			}
				
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
		
	}
	
	
	

}
