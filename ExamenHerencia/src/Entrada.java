import modelo.Bebida;
import modelo.Cliente;
import modelo.Comida;
import modelo.Racion;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {
        int opcion = 0;
        int opcion2 = 0;
        int caja_precio = 0;
        ArrayList<Cliente> clientes = new ArrayList<>();

        do {

            System.out.println("1.Admitir clientes");
            System.out.println("2.Agregar consumiciones a clientes");
            System.out.println("3.Muestra la lista de consumiciones de un cliente");
            System.out.println("4.Imprimir el total a pagar");
            System.out.println("5.Ver caja total");

            switch (opcion) {
                case 1:
                    System.out.println("Nombre de cliente");
                    String nombre = "Alex";
                    int precio_total = 0;
                    Cliente cliente = new Cliente(nombre, precio_total);
                    clientes.add(cliente);
                    break;
                case 2:

                    System.out.println("1.Bebida");
                    System.out.println("2.Comida");
                    System.out.println("3.Racion");
                    switch (opcion2) {
                        case 1:
                            if (!clientes.isEmpty()) {
                                for (Cliente i : clientes) {
                                    Bebida bebida = new Bebida();
                                    i.Sum(bebida.getPrecio());


                                }
                            } else {
                                System.out.println("no hay clientes");
                            }
                        case 2:
                            if (!clientes.isEmpty()) {
                                for (Cliente i : clientes) {
                                    Comida comida = new Comida();
                                    i.Sum(comida.getPrecio());
                                }
                            } else {
                                System.out.println("no hay clientes");
                            }
                            break;
                        case 3:
                            if (!clientes.isEmpty()) {
                                for (Cliente i : clientes) {
                                    Racion racion = new Racion();
                                    i.Sum(racion.getPrecio());
                                }
                            } else {
                                System.out.println("no hay clientes");
                            }
                            break;

                    }

                case 4:



                    break;
                case 5:
                    System.out.println("Precio total: ");
                    for (Cliente item : clientes){
                        System.out.println("precio");
                        item.getPrecio_total();
                    }
                    break;
            }
        }while (opcion != 6) ;
    }

}