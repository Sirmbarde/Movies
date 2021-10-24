package movies;

import java.sql.SQLException;

public class MovieController {

    MovieRepository movieRepository  = new MovieRepository();

    public String createMovie(Movie movie) {
        try {
            movieRepository.create(movie);
            return "Product created successfully";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error creating product!";
        }

    }
}
