package uk.co.jamiecruwys.cart;

import java.math.BigDecimal;
import java.math.RoundingMode;

import uk.co.jamiecruwys.cart.products.Product;

public class Basket {
    private BigDecimal total = new BigDecimal(0.00);

    public void add(Product product) {
        total = total.add(product.getPrice());
    }

    public BigDecimal getTotal() {
        return total.setScale(2, RoundingMode.HALF_UP);
    }
}
