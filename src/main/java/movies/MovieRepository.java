package movies;

import database.DBHandler;

import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
