package modelo;

public class Alimento {

    private String nombre;
    private int precio;

    public Alimento() {
    }

    public Alimento(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }


    public void mostrarDatos(){

        System.out.println("nombre = " + nombre);
        System.out.println("precio = " + precio);

    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
