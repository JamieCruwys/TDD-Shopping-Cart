package uk.co.jamiecruwys.cart.products;

import org.junit.Test;

import java.math.BigDecimal;

import uk.co.jamiecruwys.cart.products.Apple;

import static org.junit.Assert.*;

public class ApplesUnitTest {
    @Test
    public void apple_price_is_correct() {
        BigDecimal actual = new Apple().getPrice();
        assertEquals(new BigDecimal(0.6), actual);
    }
}