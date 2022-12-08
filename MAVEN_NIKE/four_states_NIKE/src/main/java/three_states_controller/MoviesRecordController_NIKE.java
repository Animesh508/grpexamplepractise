package three_states_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import three_state_services.Movie;
import three_state_services.MoviesRecordService_NIKE;

@Controller
public class MoviesRecordController_NIKE {
	
	@Autowired
	public MoviesRecordService_NIKE moviesRecordService;
	
	public List<Movie> getMoviesList() {
		return moviesRecordService.getMoviesDetails();
	}
	

}
