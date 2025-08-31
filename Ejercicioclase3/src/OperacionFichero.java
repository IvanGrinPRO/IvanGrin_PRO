import Model.Usuario;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class OperacionFichero {


    public void fichero(String path,Usuario usuario){

        File file = new File(path);
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(file,true);


                fileWriter.write(usuario.toString());



        } catch (IOException e) {
            System.out.println("Error en la entrada/salida");
        }finally {
            try {
                fileWriter.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerrado");
            }
        }

    }

    public void leerAgenda(String path){

    }
}
