package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Wrapper;

public class DBConnection {

    private static Connection connection;

    private static Connection getConnection(){

        if (connection == null){
            createConnection();
        }
        return connection;
    }

    public static void createConnection(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/examen_ces","root","");

        } catch (SQLException e) {
            System.out.println("error en coneccion");
            System.out.println(e.getMessage());;
        }

    }

    public void closeConnection(){
        try{
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
