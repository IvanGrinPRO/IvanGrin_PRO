package Model;

public class Carne extends Alimento{

    private int proteinas;


    public Carne() {
    }


    public Carne(String claidad, String origen, int precio, int proteinas) {
        super(claidad, origen, precio);
        this.proteinas = proteinas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("proteinas = " + proteinas);
    }

    public int getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }
}
