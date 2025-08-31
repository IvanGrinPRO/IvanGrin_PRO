package Util;

public enum Orientacion {
    Norte(1.1),
    Sur(1.1),
    Este(1.05),
    Oeste(1.05);

    private double revalorizacion;


    Orientacion() {
    }

    Orientacion(double revalorizacion) {
        this.revalorizacion = revalorizacion;
    }

    public double getRevalorizacion() {
        return revalorizacion;
    }

    public void setRevalorizacion(double revalorizacion) {
        this.revalorizacion = revalorizacion;
    }
}
