import database.DBHandler;
import movies.Movie;
import movies.MovieController;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //DBHandler dbHandler = new DBHandler();
        MovieController movieController = new MovieController();

//        System.out.println(movieController.createMovie(new Movie("Lake", "fantasy", 2012)));
//        System.out.println(movieController.createMovie(new Movie("House", "thriller", 2000)));
//        System.out.println(movieController.createMovie(new Movie("Fire", "detective", 2005)));
//
//        System.out.println(movieController.getAllMovies());

        //update  movie

//        System.out.println("Enter ID of the movie you would like to update!");
//        Scanner scanner = new Scanner(System.in);
//        int id = scanner.nextInt();

//        Movie movie =  movieController.findMovie(id);
//
//        movie.title = "Extinguished";
//        movieController.updateMovie(movie);

        //delete movie

//        System.out.println("Enter ID of the movie you would like to delete!");
//        Scanner scanner = new Scanner(System.in);
//        int id = scanner.nextInt();
//        movieController.deleteMovie(id);

        //display all movies in DB

        System.out.println(movieController.getAllMovies());

        //HOW TO RESET MOVIE IDs TO START FROM 1 AGAIN?

    }
}
