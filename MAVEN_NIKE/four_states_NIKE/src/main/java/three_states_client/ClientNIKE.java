package three_states_client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import three_state_services.Movie;
import three_states_controller.MoviesRecordController_NIKE;

public class ClientNIKE {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("NIKE.xml");
		MoviesRecordController_NIKE c = ctx.getBean(MoviesRecordController_NIKE.class);
		List<Movie> movies = c.getMoviesList();
		System.out.println(movies);
	}

}
