package model;

import java.util.ArrayList;

public class Video extends Elemento{


    private Persona director;
    private ArrayList<Persona> actores;

    public Video(){}

    public Video(Persona director, ArrayList<Persona> actores) {
        this.director = director;
        this.actores = actores;
    }

    public Video(String id, String titulo, Persona autor, int tamanio, String formato, Persona director, ArrayList<Persona> actores) {
        super(id, titulo, autor, tamanio, formato);
        this.director = director;
        this.actores = actores;
    }
}
