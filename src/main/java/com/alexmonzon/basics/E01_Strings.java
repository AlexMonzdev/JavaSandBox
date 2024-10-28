package com.alexmonzon.basics;

public class E01_Strings {

    public void compararString(){
        String saludo = "Hola, Mundo";
        String nombe = new String("Juan");
        System.out.println("Longitud de saludo : " + saludo.length());
        if (nombe.equals("Juan")) {
            System.out.println("El nombre es " + nombe);
        }
        if (nombe.equalsIgnoreCase("juan")) {
            System.out.println("El nombre es " + nombe);
        }
    }


}
