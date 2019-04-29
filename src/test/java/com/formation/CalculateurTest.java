package com.formation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculateurTest {

	private static Calculateur calcul = null;
	
	@BeforeAll
	public static void init() {
		calcul = new Calculateur();
	}
	
	@Test
	public void addTest() {
		assertEquals(42, calcul.add(35, 7), "Add is not OK");
	}

	@Test
	public void multTest() {
		assertEquals(42, calcul.mult(7, 6), "Mult is not OK");
	}
}
