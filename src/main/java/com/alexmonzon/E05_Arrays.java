package com.alexmonzon;

public class E05_Arrays {

    int[] numeros = {100, 200, 300, 400, 500};
    String[] nombres = {"Madrid", "Barcelona", "Valencia", "Sevilla", "Bilbao"};

    public void acceso() {

        for (String nombre : nombres) {
            System.out.println("nombres = "+ nombre);
        }
        for (int numero : numeros) {
            System.out.println("numeros = "+ numero);
        }

    }


}
