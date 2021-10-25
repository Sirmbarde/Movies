package movies;

import java.sql.SQLException;
import java.util.ArrayList;

public class MovieController {

    MovieRepository movieRepository  = new MovieRepository();

    public String createMovie(Movie movie) {
        try {
            movieRepository.create(movie);
            return "Movie created successfully!";
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

    public ArrayList<Movie> findMovie (String title) {
        try {
            return movieRepository.getMovieByName(title);
        } catch (SQLException e) {
            System.out.println("Cannot retrieve movie from database!");
            e.printStackTrace();
            return null;
        }
    }

    public Movie findMovie (int id) {
        try {
            return movieRepository.findMovie(id);
        } catch (SQLException e) {
            System.out.println("Cannot retrieve movie from database!");
            e.printStackTrace();
            return null;
        }
    }

    public void updateMovie (Movie movie) {
        try {
            movieRepository.update(movie);
            System.out.println("Movie updated successfully!");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void deleteMovie (int id) {
        try {
            movieRepository.delete(id);
            System.out.println("Movie deleted successfully!");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
