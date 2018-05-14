package uk.co.jamiecruwys.cart;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

import uk.co.jamiecruwys.cart.products.Product;

public class Basket {
    private ArrayList<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public BigDecimal getTotal() {
        BigDecimal total = new BigDecimal(0.00);
        for (Product product : products) {
            total = total.add(product.getPrice());
        }
        return total.setScale(2, RoundingMode.HALF_UP);
    }
}