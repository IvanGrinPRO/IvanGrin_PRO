package model;

import Util.Orientacion;

public class Terreno {

    private Orientacion orientacion;
    private int metroscuadrados;
    private int valoracion;
    private int Anexo;
    private Casa casa;

    public Terreno() {
    }

    public Terreno(Orientacion orientacion, int metroscuadrados, int valoracion) {
        this.orientacion = orientacion;
        this.metroscuadrados = metroscuadrados;
        this.valoracion = valoracion;
    }

    public void construirCasa(double metroscuadrados){

        if (casa != null) {
            throw new IllegalArgumentException("Ya existe una casa en este terreno");
        } else if (metroscuadrados > this.metroscuadrados) {
            throw new IllegalArgumentException("Casa no puede estar mas grande que terreno");
        }else {

            this.casa = new Casa(metroscuadrados);
        }

    }

    public void mostrarDatos(){

        System.out.println("orientacion = " + orientacion);
        System.out.println("metroscuadrados = " + metroscuadrados);
        System.out.println("valoracion = " + valoracion);

    }


    public class Casa{

        private int habitaciones;
        private double metroscuadrados;
        private boolean piscina;

        public Casa() {
        }

        public Casa(double metroscuadrados) {
            this.metroscuadrados = metroscuadrados;
        }

        public void construirHabitacion(double metroscuadrados){

            if (metroscuadrados > this.metroscuadrados){
                throw new IllegalArgumentException("No se puede construir un habitacion.No hay tanto espacio");
            }
             else{
                this.metroscuadrados -= metroscuadrados;
                habitaciones++;
            }
        }
        public void construirPiscina(){
            if (piscina != false){

                throw new IllegalStateException("Piscina ya existe");
            }
            piscina = true;

        }

        public void construisAnexo(double metros){
            if (metros > this.metroscuadrados){
                throw new IllegalArgumentException("No hay tanto espacion para construir eso");
            }
            else{
                this.metroscuadrados -= metros;
                Anexo++;
            }

        }

        public void mostrarDatos(){

            System.out.println("habitaciones = " + habitaciones);
            System.out.println("metroscuadrados = " + metroscuadrados);
            if (!piscina){
                System.out.println("No hay piscina");
            }else {
                System.out.println("Hay piscina");
            }
            System.out.println("orientacion = " + orientacion.getRevalorizacion());
        }

        public double getMetroscuadrados() {
            return metroscuadrados;
        }

        public void setMetroscuadrados(int metroscuadrados) {
            this.metroscuadrados = metroscuadrados;
        }

        public int getHabitaciones() {
            return habitaciones;
        }

        public void setHabitaciones(int habitaciones) {
            this.habitaciones = habitaciones;
        }

        public boolean isPiscina() {
            return piscina;
        }

        public void setPiscina(boolean piscina) {
            this.piscina = piscina;
        }
    }

    public Orientacion getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(Orientacion orientacion) {
        this.orientacion = orientacion;
    }

    public int getMetroscuadrados() {
        return metroscuadrados;
    }

    public void setMetroscuadrados(int metroscuadrados) {
        this.metroscuadrados = metroscuadrados;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public int getAnexo() {
        return Anexo;
    }

    public void setAnexo(int anexo) {
        Anexo = anexo;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }
}
