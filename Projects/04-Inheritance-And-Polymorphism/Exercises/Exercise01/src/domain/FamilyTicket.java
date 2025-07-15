package domain;

import java.math.BigDecimal;

public class FamilyTicket extends Ticket {
    private final int numberOfPeople;

    public FamilyTicket(BigDecimal price, int numberOfPeople) {
        super(price);
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public BigDecimal getFinalPrice() {
        BigDecimal finalPrice = price.multiply(BigDecimal.valueOf(numberOfPeople));
        if (numberOfPeople > 3) {
            return finalPrice.subtract(finalPrice.multiply(BigDecimal.valueOf(0.05 * numberOfPeople)));
        }
       return finalPrice;
    }
}
