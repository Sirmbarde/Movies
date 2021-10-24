import database.DBHandler;
import movies.Movie;
import movies.MovieController;

public class Main {
    public static void main(String[] args) {
        DBHandler dbHandler=new DBHandler();

        MovieController movieController=new MovieController();
        System.out.println(movieController.createMovie(new Movie("Lake", "fantasy", 2012)));
        System.out.println(movieController.createMovie(new Movie("House", "thriller", 2000)));


      //  DBHandler dbHandler = new DBHandler ();

    }
}
