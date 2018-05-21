package uk.co.jamiecruwys.cart;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;
import java.math.RoundingMode;

import uk.co.jamiecruwys.cart.products.Product;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Example mockito unit test
 */
public class MockitoUnitTest {
	@Mock
	private Product productContract;

	private Basket basket = new Basket();

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		when(productContract.getPrice()).thenReturn(new BigDecimal(0.01).setScale(2, RoundingMode.HALF_UP));
	}

	@Test
	public void basket_works_with_custom_items() {
		basket.add(productContract);
		basket.add(productContract);
		basket.add(productContract);

		BigDecimal total = basket.getTotal();

		InOrder inOrder = Mockito.inOrder(productContract);
		inOrder.verify(productContract).getPrice();
		inOrder.verify(productContract).getPrice();
		inOrder.verify(productContract).getPrice();

		assertEquals(new BigDecimal(0.03).setScale(2, RoundingMode.HALF_UP), total);
	}
}