package com.alexmonzon.basics;

public class E02_Conditionals {

    public void userActive() {
        boolean isActive = true;
        if (isActive) {
            System.out.println("The user is active");
        } else {
            System.out.println("The user is notActive");
        }
    }

    public void esMayor(){
        int edad = 17;
        if(edad < 18){
            System.out.println("Es menor");
        }else if(edad >= 18){
            System.out.println("Es mayor");
        }
    }



}
