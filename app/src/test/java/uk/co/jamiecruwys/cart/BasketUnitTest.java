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

    @Test
    public void one_apple_basket_value_is_correct() {
        Basket basket = new Basket();
        basket.add(new Apple());
        BigDecimal actual = basket.getTotal();
        assertEquals(new BigDecimal(0.60), actual);
    }
}