package domain;

import java.math.BigDecimal;

public class StudentTicket extends Ticket {
    public StudentTicket(BigDecimal price) {
        super(price);
    }

    @Override
    public BigDecimal getFinalPrice() {
       return price.divide(BigDecimal.TWO);
    }
}
