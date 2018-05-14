package uk.co.jamiecruwys.cart;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ApplesUnitTest {
    @Test
    public void apple_price_is_correct() {
        BigDecimal actual = Apple().getPrice();
        assertEquals(new BigDecimal(0.6), actual);
    }
}