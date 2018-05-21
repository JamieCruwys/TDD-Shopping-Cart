package uk.co.jamiecruwys.cart;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests for a correct package name
 */
public class PackageNameTest extends BaseTest {
    @Test
    public void useAppContext() {
    	assertEquals("uk.co.jamiecruwys.cart", getContext().getPackageName());
    }
}