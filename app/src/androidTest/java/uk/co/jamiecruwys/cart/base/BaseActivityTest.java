package uk.co.jamiecruwys.cart.base;

import android.app.Activity;
import android.support.annotation.IdRes;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;

import uk.co.jamiecruwys.cart.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.Matchers.allOf;

/**
 * Base tests for testing activities
 * @param <T> representing the {@link android.app.Activity} you wish to test
 */
abstract public class BaseActivityTest<T extends Activity> extends BaseTest {
	@Rule
	public ActivityTestRule<T> test = new ActivityTestRule<>(provideTestActivity());

	abstract Class<T> provideTestActivity();

	/**
	 * Check if a view is visible
	 * @param id of the view you want to check is visible
	 */
	public void checkItemVisibility(@IdRes int id) {
		onView(withId(id)).check(matches(isDisplayed()));
	}

	/**
	 * Checks that the text of a view matches the expected text
	 * @param id of the view to check
	 * @param expected text that the view should contain
	 */
	public void checkText(@IdRes int id, String expected) {
		checkItemVisibility(id);
		onView(withId(id)).check(matches(withText(expected)));
	}

	/**
	 * Set the text of a field
	 * @param id of the layout item
	 * @param text to set on the layout item
	 */
	public void setText(@IdRes int id, String text) {
		checkItemVisibility(id);
		onView(withId(id)).perform(replaceText(text), closeSoftKeyboard());
	}

	/**
	 * Clicks a view
	 * @param id of the view to click
	 */
	public void click(@IdRes int id) {
		checkItemVisibility(id);
		onView(withId(id)).perform(ViewActions.click());
	}
}