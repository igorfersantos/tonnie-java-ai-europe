import java.math.BigDecimal;

public class BankAccount {
    private BigDecimal accountBalance;
    private BigDecimal overdraftBalance;
    private BigDecimal overdraftUsage;
    private BigDecimal totalBalance;
    private boolean usingOverdraft;

    public BankAccount(BigDecimal startAmount) {
        this.accountBalance = startAmount;

        if (startAmount.compareTo(BigDecimal.valueOf(500.00)) <= 0) {
            this.overdraftBalance = BigDecimal.valueOf(50d);
        } else {
            this.overdraftBalance = startAmount.add(startAmount.divide(BigDecimal.TWO));
        }
        updateTotalBalance();
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public BigDecimal getOverdraftBalance() {
        return overdraftBalance;
    }

    public BigDecimal getTotalBalance() {
        return totalBalance;
    }

    public BigDecimal getOverdraftUsage() {
        return overdraftUsage;
    }

    private void updateTotalBalance() {
        totalBalance = accountBalance.add(overdraftBalance);
    }

    public void deposit(BigDecimal depositAmount) {
         /*
            If we are using the account's overdraft
            in the next deposit we should discount 20% of the overdraft used amount.
            e.g: With the starting amount of R$500 and the R$50 overdraft limit used
            we should discount R$10 (20% of 500) of the next deposit if possible.
         */
        if (depositAmount.signum() != 1) return;
        accountBalance = accountBalance.add(depositAmount);
        updateTotalBalance();

        if (!usingOverdraft) return;
        BigDecimal overdraftWithTax = overdraftUsage.multiply(BigDecimal.valueOf(1.2));
        BigDecimal balanceRemaining = accountBalance.subtract(overdraftWithTax);
        if (balanceRemaining.signum() == -1) {
            return;
        }
        accountBalance = balanceRemaining;
        updateTotalBalance();
    }

    public boolean withdraw(BigDecimal withdrawAmount) {
        if (withdrawAmount.compareTo(totalBalance) > 0) return false;
        accountBalance = accountBalance.subtract(withdrawAmount);
        if (accountBalance.compareTo(BigDecimal.ZERO) <= 0) {
            overdraftUsage = accountBalance.abs();
            overdraftBalance = overdraftBalance.subtract(overdraftUsage);
            accountBalance = BigDecimal.ZERO;
            usingOverdraft = true;
        }
        updateTotalBalance();
        return true;
    }

    public boolean pay(BigDecimal paymentAmount) {
        return withdraw(paymentAmount);
    }

    public boolean isUsingOverdraft() {
        return usingOverdraft;
    }
}
