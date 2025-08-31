package dto;

import databases.DBConnector;
import model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuarioDTO {
    private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;

    public UsuarioDTO(){

        connection = DBConnector.getConnection();
    }

    // comun: db_name, col_name

    //Create -> INSERT INTO usuarios(id,nombre,apellido,correo,pass,perfil,pass)
    // VALUES()

    public void insertarUsuarios(Usuario usuario){
        try {
            statement = connection.createStatement();
            String query = "INSERT INTO"+(SchemaDB.COL_NAME) "VALUES('Borja','Martin','correo','pass','5')";
        } catch (SQLException e) {
            System.out.println("Error en la query");
        }

    }

}
