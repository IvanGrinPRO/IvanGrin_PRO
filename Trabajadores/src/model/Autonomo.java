package model;

public class Autonomo extends Trabajador{

    private int coutaSS;

    public Autonomo() {
    }

    public Autonomo(double salario, String nombre, String apellido, int numeroSS, int coutaSS) {
        super(salario, nombre, apellido, numeroSS);
        this.coutaSS = coutaSS;
    }

    public int getCoutaSS() {
        return coutaSS;
    }

    public void setCoutaSS(int coutaSS) {
        this.coutaSS = coutaSS;
    }


    @Override
    public void mostarDatos() {
        super.mostarDatos();
        System.out.println("coutaSS = " + coutaSS);
    }

    @Override
    public void calcularSalarioMes() {
        double salario = getSalario() - (coutaSS*12);
        System.out.println("El salario mensual es" +salario);
    }
}
