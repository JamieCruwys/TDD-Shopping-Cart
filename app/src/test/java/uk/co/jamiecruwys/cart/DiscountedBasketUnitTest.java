package uk.co.jamiecruwys.cart;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import uk.co.jamiecruwys.cart.offers.ApplesBuyOneGetOneFreeOffer;
import uk.co.jamiecruwys.cart.offers.OrangesThreeForTwoOffer;
import uk.co.jamiecruwys.cart.products.Apple;
import uk.co.jamiecruwys.cart.products.Orange;

import static org.junit.Assert.assertEquals;

public class DiscountedBasketUnitTest {
    @Test
    public void empty_discounted_basket_total_is_0() {
        BigDecimal actual = new Basket().getTotal();
        assertEquals(new BigDecimal(0.00).setScale(2, RoundingMode.HALF_UP), actual);
    }

    @Test
    public void one_apple_normal_price() {
        Basket basket = new Basket();
        basket.add(new Apple());
        BigDecimal actual = basket.getTotal();
        assertEquals(new BigDecimal(0.60).setScale(2, RoundingMode.HALF_UP), actual);
    }

    @Test
    public void two_apples_should_be_price_of_one_apple_due_to_bogof() {
        Basket basket = new Basket();
        basket.add(new ApplesBuyOneGetOneFreeOffer());
        basket.add(new Apple());
        basket.add(new Apple());
        BigDecimal actual = basket.getTotal();
        assertEquals(new BigDecimal(0.60).setScale(2, RoundingMode.HALF_UP), actual);
    }

    @Test
    public void three_apples_should_be_price_of_two_due_to_bogof() {
        Basket basket = new Basket();
        basket.add(new ApplesBuyOneGetOneFreeOffer());
        basket.add(new Apple());
        basket.add(new Apple());
        basket.add(new Apple());
        BigDecimal actual = basket.getTotal();
        assertEquals(new BigDecimal(1.20).setScale(2, RoundingMode.HALF_UP), actual);
    }

    @Test
    public void four_apples_should_be_price_of_two_due_to_bogof() {
        Basket basket = new Basket();
        basket.add(new ApplesBuyOneGetOneFreeOffer());
        basket.add(new Apple());
        basket.add(new Apple());
        basket.add(new Apple());
        basket.add(new Apple());
        BigDecimal actual = basket.getTotal();
        assertEquals(new BigDecimal(1.20).setScale(2, RoundingMode.HALF_UP), actual);
    }

    @Test
    public void five_apples_should_be_price_of_three_due_to_bogof() {
        Basket basket = new Basket();
        basket.add(new ApplesBuyOneGetOneFreeOffer());
        basket.add(new Apple());
        basket.add(new Apple());
        basket.add(new Apple());
        basket.add(new Apple());
        basket.add(new Apple());
        BigDecimal actual = basket.getTotal();
        assertEquals(new BigDecimal(1.80).setScale(2, RoundingMode.HALF_UP), actual);
    }

    @Test
    public void one_orange_normal_price() {
        Basket basket = new Basket();
        basket.add(new OrangesThreeForTwoOffer());
        basket.add(new Orange());
        BigDecimal actual = basket.getTotal();
        assertEquals(new BigDecimal(0.25).setScale(2, RoundingMode.HALF_UP), actual);
    }

    @Test
    public void two_oranges_normal_price() {
        Basket basket = new Basket();
        basket.add(new OrangesThreeForTwoOffer());
        basket.add(new Orange());
        basket.add(new Orange());
        BigDecimal actual = basket.getTotal();
        assertEquals(new BigDecimal(0.50).setScale(2, RoundingMode.HALF_UP), actual);
    }

    @Test
    public void three_oranges_for_price_of_two() {
        Basket basket = new Basket();
        basket.add(new OrangesThreeForTwoOffer());
        basket.add(new Orange());
        basket.add(new Orange());
        basket.add(new Orange());
        BigDecimal actual = basket.getTotal();
        assertEquals(new BigDecimal(0.50).setScale(2, RoundingMode.HALF_UP), actual);
    }

    @Test
    public void four_oranges_for_price_of_two_plus_one() {
        Basket basket = new Basket();
        basket.add(new OrangesThreeForTwoOffer());
        basket.add(new Orange());
        basket.add(new Orange());
        basket.add(new Orange());
        basket.add(new Orange());
        BigDecimal actual = basket.getTotal();
        assertEquals(new BigDecimal(0.75).setScale(2, RoundingMode.HALF_UP), actual);
    }

    @Test
    public void five_oranges_for_price_of_two_plus_two() {
        Basket basket = new Basket();
        basket.add(new OrangesThreeForTwoOffer());
        basket.add(new Orange());
        basket.add(new Orange());
        basket.add(new Orange());
        basket.add(new Orange());
        basket.add(new Orange());
        BigDecimal actual = basket.getTotal();
        assertEquals(new BigDecimal(1.00).setScale(2, RoundingMode.HALF_UP), actual);
    }
}