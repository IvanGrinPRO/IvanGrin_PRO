package model;

public class Caracteristicas {

    private String identificador, titulo, autor, formato;
    private double tamano;

    Caracteristicas(){}

    public Caracteristicas(String identificador,String tituolo,String autor,String formato,double tamano){

        this.identificador = identificador;
        this.titulo = tituolo;
        this.autor = autor;
        this.formato = formato;
        this.tamano = tamano;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
}
