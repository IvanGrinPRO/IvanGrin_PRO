import java.util.Scanner;

public class ejercicio1 {

    public static Scanner lectorTeclado = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Introduce dos numeros");
        int numero1 = lectorTeclado.nextInt();
        double numero2 = lectorTeclado.nextInt();
        double negativo = numero2 * numero1;
        int operacion = 0;
        double resultado;

        do {
            if (negativo > 0) {


                System.out.println("Elige que operacion quieres:\n1.+\n2.-\n3.*\n4./\n5.salir de sistema");
                operacion = lectorTeclado.nextInt();
                switch (operacion) {
                    case 1:
                        resultado = numero1 + numero2;
                        System.out.println(resultado);
                        break;
                    case 2:
                        resultado = numero1 - numero2;
                        System.out.println(resultado);
                        break;
                    case 3:
                        resultado = numero1 * numero2;
                        System.out.println(resultado);
                        break;
                    case 4:
                        resultado = numero1 / numero2;
                        System.out.println(resultado);
                        break;

                }
            }else {
                System.out.println("Atencion! Los numeros son negativos,no se puede hacer calculos");
            }

        }while (operacion != 5);




    }


}