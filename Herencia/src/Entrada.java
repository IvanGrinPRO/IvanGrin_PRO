import model.Coche;
import model.Motor;
import model.Vehiculo;

public class Entrada {
    public static void main(String[] args) {
        Coche coche = new Coche(new Motor(200,20),"1234A","delante");
        coche.mostrarDatos();
    }
}