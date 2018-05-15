package uk.co.jamiecruwys.cart.offers;

import java.math.BigDecimal;
import java.util.ArrayList;

import uk.co.jamiecruwys.cart.Basket;
import uk.co.jamiecruwys.cart.products.Orange;
import uk.co.jamiecruwys.cart.products.Product;

public class OrangesThreeForTwoOffer extends Offer {
    @Override
    public BigDecimal getDiscountAmount(Basket basket) {
        ArrayList<Orange> oranges = new ArrayList<>();
        for (Product product : basket.getProducts()) {
            if (product instanceof Orange) {
                oranges.add((Orange) product);
            }
        }

        int count = oranges.size();
        int ineligibleCount = count % 3;
        int discountableCount = (count - ineligibleCount) / 3;

        BigDecimal orangePrice = new Orange().getPrice();
        return orangePrice.multiply(new BigDecimal(discountableCount));
    }
}