package uk.co.jamiecruwys.cart.base;

import android.app.Activity;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;

/**
 * Base tests for testing activities
 * @param <T> representing the {@link android.app.Activity} you wish to test
 */
abstract public class BaseActivityTest<T extends Activity> {
	@Rule
	public ActivityTestRule<T> test = new ActivityTestRule<>(provideTestActivity());

	abstract Class<T> provideTestActivity();
}