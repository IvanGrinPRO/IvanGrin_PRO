import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner lectorTeclado = new Scanner(System.in);

        System.out.println("Introduce su nombre");
        String nombre = lectorTeclado.next();
        System.out.println("Introduce su apellido");
        String apellido = lectorTeclado.next();

        System.out.println("Cuantos dineros tienes");
        int dinero = lectorTeclado.nextInt();

        System.out.println("Cuanto cuesta el ps5(sin iva)");
        double ps5 = lectorTeclado.nextInt();

        System.out.println("Cuanto cuesta el iphone 15(sin iva)");
        double iphone15 = lectorTeclado.nextInt();

        System.out.println("Introduce la IVA");
        double iva = lectorTeclado.nextFloat();

        ps5 = ps5*(iva/100);
        iphone15 = iphone15*(iva/100);

        boolean compra_ps5 = (dinero>ps5);
        boolean compra_iphone15 = (dinero>iphone15);
        boolean compra_los_dos = (dinero>(ps5+iphone15));

        System.out.printf("Te puedes comprar la play: %b\n",compra_ps5);
        System.out.printf("Te puedes comprar el iphone: %b\n",compra_iphone15);
        System.out.printf("Te puedes comprar las dos cosas: %b\n",compra_los_dos);


    }

}