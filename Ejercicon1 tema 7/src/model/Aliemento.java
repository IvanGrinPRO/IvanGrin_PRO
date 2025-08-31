package model;

public class Aliemento {

    private String calidad,origen;
    private int precio;

    public Aliemento() {
    }

    public Aliemento(String calidad, String origen, int precio) {

            if (calidad == null || origen == null){

                throw new IllegalArgumentException("hay que poner los datos");
            }

            if (precio <0){
                throw new IllegalArgumentException("el precio no puede ser menos de 0");
            }

            this.calidad = calidad;
            this.origen = origen;
            this.precio = precio;
    }

    public void mostrarDatos(){
        System.out.println("calidad = " + calidad);
        System.out.println("origen = " + origen);
        System.out.println("precio = " + precio);
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
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
