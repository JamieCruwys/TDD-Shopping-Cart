package uk.co.jamiecruwys.cart.products;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class OrangesUnitTest {
	@Test
	public void orange_price_is_correct() {
		// Given
		Orange orange = new Orange();
		
		// When
		BigDecimal actual = orange.getPrice();
		
		// Then
		assertEquals(new BigDecimal(0.25), actual);
	}
}