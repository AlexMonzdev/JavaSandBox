package com.alexmonzon.scanner;

import java.util.Scanner;

public class user {

    public void autenticacion() {

        String user = "admin";
        String password = "1234";
        int contador = 0;
        boolean autenticado = false;

        Scanner scanner = new Scanner(System.in);

        while (contador < 3) {
            System.out.println("Nombre de usuario: ");
            String nombre = scanner.nextLine();


            System.out.println("Contraseña: ");
            String contrasenya = scanner.nextLine();

            if (nombre.equals(user) && contrasenya.equals(password)) {
                System.out.println("Usuario y contraseña son correctos");
                autenticado = true;
                contador = 3;
            } else {
                System.out.println("Usuario y/o contraseña inválido");
            }
            contador++;
        }
        if (!autenticado){
            System.out.println("Has excedido el número de intentos");
        }
        scanner.close();
    }

}












