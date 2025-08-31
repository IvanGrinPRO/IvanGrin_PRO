package DBConnector;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String url = "jdbc:mysql://localhost/examen_ces";
    private static final String user = "root";
    private static final String password = "";

    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                System.out.println("Error en conecion" + e.getMessage());

            } catch (ClassNotFoundException e) {
                System.out.println("No hay driver DBConnection" + e.getMessage());
            }
            finally {
                System.out.println("Base de datos esta conectado con exito");
            }
        }
        return connection;
    }

    public void closeConnection(){
        try{
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error en ciere conecion" + e.getMessage());
        }finally {
            System.out.println("Conecion esta cerado con exito");
        }


    }

}