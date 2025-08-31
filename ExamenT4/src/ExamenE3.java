import java.util.Scanner;


public class ExamenE3 {

    static public Scanner lectorTeclado = new Scanner(System.in);

    public static void main(String[] args) {


        int[] numeros = new int[20];
        int opcion = 0;
        int opcion2 = 0;
        int listmenos = numeros.length;

        do {
            System.out.println("1.Registrar numeros en lista");
            System.out.println("2.Obtener numero de lista que pone cliente");
            System.out.println("3.Mostrar todo array completo");
            System.out.println("4.Rotar el array en dos lados");
            System.out.println("5.Salir de sistema");

            System.out.println();
            System.out.println("Introduce que opcion quieres eligir");
            opcion = lectorTeclado.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Pide tus numeros:");
                    for (int i = 0; i < numeros.length; i++) {

                        System.out.printf("%d:\n", i);
                        numeros[i] = lectorTeclado.nextInt();
                    }
                    System.out.println("Lista ha registrado");
                    break;

                case 2:
                    System.out.println("Que posicion quieres ver?");
                    opcion2 = lectorTeclado.nextInt();
                    System.out.println(numeros[opcion2]);
                    break;


                case 3:
                    System.out.println("mostrar todo lista");
                    for (int i = 0; i < numeros.length; i++) {

                        System.out.println(numeros[i]);
                    }
                    break;

                case 4:
                    for (int i = 20; i >= numeros.length; i--) {
                        if (i > 0) {
                            numeros[i] = numeros[ listmenos- 1];

                        } else if (i == 0) {
                            numeros[i] = numeros[20];
                        }
                        System.out.println(numeros[i]);
                        }
                        break;


                    }

            }while (opcion != 5);
        }
    }
