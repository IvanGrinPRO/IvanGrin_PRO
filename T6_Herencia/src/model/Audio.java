package model;

public class Audio extends Elemento{

    private double duracion;
    private String soporte;


    public Audio() {}

    public Audio(double duracion, String soporte, Persona autor, String formato, String id, int tamanio, String titulo) {
        this.duracion = duracion;
        this.soporte = soporte;
        setAutor(autor);
        setFormato(formato);
        setId(id);
        setTamanio(tamanio);
        setTitulo(titulo);

    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }
}
