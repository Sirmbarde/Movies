package database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBHandler {
   // public static Connection main(String[] args) {
        String connectionUrl = "jdbc:mysql://localhost:3306/shop";
        String user = "root";
        String pass = "root";

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

  //  public class DBHandler {
      //  String connectionUrl = "jdbc:mysql://localhost:3306/shop";
      //  String user = "root";
      //  String pass = "root";

       // private static Connection connection;

        //public DBHandler() {
        //    try {
        //        Connection connection = DriverManager.getConnection(connectionUrl, user, pass);

        //        System.out.println("Connection to database successful");
       //     } catch (SQLException e) {
       //         e.printStackTrace();
       //         System.out.println("Error connection to database");
       //     }
    //    }

     //   public Connection getConnection() {
      //      return connection;
        //}

  //      String query="CREATE TABLE products (id int primary key auto_increment,"+
  //         "name VARCHAR(30) NOT NULL,"+
//                    "PRICE FLOAT NOT NULL,"+
//                    "quantity INT NOT NULL,"+
//                    "description VARCHAR(50))";
//            PreparedStatement statement=connection.prepareStatement(query);
//            statement.execute();

   // }
