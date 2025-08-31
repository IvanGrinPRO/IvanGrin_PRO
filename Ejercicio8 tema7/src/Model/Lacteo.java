package Model;

public class Lacteo extends Alimento{

    private int volumen;

    public Lacteo() {
    }

    public Lacteo(String claidad, String origen, int precio, int volumen) {
        super(claidad, origen, precio);
        this.volumen = volumen;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("volumen = " + volumen);
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
}
