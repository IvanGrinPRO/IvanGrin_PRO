package model;

public class Carne extends Aliemento{

    private int proteinas;


    public Carne() {
    }

    public Carne(String calidad, String origen, int precio, int proteinas) {
        super(calidad, origen, precio);
        
    }
}
