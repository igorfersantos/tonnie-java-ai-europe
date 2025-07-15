package domain;

import java.math.BigDecimal;

public class Book extends Product implements Taxable {
    public Book(BigDecimal price) {
        super(price);
    }

    @Override
    public BigDecimal calculateTaxes() {
        return getPrice().multiply(BigDecimal.valueOf(1.04));
    }
}
