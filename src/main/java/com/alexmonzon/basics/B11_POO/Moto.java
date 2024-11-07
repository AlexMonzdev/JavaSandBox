package com.alexmonzon.basics.B11_POO;

public class Moto extends Vehiculo{

    public Moto() {
        super("MOTO",0,2);
    }

    public Moto(String marca, int velocidad, int ruedas) {
        super(marca, velocidad, ruedas);
    }

    @Override
    public void acelerar() {
        velocidad +=40;
        System.out.println(velocidad+" Km/h");
    }

    @Override
    protected void frenar() {
        velocidad -=20;
        System.out.println(velocidad+" Km/h");
    }


}
