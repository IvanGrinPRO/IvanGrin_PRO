package model;

import java.util.ArrayList;



public class Company {

    private ArrayList <Trabajador> trabajadores;


    public Company(){
        trabajadores = new ArrayList<>();
    }

    public void RegistrarTrabajador(String nombre, String apellido, String dni,int sueldo,int numero_de_pagas){
        System.out.println("Nombre,Apelldio,dni,sueldo y numero de pagas");
        Trabajador trabajador = new Trabajador(nombre,apellido,dni,sueldo,numero_de_pagas);
        trabajadores.add(trabajador);

        System.out.println("Trabajador agregado.Nombre :" +nombre +"Apellido" +apellido);

    }

}
