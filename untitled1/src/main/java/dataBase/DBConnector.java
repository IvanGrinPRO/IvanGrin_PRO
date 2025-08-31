package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

    private static Connection connection;


    public  Connection getConnection() {

        if (connection == null) {
            createConnection();
        }
        return connection;
    }

    private void createConnection(){
            try {
                connection = DriverManager.getConnection("jdbc::mysql://localhost:3306/pasajeros_ces","root","");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

}
