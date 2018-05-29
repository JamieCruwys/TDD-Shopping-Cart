package uk.co.jamiecruwys.cart.products;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ApplesUnitTest {
	@Test
	public void apple_price_is_correct() {
		// Given
		Apple apple = new Apple();
		
		// When
		BigDecimal actual = apple.getPrice();
		
		// Then
		assertEquals(new BigDecimal(0.6), actual);
	}
}