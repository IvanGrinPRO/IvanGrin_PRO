package control;

import model.Coche;

import java.util.ArrayList;

public class Gestor <S extends Coche>{

    private ArrayList<S> lista;

    public void anadirElemento(S dato){
        this.lista.add(dato);

    }

}
