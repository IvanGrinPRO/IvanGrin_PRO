package modelo;

import java.util.ArrayList;

public class Cliente {

    private String nombre;
    private int precio_total;

    public Cliente() {
    }


    public Cliente(String nombre, int precio_total) {
        this.nombre = nombre;
//        this.precio_total += comida.getPrecio();
//        this.precio_total += bebida.getPrecio();
//        this.precio_total += racion.getPrecio();
        this.precio_total = precio_total;
    }

    public int Sum(int precio) {
        return precio_total += precio;
    }


    public void mostrarDatos(){
        System.out.println("nombre = " + nombre);
        System.out.println("precio_total = " + precio_total);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(int precio_total) {
        this.precio_total = precio_total;
    }
}
