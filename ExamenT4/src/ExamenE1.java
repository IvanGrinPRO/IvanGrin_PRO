public class ExamenE1 {

    public static void main(String[] args) {

        int[] numeros = new int[15];
        
        int random = 0;

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = (int) (Math.random() * 17)

        }

        System.out.println("Lista sin orden");
        for (int i = 0; i < numeros.length ; i++) {

            random = (int) (Math.random() * 15);
            System.out.printf("%d,", numeros[random]);
            
        }

        System.out.println();
        System.out.println("Lista con orden");
        for (int i = 0; i < numeros.length; i++) {

            System.out.printf("%d,",numeros[i]);
        }

        System.out.println();
        System.out.println("Numeros que estan en pocisiones pares");

        for (int i = 0; i < numeros.length; i++) {

            if (i%2 == 0){

                System.out.printf("%d,", numeros[i]);

            }
        }

        System.out.println();
        System.out.println("Solo numeros pares dentro de lista");

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 == 0){

                System.out.printf("%d,",numeros[i]);
            }

        }
}

    

}
