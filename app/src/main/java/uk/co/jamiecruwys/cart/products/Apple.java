package uk.co.jamiecruwys.cart.products;

import java.math.BigDecimal;

public class Apple implements Product {
    public BigDecimal getPrice() {
        return new BigDecimal(0.60);
    }
}