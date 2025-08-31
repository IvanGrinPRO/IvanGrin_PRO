import Util.Orientacion;
import model.Terreno;

import java.util.Arrays;
import java.util.Scanner;

public class Entrada {

    public static Scanner lectorTeclado = new Scanner(System.in);
    private static Terreno terreno;

    public static void main(String[] args) {
        int opcion;
        boolean validacion = false;

        do {
            System.out.println("1.Crear terreno");
            System.out.println("2.Crear casa");
            System.out.println("3.Mostrar datos de terreno");
            System.out.println("4.Crear un habitacion");
            System.out.println("5.Crear pisciona");
            System.out.println("6.Crear un anexo en la vivienda");
            System.out.println("7.Crear una habitación con m2 superiores a los de la casa");
            System.out.println("8.Mostrar datos de casa");
            System.out.println("9.Salir de sistema");
            System.out.println("Opcion :");
            opcion = lectorTeclado.nextInt();
            try {
                switch (opcion) {

                    case 1:
                        if (!validacion) {
                            System.out.println("Para crear un terreno hay que poner otros datos:");
                            System.out.println("Orientacion de la casa 'norte, sur, este y oeste'");
                            Orientacion orientacion = Orientacion.valueOf(lectorTeclado.next().toLowerCase());
                            System.out.println("Metros cuadrados:");
                            int metroscuadrados = lectorTeclado.nextInt();
                            System.out.println("Valoracion de terreno :");
                            int valoracion = lectorTeclado.nextInt();
                            terreno = new Terreno(orientacion, metroscuadrados, valoracion);
                            validacion = true;
                            break;
                        }else {
                            System.out.println("Terreno ya esta echo");
                        }

                    case 2:
                        try {
                            if (!validacion) {
                                System.out.println("Para crear una casa hay que poner otros datos: ");
                                System.out.println("Metros cuadrados");
                                int metroscuadrados = lectorTeclado.nextInt();
                                terreno.construirCasa(metroscuadrados);
                            } else {
                                System.out.println("No hay terreno para crear casa");
                            }
                        } catch (IllegalAccessError e) {
                            System.out.println("Error:" + e.getMessage());
                        }
                        break;
                    case 3:
                        System.out.println("Los datos de terreno");
                        terreno.mostrarDatos();
                        break;
                    case 4:
                        try {
                            System.out.println("Para construir un habitacion hay que poner tamano");
                            System.out.println("Cuantos metros cuadrados nesecitas para construir habitacion?");
                            int metroscuadrados = lectorTeclado.nextInt();
                            terreno.getCasa().construirHabitacion(metroscuadrados);
                        } catch (Exception e) {
                            System.out.println("Error:" +e.getMessage());
                        }
                        break;
                    case 5:
                        try{
                            terreno.getCasa().construirPiscina();

                        } catch (Exception e) {
                            System.out.println("Error:" +e.getMessage());
                        }
                        System.out.println("Piscina creando con exito");
                        break;
                    case 6:
                        try {
                            System.out.println("Para construir un Anexo hay que poner tamano");
                            System.out.println("Cuantos metros cuadrados nesecitas para construir anexo?");
                            int metroscuadrados = lectorTeclado.nextInt();
                            terreno.getCasa().construisAnexo(metroscuadrados);
                            break;
                        } catch (Exception e) {
                            System.out.println("Error:"+e.getMessage());
                        }
                        System.out.println("Anexo creado con exito");
                    case 7:
                        break;
                    case 8:
                        try {
                            System.out.println("Los datos de la casa");
                            terreno.getCasa().mostrarDatos();
                        }catch (Exception e){
                            System.out.println("Error:" +e.getMessage());
                        }
                        break;

                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }


        }while (opcion !=9);
    }
}