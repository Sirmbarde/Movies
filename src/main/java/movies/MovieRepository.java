package movies;

import database.DBHandler;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MovieRepository {

    DBHandler dbHandler=new DBHandler ();

    public void create (Movie movie) throws SQLException {
        String query = "INSERT INTO movies (title, genre, yearOfRelease) VALUES(?,?,?)";

        PreparedStatement preparedStatement = dbHandler.getConnection().prepareStatement(query);
        preparedStatement.setString(1, movie.title);
        preparedStatement.setString(2,movie.genre);
        preparedStatement.setInt(3, movie.yearOfRelease);

        preparedStatement.execute();
        preparedStatement.close();
    }

    public ArrayList<Movie> getAll() throws SQLException {
        String query = "SELECT * FROM movies";

        Statement statement = dbHandler.getConnection().createStatement();
        ResultSet results = statement.executeQuery(query);

        ArrayList<Movie> movies= new ArrayList<>();

        while (results.next()) {
            int id = results.getInt("id");
            String title = results.getString("title");
            String genre = results.getString("genre");
            int yearOfRelease = results.getInt("yearOfRelease");

            Movie movie = new Movie(title, genre, yearOfRelease);
            movies.add(movie);
        }

        return movies;
    }
}
