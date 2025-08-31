import java.io.File;
import java.io.IOException;

public class Operaciones {

    public void  divisionEntre0(int numero) throws ArithmeticException{

        System.out.println("Procedemos a dividir un numero entre 0");
        System.out.println("La division del numero es" +numero/0);
    }

    public void crearfichero(String path) throws IOException {

        File file = new File(path);
        file.createNewFile();

    }
}
