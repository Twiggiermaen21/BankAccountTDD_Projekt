package com.bank.model;

public class Movimiento {
    // Pole przechowujące kwotę transakcji
    private double importe;

    // Konstruktor
    public Movimiento(double importe) {
        this.importe = importe;
    }

    // Getter (pozwala odczytać kwotę transakcji)
    public double getImporte() {
        return importe;
    }
}