package uk.co.jamiecruwys.cart;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

import uk.co.jamiecruwys.cart.offers.Offer;
import uk.co.jamiecruwys.cart.products.Product;

public class Basket {
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Offer> offers = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void add(Offer offer) {
        offers.add(offer);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public BigDecimal getTotal() {
        BigDecimal total = new BigDecimal(0.00);
        for (Product product : products) {
            total = total.add(product.getPrice());
        }
        for (Offer offer : offers) {
            total = total.subtract(offer.getDiscountAmount(this));
        }
        return total.setScale(2, RoundingMode.HALF_UP);
    }
}