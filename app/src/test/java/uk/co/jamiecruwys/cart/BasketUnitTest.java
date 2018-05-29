package uk.co.jamiecruwys.cart;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import uk.co.jamiecruwys.cart.offers.ApplesBuyOneGetOneFreeOffer;
import uk.co.jamiecruwys.cart.offers.OrangesThreeForTwoOffer;
import uk.co.jamiecruwys.cart.products.Apple;
import uk.co.jamiecruwys.cart.products.Orange;

import static org.junit.Assert.assertEquals;

public class BasketUnitTest {
	@Test
	public void empty_basket_total_is_0() {
		// Given
		BigDecimal actual = new Basket().getTotal();
		
		// When
		// Basket is empty
		
		// Then
		assertEquals(new BigDecimal(0.00).setScale(2, RoundingMode.HALF_UP), actual);
	}
	
	@Test
	public void one_apple_basket_total_is_correct() {
		// Given
		Basket basket = new Basket();
		basket.add(new Apple());
		
		// When
		BigDecimal actual = basket.getTotal();
		
		// Then
		BigDecimal apples = new Apple().getPrice().multiply(new BigDecimal(1.0));
		BigDecimal expected = apples.setScale(2, RoundingMode.HALF_UP);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void two_apples_basket_total_is_correct() {
		//Given
		Basket basket = new Basket();
		basket.add(new Apple());
		basket.add(new Apple());
		
		// When
		BigDecimal actual = basket.getTotal();
		
		// Then
		BigDecimal apples = new Apple().getPrice().multiply(new BigDecimal(2.0));
		BigDecimal expected = apples.setScale(2, RoundingMode.HALF_UP);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void three_apples_basket_total_is_correct() {
		// Given
		Basket basket = new Basket();
		basket.add(new Apple());
		basket.add(new Apple());
		basket.add(new Apple());
		
		// When
		BigDecimal actual = basket.getTotal();
		
		// Then
		BigDecimal apples = new Apple().getPrice().multiply(new BigDecimal(3.0));
		BigDecimal expected = apples.setScale(2, RoundingMode.HALF_UP);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void one_orange_basket_total_is_correct() {
		// Given
		Basket basket = new Basket();
		basket.add(new Orange());
		
		// When
		BigDecimal actual = basket.getTotal();
		
		// Then
		BigDecimal oranges = new Orange().getPrice().multiply(new BigDecimal(1.0));
		BigDecimal expected = oranges.setScale(2, RoundingMode.HALF_UP);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void two_oranges_basket_total_is_correct() {
		// Given
		Basket basket = new Basket();
		basket.add(new Orange());
		basket.add(new Orange());
		
		// When
		BigDecimal actual = basket.getTotal();
		
		// Then
		BigDecimal oranges = new Orange().getPrice().multiply(new BigDecimal(2.0));
		BigDecimal expected = oranges.setScale(2, RoundingMode.HALF_UP);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void three_oranges_basket_total_is_correct() {
		// Given
		Basket basket = new Basket();
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		
		// When
		BigDecimal actual = basket.getTotal();
		
		// Then
		BigDecimal oranges = new Orange().getPrice().multiply(new BigDecimal(3.0));
		BigDecimal expected = oranges.setScale(2, RoundingMode.HALF_UP);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void one_orange_one_apple_basket_total_is_correct() {
		// Given
		Basket basket = new Basket();
		basket.add(new Orange());
		basket.add(new Apple());
		
		// When
		BigDecimal actual = basket.getTotal();
		
		// Then
		BigDecimal oranges = new Orange().getPrice().multiply(new BigDecimal(1.0));
		BigDecimal apples = new Apple().getPrice().multiply(new BigDecimal(1.0));
		BigDecimal expected = oranges.add(apples).setScale(2, RoundingMode.HALF_UP);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void one_apple_one_orange_basket_total_is_correct() {
		// Given
		Basket basket = new Basket();
		basket.add(new Apple());
		basket.add(new Orange());
		
		// When
		BigDecimal actual = basket.getTotal();
		
		// Then
		BigDecimal oranges = new Orange().getPrice().multiply(new BigDecimal(1.0));
		BigDecimal apples = new Apple().getPrice().multiply(new BigDecimal(1.0));
		BigDecimal expected = oranges.add(apples).setScale(2, RoundingMode.HALF_UP);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void three_apples_one_orange_basket_total_is_correct() {
		// Given
		Basket basket = new Basket();
		basket.add(new Apple());
		basket.add(new Apple());
		basket.add(new Orange());
		basket.add(new Apple());
		
		// When
		BigDecimal actual = basket.getTotal();
		
		// Then
		BigDecimal oranges = new Orange().getPrice().multiply(new BigDecimal(1.0));
		BigDecimal apples = new Apple().getPrice().multiply(new BigDecimal(3.0));
		BigDecimal expected = oranges.add(apples).setScale(2, RoundingMode.HALF_UP);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void three_apples_in_a_row_one_orange_basket_total_is_correct() {
		// Given
		Basket basket = new Basket();
		basket.add(new Apple());
		basket.add(new Apple());
		basket.add(new Apple());
		basket.add(new Orange());
		
		// When
		BigDecimal actual = basket.getTotal();
		
		// Then
		BigDecimal oranges = new Orange().getPrice().multiply(new BigDecimal(1.0));
		BigDecimal apples = new Apple().getPrice().multiply(new BigDecimal(3.0));
		BigDecimal expected = oranges.add(apples).setScale(2, RoundingMode.HALF_UP);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void three_oranges_one_apple_basket_total_is_correct() {
		// Given
		Basket basket = new Basket();
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Apple());
		basket.add(new Orange());
		
		// When
		BigDecimal actual = basket.getTotal();
		
		// Then
		BigDecimal oranges = new Orange().getPrice().multiply(new BigDecimal(3.0));
		BigDecimal apples = new Apple().getPrice().multiply(new BigDecimal(1.0));
		BigDecimal expected = oranges.add(apples).setScale(2, RoundingMode.HALF_UP);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void three_oranges_in_a_row_one_apple_basket_total_is_correct() {
		// Given
		Basket basket = new Basket();
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Apple());
		
		// When
		BigDecimal actual = basket.getTotal();
		
		// Then
		BigDecimal oranges = new Orange().getPrice().multiply(new BigDecimal(3.0));
		BigDecimal apples = new Apple().getPrice().multiply(new BigDecimal(1.0));
		BigDecimal expected = oranges.add(apples).setScale(2, RoundingMode.HALF_UP);
		
		assertEquals(expected, actual);
	}

	/**
	 * Discounted basket tests
	 */
	
	@Test
	public void empty_discounted_basket_total_is_0() {
		// Given
		Basket basket = new Basket();
		
		// When
		BigDecimal actual = new Basket().getTotal();
		
		// Then
		BigDecimal expected = new BigDecimal(0.00).setScale(2, RoundingMode.HALF_UP);
		assertEquals(expected, actual);
	}
	
	@Test
	public void one_apple_normal_price() {
		// Given
		Basket basket = new Basket();
		basket.add(new Apple());
		
		// When
		BigDecimal actual = basket.getTotal();
		
		// Then
		
		// Customer pays for 1/1 apples
		BigDecimal apples = new Apple().getPrice().multiply(new BigDecimal(1.0));
		
		// Customer gets 0 free apples
		BigDecimal expected = apples.setScale(2, RoundingMode.HALF_UP);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void two_apples_should_be_price_of_one_apple_due_to_bogof() {
		// Given
		Basket basket = new Basket();
		basket.add(new ApplesBuyOneGetOneFreeOffer());
		basket.add(new Apple());
		basket.add(new Apple());
		
		// When
		BigDecimal actual = basket.getTotal();
		
		// Then
		
		// Customer pays for 1/2 apples
		BigDecimal apples = new Apple().getPrice().multiply(new BigDecimal(1.0));
		
		// Customer gets 1 free apple
		BigDecimal expected = apples.setScale(2, RoundingMode.HALF_UP);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void three_apples_should_be_price_of_two_due_to_bogof() {
		// Given
		Basket basket = new Basket();
		basket.add(new ApplesBuyOneGetOneFreeOffer());
		basket.add(new Apple());
		basket.add(new Apple());
		basket.add(new Apple());
		
		// When
		BigDecimal actual = basket.getTotal();
		
		// Then
		
		// Customer pays for 2/3 apples
		BigDecimal apples = new Apple().getPrice().multiply(new BigDecimal(2.0));
		
		// Customer gets 1 free apple
		BigDecimal expected = apples.setScale(2, RoundingMode.HALF_UP);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void four_apples_should_be_price_of_two_due_to_bogof() {
		// Given
		Basket basket = new Basket();
		basket.add(new ApplesBuyOneGetOneFreeOffer());
		basket.add(new Apple());
		basket.add(new Apple());
		basket.add(new Apple());
		basket.add(new Apple());
		
		// When
		BigDecimal actual = basket.getTotal();
		
		// Then
		
		// Customer pays for 2/4 apples
		BigDecimal apples = new Apple().getPrice().multiply(new BigDecimal(2.0));
		
		// Customer gets 2 free apples
		BigDecimal expected = apples.setScale(2, RoundingMode.HALF_UP);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void five_apples_should_be_price_of_three_due_to_bogof() {
		// Given
		Basket basket = new Basket();
		basket.add(new ApplesBuyOneGetOneFreeOffer());
		basket.add(new Apple());
		basket.add(new Apple());
		basket.add(new Apple());
		basket.add(new Apple());
		basket.add(new Apple());
		
		// When
		BigDecimal actual = basket.getTotal();
		
		// Then
		
		// Customer pays for 3/5 apples
		BigDecimal apples = new Apple().getPrice().multiply(new BigDecimal(3.0));
		
		// Customer gets 0 free apples
		BigDecimal expected = apples.setScale(2, RoundingMode.HALF_UP);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void one_orange_normal_price() {
		// Given
		Basket basket = new Basket();
		basket.add(new OrangesThreeForTwoOffer());
		basket.add(new Orange());
		
		// When
		BigDecimal actual = basket.getTotal();
		
		// Then
		
		// Customer pays for 1/1 oranges
		BigDecimal oranges = new Orange().getPrice().multiply(new BigDecimal(1.0));
		
		// Customer gets 0 free oranges
		BigDecimal expected = oranges.setScale(2, RoundingMode.HALF_UP);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void two_oranges_normal_price() {
		// Given
		Basket basket = new Basket();
		basket.add(new OrangesThreeForTwoOffer());
		basket.add(new Orange());
		basket.add(new Orange());
		
		// When
		BigDecimal actual = basket.getTotal();
		
		// Then
		
		// Customer pays for 2/2 oranges
		BigDecimal oranges = new Orange().getPrice().multiply(new BigDecimal(2.0));
		
		// Customer gets 0 free oranges
		BigDecimal expected = oranges.setScale(2, RoundingMode.HALF_UP);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void three_oranges_for_price_of_two() {
		// Given
		Basket basket = new Basket();
		basket.add(new OrangesThreeForTwoOffer());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		
		// When
		BigDecimal actual = basket.getTotal();
		
		// Then
		
		// Customer pays for 2/3 oranges
		BigDecimal oranges = new Orange().getPrice().multiply(new BigDecimal(2.0));
		
		// Customer gets 1 free orange
		BigDecimal expected = oranges.setScale(2, RoundingMode.HALF_UP);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void four_oranges_for_price_of_two_plus_one() {
		// Given
		Basket basket = new Basket();
		basket.add(new OrangesThreeForTwoOffer());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		
		// When
		BigDecimal actual = basket.getTotal();
		
		// Then
		
		// Customer pays for 3/4 oranges
		BigDecimal oranges = new Orange().getPrice().multiply(new BigDecimal(3.0));
		
		// Customer gets 1 free orange
		BigDecimal expected = oranges.setScale(2, RoundingMode.HALF_UP);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void five_oranges_for_price_of_two_plus_two() {
		// Given
		Basket basket = new Basket();
		basket.add(new OrangesThreeForTwoOffer());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		
		// When
		BigDecimal actual = basket.getTotal();
		
		// Then
		
		// Customer pays for 4/5 oranges
		BigDecimal oranges = new Orange().getPrice().multiply(new BigDecimal(4.0));
		
		// Customer gets 1 free orange
		BigDecimal expected = oranges.setScale(2, RoundingMode.HALF_UP);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void six_oranges_for_price_of_four() {
		// Given
		Basket basket = new Basket();
		basket.add(new OrangesThreeForTwoOffer());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		
		// When
		BigDecimal actual = basket.getTotal();
		
		// Then
		
		// Customer pays for 4/6 oranges
		BigDecimal oranges = new Orange().getPrice().multiply(new BigDecimal(4.0));
		
		// Customer gets 2 free oranges
		BigDecimal expected = oranges.setScale(2, RoundingMode.HALF_UP);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void seven_oranges_for_price_of_four_plus_one() {
		// Given
		Basket basket = new Basket();
		basket.add(new OrangesThreeForTwoOffer());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		
		// When
		BigDecimal actual = basket.getTotal();
		
		// Then
		
		// Customer pays for 5/7 oranges
		BigDecimal oranges = new Orange().getPrice().multiply(new BigDecimal(5.0));
		
		// Customer gets 2 free oranges
		BigDecimal expected = oranges.setScale(2, RoundingMode.HALF_UP);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void eight_oranges_for_price_of_four_plus_two() {
		// Given
		Basket basket = new Basket();
		basket.add(new OrangesThreeForTwoOffer());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		
		// When
		BigDecimal actual = basket.getTotal();
		
		// Then
		
		// Customer pays for 6/8 oranges
		BigDecimal oranges = new Orange().getPrice().multiply(new BigDecimal(6.0));
		
		// Customer gets 2 oranges free
		BigDecimal expected = oranges.setScale(2, RoundingMode.HALF_UP);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void nine_oranges_for_price_of_six() {
		// Given
		Basket basket = new Basket();
		basket.add(new OrangesThreeForTwoOffer());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		
		// When
		BigDecimal actual = basket.getTotal();
		
		// Then
		
		// Customer pays for 6/9 oranges
		BigDecimal oranges = new Orange().getPrice().multiply(new BigDecimal(6.0));
		
		// Customer gets 3 oranges free
		BigDecimal expected = oranges.setScale(2, RoundingMode.HALF_UP);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void ten_oranges_for_price_of_six_plus_one() {
		// Given
		Basket basket = new Basket();
		basket.add(new OrangesThreeForTwoOffer());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		
		// When
		BigDecimal actual = basket.getTotal();
		
		// Then
		
		// Customer pays for 7/10 oranges
		BigDecimal oranges = new Orange().getPrice().multiply(new BigDecimal(7.0));
		
		// Customer gets 3 oranges free
		BigDecimal expected = oranges.setScale(2, RoundingMode.HALF_UP);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void two_apples_three_oranges() {
		// Given
		Basket basket = new Basket();
		basket.add(new ApplesBuyOneGetOneFreeOffer());
		basket.add(new OrangesThreeForTwoOffer());
		basket.add(new Apple());
		basket.add(new Apple());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		
		// When
		BigDecimal actual = basket.getTotal();
		
		// Then
		
		// Customer pays for 2/3 oranges
		BigDecimal oranges = new Orange().getPrice().multiply(new BigDecimal(2.0));
		
		// Customer pays for 1/2 apples
		BigDecimal apples = new Apple().getPrice().multiply(new BigDecimal(1.0));
		
		// Customer gets 1 oranges and 1 apples free
		BigDecimal expected = oranges.add(apples).setScale(2, RoundingMode.HALF_UP);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void four_apples_six_oranges() {
		// Given
		Basket basket = new Basket();
		basket.add(new ApplesBuyOneGetOneFreeOffer());
		basket.add(new OrangesThreeForTwoOffer());
		basket.add(new Apple());
		basket.add(new Apple());
		basket.add(new Apple());
		basket.add(new Apple());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Orange());
		
		// When
		BigDecimal actual = basket.getTotal();
		
		// Then
		
		// Customer pays for 4/6 oranges
		BigDecimal oranges = new Orange().getPrice().multiply(new BigDecimal(4.0));
		
		// Customer pays for 2/4 apples
		BigDecimal apples = new Apple().getPrice().multiply(new BigDecimal(2.0));
		
		// Customer gets 2 oranges and 2 apples free
		BigDecimal expected = oranges.add(apples).setScale(2, RoundingMode.HALF_UP);
		
		assertEquals(expected, actual);
	}
}