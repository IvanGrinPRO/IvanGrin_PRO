import model.Alumno;
import model.Asignatura;
import model.Profesor;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {

        ArrayList <Asignatura> asignaturas = new ArrayList<>();

        Asignatura programacion1 = new Asignatura(1);
        Asignatura sistemas = new Asignatura(2);
        Asignatura leguaje = new Asignatura(3);


        Alumno Borja = new Alumno(1,2,3);
        Alumno Juan = new Alumno(1,2,3);
        Alumno Borja1 = new Alumno(1,2,3);

        Profesor profesor = new Profesor();
        profesor.ponerNotas(Borja);
        profesor.ponerNotas(Juan);

        System.out.println("La nota de la asignatura PRO es " +Borja.getAsignatura1().getCalificacion());
        System.out.println("La nota de la asignatura SIS es " +Borja.getAsignatura2().getCalificacion());
        System.out.println("La nota de la asignatura LEN es " +Borja.getAsignatura3().getCalificacion());

        System.out.println("La nota de la asignatura PRO es " +Juan.getAsignatura1().getCalificacion());
        System.out.println("La nota de la asignatura SIS es " +Juan.getAsignatura2().getCalificacion());
        System.out.println("La nota de la asignatura LEN es " +Juan.getAsignatura3().getCalificacion());

        System.out.println("La media es "+ profesor.calcularMedia(Borja));
        System.out.println("La media es "+ profesor.calcularMedia(Juan));


    }
}