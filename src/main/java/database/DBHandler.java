package database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBHandler {
   // public static Connection main(String[] args) {
        String connectionUrl = "jdbc:mysql://localhost:3306/shop";
        String user = "root";
        String pass = "password";

       private static Connection connection;

         public DBHandler() {
            try {
                connection = DriverManager.getConnection(connectionUrl, user, pass);

             //  String query = "CREATE TABLE movies (id int primary key auto_increment," +
              //       "title VARCHAR(255) NOT NULL," +
              //         "genre VARCHAR (255) NOT NULL," +
              //        "yearOfRelease INT NOT NULL)";
              // PreparedStatement statement = connection.prepareStatement(query);
              // statement.execute();

                System.out.println("Connection to database successful");
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Error connection to database");
            }

        }
        public static Connection getConnection () {
            return connection;
        }
    }