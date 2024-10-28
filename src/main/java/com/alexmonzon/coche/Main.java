package com.alexmonzon.coche;

public class Main {

    public static void main(String[] args) {
        Coche coche1 = new Coche("opel", "corsa", 2024);
        coche1.conducir(100);
        coche1.mostrarInfo(coche1);
    }



}
