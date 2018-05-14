package uk.co.jamiecruwys.cart.products;

import java.math.BigDecimal;

public class Apple extends Product {
    public BigDecimal getPrice() {
        return new BigDecimal(0.60);
    }
}