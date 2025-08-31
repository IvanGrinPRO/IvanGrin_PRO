import java.util.Random;
import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner lectorTeclado = new Scanner(System.in);

        int numero_random = (int)(Math.random() * 9000)+1000;
        System.out.println(numero_random);

        System.out.println("Introduce un numero");
        int numero = lectorTeclado.nextInt();

        boolean unidades = (numero_random - numero < 1);
        boolean decenas = (numero_random - numero < 10);
        boolean centenas = (numero_random - numero < 100);
        boolean millares = (numero_random - numero < 1000);
        boolean todo = (unidades && decenas && centenas && millares);


        System.out.println("Numero de la loteria: "+numero_random);
        System.out.printf("Has acertado las unidades: %b\n",unidades);
        System.out.printf("Has acertado las decenas: %b\n",decenas);
        System.out.printf("Has acertado las centenas: %b\n",centenas);
        System.out.printf("Has acertado las millares: %b\n",millares);
        System.out.printf("Todo numero esta igual: %b\n",todo);

    }


}
