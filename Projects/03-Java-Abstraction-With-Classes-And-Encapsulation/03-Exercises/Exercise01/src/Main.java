import java.math.BigDecimal;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static BankAccount bankAccount = null;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option = -1;

        while (option != 7) {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar um boleto");
            System.out.println("6 - Verificar se a conta está usando cheque especial");
            System.out.println("7 - Sair");
            option = scanner.nextInt();

            if (option == 7) break;
            if (bankAccount == null) {
                if (!askIfUserWantToCreateAccount(scanner)) continue;
                handleOption(3);
            }

            handleOption(option);
        }

        System.out.println("Ending the program!");
    }

    private static boolean askIfUserWantToCreateAccount(Scanner scanner) {
        System.out.println("There isn't an account created yet for this operation.");
        System.out.println("Do you want to create one right now? (y/n)");
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("n")) {
            System.out.println("Ok. When you wish to create an account");
            System.out.println("you can start by depositing a starting amount (option 3)");
            return false;
        }
        System.out.println("Nice! We will start creating the account with a starting amount right now.");
        return true;
    }

    private static void handleOption(int option) {
        switch (option) {
            case 1 -> {
                System.out.printf("Your account balance is R$%.2f\n", bankAccount.getAccountBalance());
            }
            case 2 -> {
                System.out.printf("Your overdraft balance is R$%.2f\n", bankAccount.getOverdraftBalance());
            }
            case 3 -> {
                System.out.println("Enter how much you want to deposit:");
                BigDecimal depositAmount = scanner.nextBigDecimal();
                if (bankAccount == null) {
                    bankAccount = new BankAccount(depositAmount);
                    System.out.println("Your account has been created!");
                    break;
                }
                bankAccount.deposit(depositAmount);
                System.out.printf("Your new balance is R$%.2f\n", bankAccount.getAccountBalance());
            }
            case 4 -> {
                System.out.println("Enter how much you want to withdraw:");
                BigDecimal withdrawAmount = scanner.nextBigDecimal();
                if (!bankAccount.withdraw(withdrawAmount)) {
                    System.out.println("You don't have enough funds and overdraft to withdraw this amount!");
                    break;
                }
                System.out.printf("Done! R$%.2f has been withdrawn.\nYour new balance:R$%.2f\nOverdraft Usage: R$%.2f\n",
                        withdrawAmount,
                        bankAccount.getAccountBalance(),
                        bankAccount.getOverdraftUsage() == null ? 0f : bankAccount.getOverdraftUsage());
            }
            case 5 -> {
                System.out.println("Enter the payment amount:");
                BigDecimal paymentAmount = scanner.nextBigDecimal();
                if (!bankAccount.pay(paymentAmount)) {
                    System.out.println("You don't have enough funds to pay this bill!");
                } else {
                    System.out.printf("Done! Your payment of R$%.2f was successful.\nYour new balance:R$%.2f\nOverdraft Usage: R$%.2f\n",
                            paymentAmount,
                            bankAccount.getAccountBalance(),
                            bankAccount.getOverdraftUsage() == null ? 0f : bankAccount.getOverdraftUsage());
                }
            }
            case 6 -> {
                System.out.printf("Your account %s using overdraft.\n", bankAccount.isUsingOverdraft() ? "is" : "is not");
            }
            default -> throw new IllegalStateException("Unexpected value: " + option);
        }
    }
}