package uk.co.jamiecruwys.cart.base;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.runner.RunWith;

/**
 * Base test for every other test to extend from
 * Provides basic functionality
 * <p>
 * Declares @RunWith(AndroidJUnit4.class) so all of the other tests don't need to
 */
@RunWith(AndroidJUnit4.class)
abstract public class BaseTest {
	/**
	 * Convenience method to get the context
	 * @return {@link Context}
	 */
	public Context getContext() {
		return InstrumentationRegistry.getTargetContext();
	}
}