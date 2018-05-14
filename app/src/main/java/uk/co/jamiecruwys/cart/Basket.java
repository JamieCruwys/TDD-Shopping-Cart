package uk.co.jamiecruwys.cart;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Basket {
    private BigDecimal total = new BigDecimal(0.00);

    public void add(Apple apple) {
        total = total.add(apple.getPrice());
    }

    public BigDecimal getTotal() {
        return total.setScale(2, RoundingMode.CEILING);
    }
}
