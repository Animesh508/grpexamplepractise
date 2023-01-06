package three_state_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import three_states_services.Movie;
import three_states_services.MovieRecordServices;

@Controller
public class MovieRecordController {
	@Autowired
	public MovieRecordServices moviesRecordService;

    public List<Movie> getMoviesList(){
    	return moviesRecordService.getMovieDetails();
    }

}
