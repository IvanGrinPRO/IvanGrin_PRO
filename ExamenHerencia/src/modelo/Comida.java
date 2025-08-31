package modelo;

public class Comida extends Alimento {

    private int calorias;

    public Comida() {
    }

    public Comida(String nombre, int calorias) {
        super(nombre, 8);
        this.calorias = calorias;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("calorias = " + calorias);
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
}
