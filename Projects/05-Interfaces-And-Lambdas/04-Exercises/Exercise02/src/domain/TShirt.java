package domain;

import java.math.BigDecimal;

public class TShirt extends Product implements Taxable {
    public TShirt(BigDecimal price) {
        super(price);
    }

    @Override
    public BigDecimal calculateTaxes() {
        return getPrice().multiply(BigDecimal.valueOf(1.025));
    }
}
