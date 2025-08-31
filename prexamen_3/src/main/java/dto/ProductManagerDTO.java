package dto;

import DBConnect.DBConnection;
import DBConnect.Schema_DB;
import Model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ProductManagerDTO {


    private Connection connection = DBConnection.realizarConecion();

    public ProductManagerDTO() {
    }


    public void insertarDatos(Product product) {


        String query = "INSER INTO products (" + Schema_DB.COL_ID + "," + Schema_DB.COL_NAME + "," + Schema_DB.COL_PRICE
                + "," + Schema_DB.COL_QUANTITY + ") VALUES (?, '?', ?, ?);";


        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, String.valueOf(product.getId()));
            preparedStatement.setString(2, product.getNombre());
            preparedStatement.setString(3, String.valueOf(product.getPrecio()));
            preparedStatement.setString(4, String.valueOf(product.getCantidad()));


        } catch (SQLException e) {
            System.out.println("Error en incertacion datos" + e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Error en cerrando coneccion" + e.getMessage());
            } finally {
                System.out.println("Insertacion sale con exito");
            }
        }
    }

    public void mostrarDatosId(int id) {

        String query = "SELECT * FROM products WHERE" + Schema_DB.COL_ID + " = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, String.valueOf(id));

        } catch (Exception e) {
            System.out.println("Error en mostracion datos" + e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Error en cerrando coneccion" + e.getMessage());
            }
        }
    }


    public void actualizarDatos(Product product) {

        String query = "UPDATE products SET " + Schema_DB.COL_NAME + " = '?', SET " +
                Schema_DB.COL_PRICE + " = ?, SET " + Schema_DB.COL_QUANTITY + " = ? WHERE " + Schema_DB.COL_ID + " = ?;";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)){
            preparedStatement.setString(1, product.getNombre());
            preparedStatement.setString(2, String.valueOf(product.getPrecio()));
            preparedStatement.setString(3, String.valueOf(product.getCantidad()));
            preparedStatement.setString(4, String.valueOf(product.getId()));
        } catch (SQLException e) {
            System.out.println("Error en actualizando datos" + e.getMessage());
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Error en cerrando coneccion" + e.getMessage());
            }finally {
                System.out.println("Actualizando datos sale con exito");
            }
        }
    }

    public void borarDatos(int id){

        String query = "DELETE FROM " + Schema_DB.TAB_NAME + "WHERE id = ?;";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)){

            preparedStatement.setString(1, String.valueOf(id));

        } catch (SQLException e) {
            System.out.println("Error en borrando datos");
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Error en cerrando coneccion" + e.getMessage());
            }finally {
                System.out.println("Borrando datos sale con exito");
            }
        }

    }
}
