package com.alexmonzon.basics.B11_POO;

import java.util.ArrayList;
import java.util.List;

public class Race  {

    private List<Vehiculo> peloton = new ArrayList<>();

    public Race(List<Vehiculo> peloton) {
        this.peloton = peloton;
    }

    public void start(){
        for (Vehiculo vehiculo : peloton) {
            vehiculo.acelerar();;
        }

    }



//  - que al crearla cree un peloton de vehiculos.
//  - publi void start() -> todos los vehiculos del pelotón aceleren a vez

}
