package DBConnector;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static Connection connection;

    public static Connection getConnection(){

        try {
            if (connection == null || connection.isClosed()) {
                createConnection();
            }
        } catch (SQLException e) {
            System.out.println("Error in geting connection");
            System.out.println(e.getMessage());
        }

        return connection;
    }

    public static void createConnection(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tests1","root","");
            // jdbc:mysql://localhost:3306/concesionario_ces","root",""
        } catch (SQLException e) {
            System.out.println("Error in connection data base");
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public static void closeConnection(){
        if (connection != null) {
            try {
                connection.close();
                connection = null;
            } catch (SQLException e) {
                System.out.println("Error in closing data base");
                System.out.println(e.getMessage());
            }

        }
    }


}


