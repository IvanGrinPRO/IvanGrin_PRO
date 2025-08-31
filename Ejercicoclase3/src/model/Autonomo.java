package model;

public class Autonomo extends Human{

    private int sueldo;
    private boolean contract;

    public Autonomo() {}

    public Autonomo(String nombre, String apellido, String dni, int sueldo, boolean contract) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
        this.contract = contract;
    }

    public void mostrarDatos(){

        System.out.println("nombre :" +getNombre());
        System.out.println("apellido :" +getApellido());
        System.out.println("dni :" +getDni());
        System.out.println("sueldo :" +sueldo);
        if (contract == true){
            System.out.println("contracto : si");
        }else {
            System.out.println("contracto : no");
        }

    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isContract() {
        return contract;
    }

    public void setContract(boolean contract) {
        this.contract = contract;
    }
}
