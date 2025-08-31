package model;

public class Jefe extends Human{


    private double acciones;
    private int beneficio;

    public Jefe() {}

    public Jefe(String nombre, String apellido, String dni, double acciones, int beneficio) {
        super(nombre, apellido, dni);
        this.acciones = acciones;
        this.beneficio = beneficio;
    }

    public void mostrarDatos(){

        System.out.println("nombre :" +getNombre());
        System.out.println("apellido :" +getApellido());
        System.out.println("dni :" +getDni());
        System.out.println("acciones :" +acciones);
        System.out.println("beneficio :" +beneficio);
    }

    public double getAcciones() {
        return acciones;
    }

    public void setAcciones(double acciones) {
        this.acciones = acciones;
    }

    public int getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(int beneficio) {
        this.beneficio = beneficio;
    }
}
