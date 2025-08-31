package Model;

import java.util.ArrayList;
import java.util.List;

public class Inventario<T> {
    private List<T> elementos;




    public Inventario() {
        this.elementos = new ArrayList<>();
    }

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public void mostrarInventario() {
        System.out.println("Inventario");
        for (T elemento : elementos) {
            System.out.println(elemento.toString());
        }

    }

    public static class Producto {
        private String nombre;
        private double precio;
        private int stock;

        public Producto(String nombre, double precio, int stock) {
            this.nombre = nombre;
            this.precio = precio;
            this.stock = stock;
        }

        @Override
        public String toString() {
            return String.format("Producto: %15s \n Precio: %8.2f \n Stock: %3d",
                    nombre, precio, stock);
        }
    }
}