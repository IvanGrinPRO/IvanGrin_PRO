package model;

public class Asalario extends Trabajador{

    private double retencion;
    private int numeroPagas;


    public Asalario(double retencion, int numeroPagas) {
        this.retencion = retencion;
        this.numeroPagas = numeroPagas;
    }

    public Asalario(double salario, String nombre, String apellido, int numeroSS, double retencion, int numeroPagas) {
        super(salario, nombre, apellido, numeroSS);
        this.retencion = retencion;
        this.numeroPagas = numeroPagas;
    }

    @Override
    public void calcularSalarioMes() {
        double salario = (getSalario()-(getSalario()*retencion))/numeroPagas;
        System.out.println("El salario mensual es");


    }
}
