package com.alexmonzon.basics.B11_POO;

import java.util.Objects;

public abstract class Vehiculo {

    private String marca;
    protected int velocidad;
    private int ruedas;

    public Vehiculo() {
    }

    public Vehiculo(String marca, int velocity, int ruedas) {
        this.marca = marca;
        this.velocidad = velocity;
        this.ruedas = ruedas;
    }

    public abstract void acelerar();

    protected abstract void frenar();


    // seter - getters - hascode - equals

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return velocidad == vehiculo.velocidad && ruedas == vehiculo.ruedas && Objects.equals(marca, vehiculo.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, velocidad, ruedas);
    }
}
