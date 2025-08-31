import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner lectorTeclado = new Scanner(System.in);

        System.out.println("Introduce su nombre");
        String nombre = lectorTeclado.next();

        System.out.println("Introduce su apellido");
        String apellido = lectorTeclado.next();

        System.out.println("Que salario quieres tener?");
        int salario = lectorTeclado.nextInt();

        System.out.println("Introduce su edad");
        int edad = lectorTeclado.nextInt();

        System.out.println("Introduce su dia de cumple");
        int cumple = lectorTeclado.nextInt();

        System.out.println("Tienes carnet de conducir (true o false)");
        boolean carnet = lectorTeclado.nextBoolean();


        boolean requisito1 = ((edad<50) && (salario <50000) && carnet);
        boolean requisito2 = ((edad>45) && (salario<20000) && (cumple%2==0));
        boolean resultado = requisito2 || requisito1;

        System.out.printf("Con los datos introducidos, el candidato cuyo nombre es %s " +
                "tiene como resolución: %b",nombre,resultado);


    }

}
