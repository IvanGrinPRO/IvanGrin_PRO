import java.util.Scanner;

public class ExamenE2 {

    static public Scanner lectorTeclado = new Scanner(System.in);

    public static void main(String[] args) {

        int numerogrande = 0;
        int pares = 0;
        int impares = 0;
        int repeticiones = 0;


        System.out.println("Introduce la cantidad que quieres usar");
        int cantidad = lectorTeclado.nextInt();

        int[] listas = new int[cantidad];

        for (int i = 0; i < listas.length; i++) {

            listas[i] = (int) (Math.random()* 20);
        }

        int numeropequeno = listas[0];

        for ( int item : listas){

            if ( item > numerogrande){
                numerogrande = item;

            }

            if (numeropequeno > item){

                numeropequeno = item;
                
            }
        }

        for (int i = 0; i < listas.length; i++) {

            if (listas[i] % 2 == 0){

                pares++;
            } else {
                impares++;
            }

            
        }

        System.out.printf("numero mas grande %d\nnumero mas pequeno %d\n",numerogrande,numeropequeno);
        System.out.printf("Numeros pares: %d\nNumeros impares: %d\n",pares,impares);


        System.out.println("Mostrar repeticion de numero:");
        int numeropedido = lectorTeclado.nextInt();

        for (int i = 0; i < listas.length; i++) {

            if (listas[i] == numeropedido){

                repeticiones++;
            }
        }
        System.out.println(repeticiones);

    }

}
