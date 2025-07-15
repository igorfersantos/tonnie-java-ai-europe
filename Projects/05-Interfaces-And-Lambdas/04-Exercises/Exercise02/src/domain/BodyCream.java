package domain;

import java.math.BigDecimal;

public class BodyCream extends Product implements Taxable {

    public BodyCream(BigDecimal price) {
        super(price);
    }

    @Override
    public BigDecimal calculateTaxes() {
        return getPrice().multiply(BigDecimal.valueOf(1.015));
    }
}
