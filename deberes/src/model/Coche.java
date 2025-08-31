package model;

import java.util.Random;

public class Coche {

    private Motor motor;
    private String marca;
    private double averias;


    public Coche() {
    }

    public Coche(String marca, double averias, Motor motor) {
        this.marca = marca;
        this.averias = averias;
        this.motor = motor;
    }

    public void acumularAveria(String averias) {
        Random random = new Random();
        double gastado = random.nextDouble(100, 500);
        averias += gastado;
        if ("aceite".equalsIgnoreCase(averias)) {
            motor.setLitros_aceite(motor.getLitros_aceite() + 10);
        } else {
            motor.setLitros_aceite(motor.getLitros_aceite() + random.nextInt(0, 100));
        }

    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getAverias() {
        return averias;
    }

    public void setAverias(double averias) {
        this.averias = averias;
    }
}

