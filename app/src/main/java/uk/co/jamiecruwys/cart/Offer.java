package uk.co.jamiecruwys.cart;

import java.math.BigDecimal;

public abstract class Offer {
    /**
     * Apply an offer to the basket
     * @param basket to getDiscountAmount the offer to
     * @return reduction in price in the form of a {@link BigDecimal}
     */
    public abstract BigDecimal getDiscountAmount(Basket basket);
}