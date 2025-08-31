package model;

public class Trabajador extends Human{

    private int sueldo,numero_de_pagas;

    public Trabajador() {}

    public Trabajador(String nombre, String apellido, String dni, int sueldo, int numero_de_pagas) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
        this.numero_de_pagas = numero_de_pagas;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatod();
        System.out.println("sueldo :" +sueldo);
        System.out.println("numero de pagas :" +numero_de_pagas);
    }



    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getNumero_de_pagas() {
        return numero_de_pagas;
    }

    public void setNumero_de_pagas(int numero_de_pagas) {
        this.numero_de_pagas = numero_de_pagas;
    }
}
