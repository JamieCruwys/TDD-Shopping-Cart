package uk.co.jamiecruwys.cart.products;

import java.math.BigDecimal;

public class Orange implements Product {
    public BigDecimal getPrice() {
        return new BigDecimal(0.25);
    }
}