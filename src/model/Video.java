package model;

import java.util.ArrayList;

public class Video extends Caracteristicas{


    private Director director;
    private ArrayList<Actor> actors;

    public Video() {
        actors = new ArrayList<>();
    }

    public Video(String identificador, String tituolo, String autor, String formato, double tamano, Director director, ArrayList<Actor> actors) {
        super(identificador, tituolo, autor, formato, tamano);
        this.director = director;
        this.actors = actors;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Video{" +
                "director=" + director +
                ", actors=" + actors +
                '}';
    }
}
