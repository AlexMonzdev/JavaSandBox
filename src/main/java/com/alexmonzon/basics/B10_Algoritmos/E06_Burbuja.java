package com.alexmonzon.basics.B10_Algoritmos;

import java.util.Arrays;

public class E06_Burbuja {

    // Algoritmo de la Burbuja

    // Ordner de menor a mayor el siguente Array:



    public void ordenar(String arrayuno, String arraydos){

        char[] arraycharUno = arrayuno.toCharArray();
        char[] arraycharDos = arraydos.toCharArray();

        for (int i = 0; i < arraycharUno.length -1 ; i++) {
            for (int j = 0; j < arraycharUno.length -1 ; j++) {
                char temp;
                if(arraycharUno[j] > arraycharUno[j+1]){
                    temp = arraycharUno[j];
                    arraycharUno[j] = arraycharUno[j+1];
                    arraycharUno[j+1] = temp;
                }
            }
        }

        for (int k = 0; k < arraycharDos.length -1 ; k++) {
            for (int j = 0; j < arraycharDos.length -1 ; j++) {
                char temp;
                if(arraycharDos[j] > arraycharDos[j+1]){
                    temp = arraycharDos[j];
                    arraycharDos[j] = arraycharDos[j+1];
                    arraycharDos[j+1] = temp;
                }
            }
        }

        if (Arrays.equals(arraycharUno, arraycharDos)){
            System.out.println("Es un anagrama");
        }else{
            System.out.println("No es un anagrama");
        }


    }




}
