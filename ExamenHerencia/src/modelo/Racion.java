package modelo;

public class Racion extends Alimento{

    private double plato;

    public Racion() {
    }

    public Racion(String nombre, double plato) {
        super(nombre, 10);
        this.plato = plato;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("plato = " + plato);
    }

    public double getPlato() {
        return plato;
    }

    public void setPlato(double plato) {
        this.plato = plato;
    }
}
