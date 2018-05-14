package uk.co.jamiecruwys.cart.products;

import java.math.BigDecimal;

import uk.co.jamiecruwys.cart.products.Product;

public class Orange extends Product {
    public BigDecimal getPrice() {
        return new BigDecimal(0.25);
    }
}