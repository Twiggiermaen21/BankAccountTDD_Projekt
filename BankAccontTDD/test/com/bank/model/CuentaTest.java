package com.bank.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CuentaTest {

    // Test dla metody ingresar (wpłata)
    @Test
    void testIngresar_SaldoWzrastaPoprawnie() {
        // 1. Arrange (Przygotowanie)
        // Zakładamy, że konto jest tworzone z saldem 0.0
        Cuenta konto = new Cuenta("123456", "Jan Kowalski");
        double kwotaWplaty = 100.0;
        double oczekiwanySaldo = 100.0;

        // 2. Act (Działanie)
        konto.ingresar(kwotaWplaty);

        // 3. Assert (Weryfikacja)
        // Używamy metody getSaldo(), której jeszcze nie ma.
        // Oczekujemy, że saldo po wpłacie będzie równe 100.0
        assertEquals(oczekiwanySaldo, konto.getSaldo(), 0.001, "Saldo po wpłacie powinno być równe 100.0");
    }
}