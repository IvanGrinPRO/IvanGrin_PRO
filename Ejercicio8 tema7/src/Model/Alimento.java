package Model;

public class Alimento {

    private String claidad,origen;
    private int precio;

    public Alimento() {
    }

    public Alimento(String claidad, String origen, int precio) {
        this.claidad = claidad;
        this.origen = origen;
        this.precio = precio;
    }

    public void mostrarDatos(){

        System.out.println("claidad = " + claidad);
        System.out.println("origen = " + origen);
        System.out.println("precio = " + precio);
    }

    public String getClaidad() {
        return claidad;
    }

    public void setClaidad(String claidad) {
        this.claidad = claidad;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
