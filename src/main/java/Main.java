import database.DBHandler;
import movies.Movie;
import movies.MovieController;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DBHandler dbHandler=new DBHandler();

        MovieController movieController=new MovieController();
       // System.out.println(movieController.createMovie(new Movie("Lake", "fantasy", 2012)));
       // System.out.println(movieController.createMovie(new Movie("House", "thriller", 2000)));

      // Scanner scanner= new Scanner(next);

      //  Movie movie = movieController.updateMovie();
       // movie.title="New order";
     //   movieController.updateMovie(movie);


        System.out.println(movieController.getAllProducts());

    }
}
