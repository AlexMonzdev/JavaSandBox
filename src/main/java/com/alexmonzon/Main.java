package com.alexmonzon;

import com.alexmonzon.basics.B11_POO.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

    List<Vehiculo> vehiculos = List.of(new Coche(), new Camion(), new Moto());
    Race carrera = new Race(vehiculos);
    carrera.start();
















    }

}