import Model.Usuario;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {

//        ArrayList<Usuario>usuarios = new ArrayList<>();
        OperacionFichero operacionFichero = new OperacionFichero();
        for (int i = 0; i < 4; i++) {
            System.out.println(i+1);
            String nombre = "qwe";
            String apellido = "werf";
            String correo = "asd@gmail.com";
            int telefono = 834923475;

            Usuario usuario = new Usuario(nombre,apellido,correo,telefono);
            //usuarios.add(usuario);
            operacionFichero.fichero("/Users/vanyagrin/Documents/GitHub/IvanGrin_PRO/Ejercicioclase3/src/file.txt",
                    new Usuario("qwe","eqw","qwe@gmail.com",42345));
        };
    }
}