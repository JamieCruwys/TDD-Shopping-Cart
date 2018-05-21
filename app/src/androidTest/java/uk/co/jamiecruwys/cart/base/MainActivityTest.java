package uk.co.jamiecruwys.cart.base;

import org.junit.Test;

import uk.co.jamiecruwys.cart.MainActivity;
import uk.co.jamiecruwys.cart.R;

/**
 * Test the {@link MainActivity}
 */
public class MainActivityTest extends BaseActivityTest<MainActivity> {
	@Override
	Class<MainActivity> provideTestActivity() {
		return MainActivity.class;
	}

	@Test
	public void fabVisibleTest() {
		checkItemVisibility(R.id.fab);
	}

	@Test
	public void helloTextTest() {
		checkText(R.id.hello, "Hello World!");
	}
}