package Model;

public class Mesa extends Mueble{

    private int capacidad;

    public Mesa() {
    }

    public Mesa(String material, int peso, int presio, int capacidad) {
        super(material, peso, presio);
        this.capacidad = capacidad;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("capacidad = " + capacidad);
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
