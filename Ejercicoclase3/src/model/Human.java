package model;

public class Human {

    private String nombre,apellido,dni;


    public Human() {}

    public Human(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public void mostrarDatod(){
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
        System.out.println("dni = " + dni);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
