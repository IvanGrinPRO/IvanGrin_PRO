package modelo;

public class Bebida extends Alimento{

    private int mililitros;

    public Bebida() {
    }

    public Bebida(String nombre, int mililitros) {
        super(nombre, 3);
        this.mililitros = mililitros;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("mililitros = " + mililitros);
    }

    public int getMililitros() {
        return mililitros;
    }

    public void setMililitros(int mililitros) {
        this.mililitros = mililitros;
    }
}
