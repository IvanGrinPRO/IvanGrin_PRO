package org.example;
import Model.Product;
import dto.ProductManagerDTO;

import java.util.Scanner;

public class Entrada {

    public static Scanner lectorTeclado = new  Scanner(System.in);

    public static void main(String[] args) {

        int opcion = 0;
        ProductManagerDTO productManagerDTO = new ProductManagerDTO();


        do {

            System.out.println("1.Crear nuevo producto y anadir en base de datos");
            System.out.println("2.Informacion sobre producto dado de su id");
            System.out.println("3.Actualizar un producto dado su id");
            System.out.println("4.Eliminar un producto dado su ID");
            switch (opcion){
                case 1:
                    System.out.println("ID: ");
                    int id = lectorTeclado.nextInt();

                    System.out.println("Nombre: ");
                    String nombre = lectorTeclado.next();

                    System.out.println("Precio: ");
                    double precio = lectorTeclado.nextInt();

                    System.out.println("Cantidad: ");
                    int cantidad = lectorTeclado.nextInt();

                    Product product = new Product(nombre,id,cantidad,precio);

                    productManagerDTO.insertarDatos(product);
                    break;

                case 2:

                    System.out.println("ID: ");
                    int id_md = lectorTeclado.nextInt();

                    productManagerDTO.mostrarDatosId(id_md);
                    break;

                case 3:

                    System.out.println("ID: ");
                    int id_acda = lectorTeclado.nextInt();

                    System.out.println("Nombre: ");
                    String nombre_acda = lectorTeclado.next();

                    System.out.println("Precio: ");
                    double precio_acda = lectorTeclado.nextInt();

                    System.out.println("Cantidad: ");
                    int cantidad_acda = lectorTeclado.nextInt();

                    Product product1 = new Product(nombre_acda,id_acda,cantidad_acda,precio_acda);
                    productManagerDTO.actualizarDatos(product1);
                    break;

                case 4:

                    System.out.println("ID: ");

            }



        }while (opcion != 6);

    }


}