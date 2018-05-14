package uk.co.jamiecruwys.cart;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import uk.co.jamiecruwys.cart.products.Apple;
import uk.co.jamiecruwys.cart.products.Orange;

import static org.junit.Assert.assertEquals;

public class BasketUnitTest {
    @Test
    public void empty_basket_total_is_0() {
        BigDecimal actual = new Basket().getTotal();
        assertEquals(new BigDecimal(0.00).setScale(2, RoundingMode.HALF_UP), actual);
    }

    @Test
    public void one_apple_basket_total_is_correct() {
        Basket basket = new Basket();
        basket.add(new Apple());
        BigDecimal actual = basket.getTotal();
        assertEquals(new BigDecimal(0.60).setScale(2, RoundingMode.HALF_UP), actual);
    }

    @Test
    public void two_apples_basket_total_is_correct() {
        Basket basket = new Basket();
        basket.add(new Apple());
        basket.add(new Apple());
        BigDecimal actual = basket.getTotal();
        assertEquals(new BigDecimal(1.20).setScale(2, RoundingMode.HALF_UP), actual);
    }

    @Test
    public void three_apples_basket_total_is_correct() {
        Basket basket = new Basket();
        basket.add(new Apple());
        basket.add(new Apple());
        basket.add(new Apple());
        BigDecimal actual = basket.getTotal();
        assertEquals(new BigDecimal(1.80).setScale(2, RoundingMode.HALF_UP), actual);
    }

    @Test
    public void one_orange_basket_total_is_correct() {
        Basket basket = new Basket();
        basket.add(new Orange());
        BigDecimal actual = basket.getTotal();
        assertEquals(new BigDecimal(0.25).setScale(2, RoundingMode.HALF_UP), actual);
    }

    @Test
    public void two_oranges_basket_total_is_correct() {
        Basket basket = new Basket();
        basket.add(new Orange());
        basket.add(new Orange());
        BigDecimal actual = basket.getTotal();
        assertEquals(new BigDecimal(0.50).setScale(2, RoundingMode.HALF_UP), actual);
    }

    @Test
    public void three_oranges_basket_total_is_correct() {
        Basket basket = new Basket();
        basket.add(new Orange());
        basket.add(new Orange());
        basket.add(new Orange());
        BigDecimal actual = basket.getTotal();
        assertEquals(new BigDecimal(0.75).setScale(2, RoundingMode.HALF_UP), actual);
    }

    @Test
    public void one_orange_one_apple_basket_total_is_correct() {
        Basket basket = new Basket();
        basket.add(new Orange());
        basket.add(new Apple());
        BigDecimal actual = basket.getTotal();
        assertEquals(new BigDecimal(0.85).setScale(2, RoundingMode.HALF_UP), actual);
    }

    @Test
    public void one_apple_one_orange_basket_total_is_correct() {
        Basket basket = new Basket();
        basket.add(new Apple());
        basket.add(new Orange());
        BigDecimal actual = basket.getTotal();
        assertEquals(new BigDecimal(0.85).setScale(2, RoundingMode.HALF_UP), actual);
    }

    @Test
    public void three_apples_one_orange_basket_total_is_correct() {
        Basket basket = new Basket();
        basket.add(new Apple());
        basket.add(new Apple());
        basket.add(new Orange());
        basket.add(new Apple());
        BigDecimal actual = basket.getTotal();
        assertEquals(new BigDecimal(2.05).setScale(2, RoundingMode.HALF_UP), actual);
    }

    @Test
    public void three_apples_in_a_row_one_orange_basket_total_is_correct() {
        Basket basket = new Basket();
        basket.add(new Apple());
        basket.add(new Apple());
        basket.add(new Apple());
        basket.add(new Orange());
        BigDecimal actual = basket.getTotal();
        assertEquals(new BigDecimal(2.05).setScale(2, RoundingMode.HALF_UP), actual);
    }

    @Test
    public void three_oranges_one_apple_basket_total_is_correct() {
        Basket basket = new Basket();
        basket.add(new Orange());
        basket.add(new Orange());
        basket.add(new Apple());
        basket.add(new Orange());
        BigDecimal actual = basket.getTotal();
        assertEquals(new BigDecimal(1.35).setScale(2, RoundingMode.HALF_UP), actual);
    }

    @Test
    public void three_oranges_in_a_row_one_apple_basket_total_is_correct() {
        Basket basket = new Basket();
        basket.add(new Orange());
        basket.add(new Orange());
        basket.add(new Orange());
        basket.add(new Apple());
        BigDecimal actual = basket.getTotal();
        assertEquals(new BigDecimal(1.35).setScale(2, RoundingMode.HALF_UP), actual);
    }
}