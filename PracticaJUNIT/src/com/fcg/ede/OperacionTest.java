package com.fcg.ede;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class OperacionTest {

	Operacion c3;

	@Before
	public void setUp() {
		c3 = new Operacion();
		System.out.println("setUp");

	}

	@BeforeClass
	public static void setUpBeforeClass() {
		System.out.println("BeforeClass");
	}

	@Test
	public void testSuma() {

		Double valorEsperado = 5.0;
		Double valorReal = c3.suma(2, 3);
		assertEquals(valorEsperado, valorReal);
	}

	@Test
	public void testResta() {

		Double valorEsperado = -1.0;
		Double valorReal = c3.resta(2, 3);
		assertEquals(valorEsperado, valorReal);
	}

	@Test
	public void testMultiplicacion() {

		Double valorEsperado = 6.0;
		Double valorReal = c3.multiplicacion(2, 3);
		assertEquals(valorEsperado, valorReal);
	}

	@Test
	public void testDivision() {

		Double valorEsperado = 0.3;
		Double valorReal = c3.division(2, 3);
		assertEquals(valorEsperado, valorReal, 1);
	}

}
