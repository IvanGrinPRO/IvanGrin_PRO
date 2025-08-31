package databases;

import java.sql.*;
import java.sql.DriverManager;

public class DBConnector {

    private static Connection connection;

    public static Connection getConnection(){

        if (connection == null){
            createConnection();
        }

        return connection;
    }

    public static void createConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
        } catch (SQLException e) {
            System.out.println("Error con la conexion");
            System.out.println(e.getMessage());
        }
    }
}
