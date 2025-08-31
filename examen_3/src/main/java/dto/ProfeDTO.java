package dto;

import DBConnection.DBConnection;
import DBConnection.SchemaDB;
import Model.ProfesorExterno;
import Model.ProfesorInterno;

import java.sql.*;

public class ProfeDTO {

    private static Connection connection;
    private static Statement statement;
    private static PreparedStatement preparedStatement;
    private static ProfesorInterno profesorInterno;


    public static void mostarDatosDB(){

        try {
            String query = "SELECT * FROM " + SchemaDB.USER_DB + ";";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(String.format(query));
        } catch (SQLException e) {
            System.out.println("Se ha producido error en mostrar datos:");
            System.out.println(e.getMessage());
        }
    }

    public static void realizarInsercion(ProfesorExterno profesorExterno){

        try {

            if (!connection.isClosed()){

                String query = "INSERT INTO" + SchemaDB.USER_DB + "(" + SchemaDB.COL_NOM + "," + SchemaDB.COL_ID + ","
                        + SchemaDB.COL_SAL + ")" +
                        "VALUES (?, ?, ?);";

                PreparedStatement preparedStatement1 = connection.prepareStatement(query);
                preparedStatement1.setString(1, profesorInterno.getNombre());
                preparedStatement1.setString(2, profesorInterno.getId());
                preparedStatement1.setString(3, String.valueOf(profesorInterno.getSalario()));
            }

        } catch (SQLException e) {
            System.out.println("pasa algo en insertacion datos en base de datos:");
            System.out.println(e.getMessage());;
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Base de datos no esta cerrada! He producido error:");
                System.out.println(e.getMessage());
            }
        }
    }

}
