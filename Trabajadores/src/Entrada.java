import model.Asalario;
import model.Autonomo;
import model.Jefe;
import model.Trabajador;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {

        Asalario asalario = new Asalario(20000,"Ivan","Grinchuk",12345,0.21,
                14);

        asalario.calcularSalarioMes();

        Autonomo autonomo = new Autonomo(1239879,"Ivan", "Grinchuk", 234,3423);
        ArrayList<Trabajador>trabajadores = new ArrayList<>();
        Jefe jefe = new Jefe(200000,"Ivan","Apellido",4234);

        trabajadores.add(asalario);
        trabajadores.add(autonomo);
        trabajadores.add(jefe);

        for (Trabajador t: trabajadores){
            t.calcularSalarioMes();
        }
    }

}