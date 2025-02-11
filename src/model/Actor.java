package model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Actor {

    private String nombre,nie;

    public Actor(){}

    public Actor(String nombre,String nie){

        this.nombre = nombre;
        this.nie = nie;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNie() {
        return nie;
    }

    public void setNie(String nie) {
        this.nie = nie;
    }

}
