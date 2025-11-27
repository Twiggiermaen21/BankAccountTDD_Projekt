// Plik: Cuenta.java (po refaktoryzacji)
package com.bank.model;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
    private String mNumero;
    private String nTitular;
    private List<Movimiento> mMovimientos; // Zmieniamy typ na List<Movimiento>

    public Cuenta(String numero, String titular) {
        this.mNumero = numero;
        this.nTitular = titular;
        this.mMovimientos = new ArrayList<>();
    }
    
    // POPRAWNA IMPLEMENTACJA ingresar
    public void ingresar(double x) {
        Movimiento m = new Movimiento(x);
        this.mMovimientos.add(m);
    }

    // POPRAWNA IMPLEMENTACJA getSaldo
    public double getSaldo() {
        double saldo = 0.0;
        // Pętla sumująca kwoty wszystkich ruchów
        for (Movimiento m : mMovimientos) {
            saldo += m.getImporte();
        }
        return saldo;
    }
 // W pliku Cuenta.java
 // ... (istniejący kod)
 public void retirar(double x) {
     // W tej fazie (RED) zostawiamy PUSTĄ implementację.
     // Zostawienie pustej implementacji sprawi, że:
     // 1. Kod się skompiluje.
     // 2. Test ZAWIEŚĆ (fail), bo saldo pozostanie 150.0, a oczekiwane jest 100.0.
 }
 // ... (reszta kodu)
}