package uk.co.jamiecruwys.cart.offers;

import java.math.BigDecimal;

import uk.co.jamiecruwys.cart.Basket;

public abstract class Offer {
    /**
     * Apply an offer to the basket
     * @param basket to getDiscountAmount the offer to
     * @return reduction in price in the form of a {@link BigDecimal}
     */
    public abstract BigDecimal getDiscountAmount(Basket basket);
}