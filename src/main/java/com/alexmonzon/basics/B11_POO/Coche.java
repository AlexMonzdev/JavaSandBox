package com.alexmonzon.basics.B11_POO;

public class Coche extends Vehiculo{


    public Coche() {
        super("COCHE",0,4);
    }

    public Coche(String marca, int velocidad, int ruedas) {
        super(marca, velocidad, ruedas);
    }

    @Override
    public void acelerar() {
        velocidad +=30;
        System.out.println(velocidad+" Km/h");
    }

    @Override
    protected void frenar() {
        velocidad -=20;
        System.out.println(velocidad+" Km/h");
    }


}
