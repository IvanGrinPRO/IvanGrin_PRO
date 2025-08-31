package model;

abstract public class Trabajador {

    private double salario;
    private String nombre,apellido;
    private int numeroSS;

    public Trabajador() {
    }

    public Trabajador(double salario, String nombre, String apellido, int numeroSS) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroSS = numeroSS;
        this.salario = salario;
    }

    public void mostarDatos(){

        System.out.println("nombre =" + nombre);
        System.out.println("apellido =" + apellido);
        System.out.println("numeroSS =" + numeroSS);
        System.out.println("salario =" + salario);
    }

    public abstract void calcularSalarioMes();

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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

    public int getNumeroSS() {
        return numeroSS;
    }

    public void setNumeroSS(int numeroSS) {
        this.numeroSS = numeroSS;
    }
}
