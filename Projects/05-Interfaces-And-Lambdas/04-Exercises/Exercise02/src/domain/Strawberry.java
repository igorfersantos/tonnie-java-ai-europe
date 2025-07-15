package domain;

import java.math.BigDecimal;

public class Strawberry extends Product implements Taxable {
    public Strawberry(BigDecimal price) {
        super(price);
    }

    @Override
    public BigDecimal calculateTaxes() {
        return getPrice().multiply(BigDecimal.valueOf(1.01));
    }
}
