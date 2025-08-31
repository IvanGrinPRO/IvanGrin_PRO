package model;

public class Jefe extends Trabajador implements Empleador{

    public Jefe() {
    }

    public Jefe(double salario, String nombre, String apellido, int numeroSS) {
        super(salario, nombre, apellido, numeroSS);
    }

    @Override
    public void calcularSalarioMes() {
        System.out.println("El salario mensual es " +getSalario());

    }

    @Override
    public void realizarTrabajo() {

    }
}
