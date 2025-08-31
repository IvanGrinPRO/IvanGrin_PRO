package org.example;


import Model.ProfesorExterno;
import dto.ProfeDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {

    public static Scanner lectorTeclado = new Scanner(System.in);

    public static void main(String[] args) {

    int number = 0;
        ArrayList<ProfesorExterno> profesoresExternos = new ArrayList<>();

    do {
        System.out.println("Menu:");
        System.out.println("1.Mostrar Profesores Internor(Base Datos)");
        System.out.println("2.Anadir Profesor Externo (Local)");
        System.out.println("3.Dar profesor a baja (Profesor Externo)");
        System.out.println("4.Anadir Profesores desde local a la base de datos");
        System.out.println("5.Exportar en fichero tipo CSV");
        System.out.println("6.Exportar en fichero tipo OBJ");
        number = lectorTeclado.nextInt();



        switch (number){

            case 1:
                ProfeDTO.mostarDatosDB();
                break;
            case 2:
                System.out.println("Nombre de profesor");
                String nombre = lectorTeclado.next();
                System.out.println("Id de profesor");
                String id = lectorTeclado.next();
                System.out.println("Salario de profesor");
                double salario = lectorTeclado.nextInt();
                ProfesorExterno profesorExterno = new ProfesorExterno(nombre,id,salario);
                profesoresExternos.add(profesorExterno);
        }

    }while (number != 7);

    }

}