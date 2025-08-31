import model.Coche;
import model.Garaje;
import model.Motor;

public class Entrada {
    public static void main(String[] args) {
        String asd = "asd";
        Coche coche1 =  new Coche("Toyota",120, new Motor(185));
        Coche coche2 =  new Coche("Toyota",120, new Motor(145));
        Garaje garaje = new Garaje().aceptarCoche(coche1,asd);


    }
}