package com.alexmonzon.basics.B11_POO;

public class Camion extends Vehiculo{

    public Camion() {
        super("CAMION",0,6);
    }

    public Camion(String marca, int velocidad, int ruedas) {
        super(marca, velocidad, ruedas);
    }

    @Override
    public void acelerar() {
        velocidad +=15;
        System.out.println(velocidad+" Km/h");
    }

    @Override
    protected void frenar() {
        velocidad -=-10;
        System.out.println(velocidad+" Km/h");
    }


}
