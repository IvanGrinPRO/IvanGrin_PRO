import java.sql.Array;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Entrada {

    public static Scanner lectorTeclado = new Scanner(System.in);
    public static void main(String[] args) {

        ejercicio1();

    }

    public static void ejercicio1(){

        Hashtable <String , Integer> productos = new Hashtable<String, Integer>();

        int opcion = 0;
        String producto;
        do {

            System.out.println("1.Anadir producto con precio");
            System.out.println("2.Mostrar productos con su precio");
            System.out.println("3.Mostrar toda la lista de productos con precios.De menor a mayor");
            opcion = lectorTeclado.nextInt();

            switch (opcion){

                case 1:
                    producto = lectorTeclado.next();
                    int precio = lectorTeclado.nextInt();
                    productos.put(producto,precio);
                    break;

                case 2:
                    for (int i = 0; i < productos.size(); i++) {
                        System.out.println(productos.get("producto"));

                    }
            }



        }while (opcion != 6);

    }

    public static void ejercicio2(){

        System.out.println("Cuantos alumnos son?");
        int numero_de_alumnos = lectorTeclado.nextInt();
        ArrayList<> alumnos = new ArrayList<Integer>(numero_de_alumnos);
        System.out.println("Confirma antes que iniciar el proceso");
        String opcion = lectorTeclado.next();

        if (opcion.equals("N")){

            for (int i = 0; i < alumnos.size(); i++) {

            }
        }
    }

}