import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class ejercicios_arraylist {

    public static Scanner lectorTeclado = new Scanner(System.in);

    public static void main(String[] args) {
//        ejercicio1();
//        ejercicio2();
//          ejercicio3();
//        ejercicio4();
//        ejercicio5();
        ejercicio6();
    }

    public static void ejercicio1(){

        ArrayList <Integer> listString = new ArrayList();

        int counter = 1;

        for (int i = 0; i < 10; i++) {

            int numbers = lectorTeclado.nextInt();
            listString.add(numbers);

        }
        for ( int i : listString){

            System.out.printf("%d:%d\n", counter, i);
            counter++;

        }
    }


    public static void ejercicio2(){

//        (int) (Math.random() * 101)
        ArrayList <Integer> listInt = new ArrayList<>();
        float media = 0;

        for (int i = 0; i < 30; i++) {

            int random = (int) (Math.random() * 11);
            listInt.add(random);
            media += random;

        }
        for (int i : listInt){
            System.out.printf("%d, ", i);
        }

        System.out.printf("media nota: %.2f" ,media / 30);

    }

    public static void ejercicio3(){

        ArrayList <Integer> listInt = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            int numeros = lectorTeclado.nextInt();
            listInt.add(numeros);

        }
        System.out.println("La lista inversa: ");
        for (int i = listInt.size() - 1; i >= 0; i--) {
            System.out.printf("%d,",listInt.get(i));
        }
        System.out.println();
        System.out.println("La lista normal");
        for (int item : listInt){
            System.out.printf("%d,",item);
        }

    }

    public static void ejercicio4(){

        ArrayList <Integer> listNumbers = new ArrayList<>(20);
        ArrayList <Integer> listNumbersCuadrado = new ArrayList<>(20);
        ArrayList <Integer> listNumbersCubo = new ArrayList<>(20);

        for (int i = 0; i < 21; i++) {
            int random_number = (int) (Math.random()* 101);
            listNumbers.add(random_number);
            listNumbersCuadrado.add(random_number * random_number);
            listNumbersCubo.add(random_number * random_number * random_number);
        }

        for (int i = 0; i < listNumbers.size(); i++) {
            System.out.printf("%d: %d,%d,%d,\n",i,listNumbers.get(i),listNumbersCuadrado.get(i),listNumbersCubo.get(i));

        }
    }

    public static void ejercicio5(){

        ArrayList <Integer> listNumber = new ArrayList<>();

        for (int i = 0; i < 8; i++) {

            listNumber.add(lectorTeclado.nextInt());

        }

        for (int i : listNumber){
            if (i % 2 == 0){
                System.out.printf("el numero %d es par\n", i);
            } else {
                System.out.printf("el numero %d es impar\n", i);

            }
        }

    }

    public static void ejercicio6(){

        ArrayList <Integer> listNumber = new ArrayList<>();

        int counter = 0;

        for (int i = 0; i < 20; i++) {

            listNumber.add((int) (Math.random() * 30));

        }

        for (int i : listNumber){
            if (i == 6){
                listNumber.set(i, 8);
                counter++;

            }
            if (i == 7){
                listNumber.set(i, 15);
                counter++;
            }
            if (i == 20){
                listNumber.set(i, 10);
                counter++;
            }
            System.out.println(i);

        }
        System.out.println("changed: " + counter);

    }

    public static void ejercicio6_1(){


        int maxrandom_number = 0;
        int random_numbers = 0;
        boolean executioon = true;
        ArrayList <Integer> listNumber = new ArrayList<>(lectorTeclado.nextInt());
        do {

            maxrandom_number = lectorTeclado.nextInt();
        if (listNumber.size() >= maxrandom_number){

            for (int i = 0; i < listNumber.size(); i++) {
                int random_number = (int) (Math.random()) * maxrandom_number;
                for (i : listNumber){

                }

            }
        }
        }while (executioon == true);


    }

}
