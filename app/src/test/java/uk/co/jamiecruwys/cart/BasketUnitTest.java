package uk.co.jamiecruwys.cart;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class BasketUnitTest {
    @Test
    public void empty_basket_value_is_0() {
        BigDecimal actual = new Basket().getTotal();
        assertEquals(new BigDecimal(0.00), actual);
    }
}