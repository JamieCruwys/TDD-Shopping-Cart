package uk.co.jamiecruwys.cart;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.Assert.assertEquals;

public class BasketUnitTest {
    @Test
    public void empty_basket_value_is_0() {
        BigDecimal actual = new Basket().getTotal();
        assertEquals(new BigDecimal(0.00).setScale(2, RoundingMode.CEILING), actual);
    }

    @Test
    public void one_apple_basket_value_is_correct() {
        Basket basket = new Basket();
        basket.add(new Apple());
        BigDecimal actual = basket.getTotal();
        assertEquals(new BigDecimal(0.60).setScale(2, RoundingMode.CEILING), actual);
    }

    @Test
    public void two_apples_basket_value_is_correct() {
        Basket basket = new Basket();
        basket.add(new Apple());
        basket.add(new Apple());
        BigDecimal actual = basket.getTotal();
        assertEquals(new BigDecimal(1.20).setScale(2, RoundingMode.CEILING), actual);
    }
}