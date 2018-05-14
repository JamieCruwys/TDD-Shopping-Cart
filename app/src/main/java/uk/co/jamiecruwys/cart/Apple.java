package uk.co.jamiecruwys.cart;

import java.math.BigDecimal;

import uk.co.jamiecruwys.cart.products.Product;

public class Apple extends Product {
    public BigDecimal getPrice() {
        return new BigDecimal(0.6);
    }
}