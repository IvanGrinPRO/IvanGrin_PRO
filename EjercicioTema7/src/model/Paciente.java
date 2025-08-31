package model;

public class Paciente{

    String nombre,apellido,nss,enfermedad;

    public Paciente() {
    }

    public Paciente(String nombre, String apellido, String nss, String enfermedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nss = nss;
        this.enfermedad = enfermedad;
    }
}
