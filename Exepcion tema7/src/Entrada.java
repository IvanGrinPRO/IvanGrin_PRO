import java.io.IOException;
import java.util.Scanner;

public class Entrada {

    public static Scanner lectroTeclado = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       /* String cosas[] = new String[]{"Dato1","Dato2","Dato3"};

        int numero1 =2;
        int numero2 = 0;
        String nombre;
        System.out.println("A que posicion quieres acceder");
        int posicion = lectroTeclado.nextInt();


//        System.out.println("El numero de letras de tu nombre es" +nombre.length());
        try {
            System.out.println(cosas[posicion]);
            int resultado = numero1/numero2;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("El size es mas pequeno que la posicion indicaada ");
        } catch (ArithmeticException e){
            System.out.println("Error en la division entre 0");
        } finally {
            System.out.println("Terminando proceso");
        }

        System.out.println("Terminando el programa");*/
        Operaciones operaciones = new Operaciones();
//        operaciones.divisionEntre0(8);
        operaciones.crearfichero("/cosa/raiz/dato/ejemplo.txt");
    }

}
