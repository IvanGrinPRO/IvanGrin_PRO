package DBConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String url = "jdbc:mysql://localhost/prexamen_3/products";
    private static final String user = "root";
    private static final String password = "";


    private static Connection connection;

    public DBConnection() {
    }

    public static Connection realizarConecion(){
        if (connection == null){
            try {
//                Class.forName("")
                connection = DriverManager.getConnection(url,user,password);
            } catch (SQLException e) {
                System.out.println("Error en conecion");
            }finally {
                System.out.println("Conecion esta creado");
            }
        }
        return connection;
    }

    public void closeConnecion(){

        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error en ciere coneccion");
        }finally {
            System.out.println("Coneccion esta cerada");
        }
    }
}
