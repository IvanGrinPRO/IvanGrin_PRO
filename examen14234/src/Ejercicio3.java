import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner lectorTeclado = new Scanner(System.in);

        System.out.println("Que tipo de cafe quieres?\nEspresso\nLatte\nCappuchino");
        String tipo_cafe = lectorTeclado.next();

        System.out.println("Cuánta cucharaditas de azúcar quieres? ");
        int azucar = lectorTeclado.nextInt();

        System.out.println("Que tamano de cafe quieres?\nPequeno\nMediano\nGrande");
        String tamano_cafe = lectorTeclado.next();

        System.out.printf("Preparando un %s de tamaño %s con " +
                "%d cucharaditas de azúcar",tipo_cafe,tamano_cafe,azucar);


    }

}
