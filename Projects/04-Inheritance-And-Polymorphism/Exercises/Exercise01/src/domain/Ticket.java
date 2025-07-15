package domain;

import java.math.BigDecimal;

public abstract class Ticket {
    protected BigDecimal price;

    public Ticket(BigDecimal price) {
        this.price = price;
    }

    public abstract BigDecimal getFinalPrice();
}
