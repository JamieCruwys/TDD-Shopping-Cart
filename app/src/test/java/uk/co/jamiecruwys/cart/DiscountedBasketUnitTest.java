package uk.co.jamiecruwys.cart;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import uk.co.jamiecruwys.cart.products.Apple;
import uk.co.jamiecruwys.cart.products.Orange;

import static org.junit.Assert.assertEquals;

public class DiscountedBasketUnitTest {
    @Test
    public void empty_discounted_basket_total_is_0() {
        BigDecimal actual = new Basket().getTotal();
        assertEquals(new BigDecimal(0.00).setScale(2, RoundingMode.HALF_UP), actual);
    }
}