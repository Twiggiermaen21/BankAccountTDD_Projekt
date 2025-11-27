package com.bank.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CuentaTest {

    // Test dla metody ingresar (wpłata)
	@Test
	void testRetirar_SaldoMalejePoprawnie() {
	    // 1. Arrange (Przygotowanie)
	    Cuenta konto = new Cuenta("789012", "Ewa Nowak");
	    
	    // Używamy zaimplementowanej już metody, aby ustawić saldo początkowe
	    konto.ingresar(150.0); 
	    
	    double kwotaWyplaty = 50.0;
	    double oczekiwanySaldo = 100.0; // 150.0 - 50.0

	    // 2. Act (Działanie)
	    konto.retirar(kwotaWyplaty); // <--- Wywołujemy nową, niezdefiniowaną metodę

	    // 3. Assert (Weryfikacja)
	    assertEquals(oczekiwanySaldo, konto.getSaldo(), 0.001, "Saldo po wypłacie powinno być równe 100.0");
	}
}