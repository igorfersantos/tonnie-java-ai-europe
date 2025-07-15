package domain;

import java.math.BigDecimal;

public class Attendant {
    private BigDecimal cashInRegister = BigDecimal.ZERO;

    public void receivePayment(BigDecimal paymentAmount) {
        cashInRegister = cashInRegister.add(paymentAmount);
    }

    public void closeRegister() {

    }
}
