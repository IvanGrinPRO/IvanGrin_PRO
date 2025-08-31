import java.util.Random;

public class Main {

    public static void main(String[] args) {

        /* String[] palabras = {"Hola","Que","tal","Estas"};
        for (int i = 0; i <= palabras.length; i++){
            System.out.println("La palabra es " +palabras[i]);
        }*/


        int[] numeros = new int[100];
        int[] numeros2 = {4,8,9};

        for (int i = 0; i < numeros.length ; i++) {
            numeros[i] = (int) (Math.random() * 101);
        }

        for (int i = 0; i < numeros.length; i++) {
            /*if (i % 2 == 0){
                System.out.println(numeros[i]);
            }*/
           if (numeros[i] % 2 == 0){
               System.out.println(numeros[i]);
           }

        }



    }
}