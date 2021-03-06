package ar.com.unq.po2.tp3.ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test de Multiplos")
public class MultiplosTest {
	
	Multiplos multiplos;
	
	@BeforeEach
	void setUp() {
		multiplos = new Multiplos();
	}

	@Test
	@DisplayName("Should return 999")
	void test() {
		assertEquals(multiplos.calcularMayorMultiplo(3, 9), 999);
	}
	
	@Test
	@DisplayName("Should return -1")
	void test0() {
		assertEquals(multiplos.calcularMayorMultiplo(0, 1), -1);
	}
}
