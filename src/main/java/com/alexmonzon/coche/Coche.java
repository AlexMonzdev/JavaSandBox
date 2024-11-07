package com.alexmonzon.coche;


public class Coche {

    private String marca;
    private String modelo;
    private int year;
    private double km;


    public Coche(String marca, String modelo, int year){
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
    }

    public void conducir(double km){
        this.km += km;
    }

    public String monstrarInfo() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", year=" + year +
                ", km=" + km +
                '}';
    }
}
