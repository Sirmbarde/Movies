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

            Movie movie = new Movie (title, genre, yearOfRelease);
            movies.add(movie);
        } return movies;
    }

    public void update(Movie movie) throws SQLException {
        String query = "UPDATE movies SET title=?, genre=?, yearOfRelease=? WHERE id=?";

        PreparedStatement preparedStatement = dbHandler.getConnection().prepareStatement(query);
        preparedStatement.setString(1, movie.title);
        preparedStatement.setString(2, movie.genre);
        preparedStatement.setInt(3, movie.yearOfRelease);
        preparedStatement.setInt(4, movie.id);

        preparedStatement.execute();
        preparedStatement.close();
    }

    public void delete (int id) throws SQLException {
        String query = "DELETE FROM movies WHERE id=?";

        PreparedStatement preparedStatement = dbHandler.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, id );

        preparedStatement.execute();
        preparedStatement.close();
    }

    public ArrayList<Movie> getMovieByName(String title) throws SQLException {
        String query = "SELECT * FROM movies WHERE title=? ";

        PreparedStatement preparedStatement = dbHandler.getConnection().prepareStatement(query);
        preparedStatement.setString(1, title);
        preparedStatement.execute();

        ResultSet results = preparedStatement.getResultSet();

        ArrayList<Movie> movies = new ArrayList<>();

        while(results.next()) {
            String movie_title = results.getString("title");
            String genre = results.getString("genre");
            int yearOfRelease = results.getInt("yearOfRelease");

            Movie movie = new Movie(movie_title, genre, yearOfRelease);
            movies.add(movie);
        }
        preparedStatement.close();
        return movies;
    }

    public Movie findMovie(int id) throws SQLException {
        String query = "SELECT * FROM movies WHERE id = " + id;
        Statement statement = dbHandler.getConnection().createStatement();
        ResultSet results = statement.executeQuery(query);

        if (results.next()) {
            int movie_id= results.getInt("id");
            String movie_name = results.getString("title");
            String genre = results.getString("genre");
            int yearOfRelease = results.getInt("yearOfRelease");

            Movie movie = new Movie(movie_name, genre, yearOfRelease);
            movie.id = movie_id;
            statement.close();
            return movie;
        } else {
            return null;
        }
    }

}
