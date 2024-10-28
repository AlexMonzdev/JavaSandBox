package com.alexmonzon.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E05_Arrays {

    String palabra = "Hola";
    int[] numeros = {100, 200, 300, 400, 500};
    String nombres[] = {"Madrid", "Barcelona", "Valencia", "Sevilla", "Bilbao"};

    List<String> nombress = new ArrayList<>(Arrays.asList("Madrid", "Barcelona", "Valencia", "Sevilla", "Bilbao"));
    List<Integer> numeross = new ArrayList<>(Arrays.asList(600,700,800,900,1000));



    public void acceso() {

        for (int i = 0; i < palabra.length(); i++) {
            System.out.println(palabra.charAt(i));
        }
        for (String nombre : nombres) {
            System.out.println("nombres = " + nombre);
        }
        for (int numero : numeros) {
            System.out.println("numeros = " + numero);
        }

    }

    public void accessoStreams() {

        palabra.chars().forEach(x -> System.out.println((char) x));

        nombress.stream()
                .forEach(nombre -> System.out.println("nombres = " + nombre));

        numeross.stream().forEach(numero -> System.out.println("numero = "+ numero));

    }


}
