import java.util.Scanner;

public class EntradaEjercicioSwitch1 {

    public static void main(String[] args) {

        Scanner lectorTeclado = new Scanner(System.in);

        System.out.println("Introduce cualquer numero");
        int numero = lectorTeclado.nextInt();
        int resto = numero%2;

        switch (resto){

            case 0:
                System.out.println("numero es par");
                break;
            default:
                System.out.println("numero es impar");


        }


    }

}