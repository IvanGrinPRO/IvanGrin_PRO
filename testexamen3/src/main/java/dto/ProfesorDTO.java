package dto;

import DBConnector.DBConnection;
import DBConnector.Schema_DB;
import Model.ProfesorExterno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProfesorDTO {

    private Connection connection = DBConnection.getConnection();

    public void InsertarDatos(ProfesorExterno profesorExterno){

        String query = "INSERT INTO profesor(" + Schema_DB.COL_NAME + "," + Schema_DB.COL_ID + "," + Schema_DB.COL_SAL
                + ") VALUES (?,?,?";

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1,profesorExterno.getId());
            preparedStatement.setString(2,profesorExterno.getNombre());
            preparedStatement.setString(3, String.valueOf(profesorExterno.getSalario()));

        } catch (SQLException e) {
            System.out.println("Error en insertacion" + e.getMessage());
        }finally {
            System.out.println("Insertacion salio con exito");


        }

    }

}