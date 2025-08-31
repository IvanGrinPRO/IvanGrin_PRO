import databases.DBConnector;
import model.Usuario;

import java.sql.Connection;

public class Entrada {

    public static void main(String[] args) {
        Connection connection = DBConnector.getConnection();

        Usuario usuario = new Usuario(1,"Ivan","Hrynchuk","vnayagrin@gmail.com","123",32,423);

        System.out.println(usuario.getNombre());
    }
}
