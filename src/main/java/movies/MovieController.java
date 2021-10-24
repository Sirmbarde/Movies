package movies;

import java.sql.SQLException;
import java.util.ArrayList;

public class MovieController {

    MovieRepository movieRepository  = new MovieRepository();

    public String createMovie(Movie movie) {
        try {
            movieRepository.create(movie);
            return "Movie created successfully";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error creating movie!";
        }

    }

    public ArrayList<Movie> getAllMovies() {

        try {
            return movieRepository.getAll();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
