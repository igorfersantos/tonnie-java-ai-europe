package domain;

import java.math.BigDecimal;

public interface Taxable {
    BigDecimal calculateTaxes();
}
