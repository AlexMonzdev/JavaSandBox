package com.alexmonzon.basics.B03_Bucles;

public class E03_BucleFor {

    // imprimir por consola del 5 al 10

    public void buclefor(){
        for (int i = 5; i <= 10 ; i++) {
            System.out.println(i);
        }
    }

    public void pares(){
        for (int i = 5; i <10 ; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }


}
