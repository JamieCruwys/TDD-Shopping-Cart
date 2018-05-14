package uk.co.jamiecruwys.cart;

import org.junit.Test;

import java.math.BigDecimal;

import uk.co.jamiecruwys.cart.products.Orange;

import static org.junit.Assert.assertEquals;

public class OrangesUnitTest {
    @Test
    public void apple_price_is_correct() {
        BigDecimal actual = new Orange().getPrice();
        assertEquals(new BigDecimal(0.25), actual);
    }
}