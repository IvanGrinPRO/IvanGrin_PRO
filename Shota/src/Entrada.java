import model.ClasePadre;

public class Entrada {
    public static void main(String[] args) {

//        ClasePadre padre = new ClasePadre("Sasha","Hustko","SanyaLox@gmail.com",40);
        ClasePadre padre = new ClasePadre();
        padre.mostrarDatos();

        ClasePadre.Hija claseHija = padre.new Hija();

        claseHija.mostrarDatos();

    }
}