package model;

public class Elemento {
    private String id;
    private String titulo;
    private Persona autor;
    private int tamanio;
    private String formato;


    public Elemento() {}

    public Elemento(String id, String titulo, Persona autor, int tamanio, String formato) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.tamanio = tamanio;
        this.formato = formato;
    }

    public void mostrarDatos(){

    System.out.println(id);
    System.out.println(titulo);
    System.out.println(autor);
    System.out.println(Tamanio);
    System.out.println(Formato);

}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public int getTamanio() {
        return Tamanio;
    }

    public void setTamanio(int tamanio) {
        Tamanio = tamanio;
    }

    public String getFormato() {
        return Formato;
    }

    public void setFormato(String formato) {
        Formato = formato;
    }
}
