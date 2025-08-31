package Model;

public class Silla extends Mueble{

    private int patos;

    public Silla() {
    }

    public Silla(String material, int peso, int presio, int patos) {
        super(material, peso, presio);
        this.patos = patos;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("patos = " + patos);
    }

    public int getPatos() {
        return patos;
    }

    public void setPatos(int patos) {
        this.patos = patos;
    }
}
