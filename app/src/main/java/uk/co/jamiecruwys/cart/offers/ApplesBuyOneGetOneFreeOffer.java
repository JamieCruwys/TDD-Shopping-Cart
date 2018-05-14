package uk.co.jamiecruwys.cart.offers;

import java.math.BigDecimal;
import java.util.ArrayList;

import uk.co.jamiecruwys.cart.Basket;
import uk.co.jamiecruwys.cart.products.Apple;
import uk.co.jamiecruwys.cart.products.Product;

public class ApplesBuyOneGetOneFreeOffer extends Offer {
    @Override
    public BigDecimal getDiscountAmount(Basket basket) {
        ArrayList<Apple> apples = new ArrayList<>();
        for (Product product : basket.getProducts()) {
            if (product instanceof Apple) {
                apples.add((Apple) product);
            }
        }

        int count = apples.size();
        int ineligibleCount = count % 2;
        int discountableCount = (count - ineligibleCount) / 2;

        BigDecimal applePrice = new Apple().getPrice();
        return applePrice.multiply(new BigDecimal(discountableCount));
    }
}