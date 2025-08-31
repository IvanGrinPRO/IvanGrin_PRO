import java.util.Scanner;

public class ExamenE4 {

    static public Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Object[][] users = new Object[10][4];
        int opcion = 0;
        int userCount = 0;


        do {

            System.out.println("1.Apregar nueva persona");
            System.out.println("2.Ver la lista de clientes");
            System.out.println("3.Salir de sistema");
            opcion = scanner.nextInt();

            switch (opcion){

                case 1:
                    if (userCount >= users.length) {
                    System.out.println("La lista esta llena!");
                } else {
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Apellio: ");
                    String apellido = scanner.nextLine();

                    System.out.print("Numero telefono: ");
                    int phoneNumber = scanner.nextInt();

                    System.out.print("ID: ");
                    String id = scanner.nextLine();

                    users[userCount][0] = nombre;
                    users[userCount][1] = apellido;
                    users[userCount][2] = String.valueOf(phoneNumber);
                    users[userCount][3] = id;

                    userCount++;
                    System.out.println("¡Usuario agregado exitosamente!");
                    break;
                }

                case 2:
                    System.out.println("\nLista de clientes:");
                    if (userCount == 0) {
                        System.out.println("La lista esta basilla.");
                    } else {
                        for (int i = 0; i < userCount; i++) {
                            System.out.println((i + 1) + ". " +
                                    "Nombre: " + users[i][0] + ", " +
                                    "Apellido: " + users[i][1] + ", " +
                                    "Telefono: " + users[i][2] + ", " +
                                    "ID: " + users[i][3]);
                        }
                    }
                    break;
            }


        }while (opcion != 3);
    }

}
