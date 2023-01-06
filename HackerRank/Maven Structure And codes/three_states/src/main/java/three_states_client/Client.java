package three_states_client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import three_state_controller.MovieRecordController;
import three_states_services.Movie;

public class Client {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("NewFile.xml");
		MovieRecordController c = ctx.getBean(MovieRecordController.class);
		List<Movie> movie= c.getMoviesList();
		System.out.println(movie);
	}

}
