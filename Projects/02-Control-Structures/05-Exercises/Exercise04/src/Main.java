import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * 4. Escreva um código onde o usuário informa um número inicial,
         *     posteriormente irá informar outros N números, a execução do
         *     código irá continuar até que o número informado dividido pelo
         *     primeiro número tenha resto diferente de  0 na divisão, números
         *     menores que o primeiro número devem ser ignorados
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a initial number:");
        int initialNumber = scanner.nextInt();

        int currentNumber = Integer.MIN_VALUE;
        do {
            int temp = currentNumber;
            System.out.println("Enter a number to be used against the initial number:");
            currentNumber = scanner.nextInt();
            if (currentNumber < initialNumber) {
                System.out.printf("The number should be greater than the initial number (%s). Please try again.\n",
                        initialNumber);
                currentNumber = temp;
            }
        } while (currentNumber % initialNumber != 0);

        String message = "Well done!\n" +
                "The last number your used (%s)\n" +
                "when used against the initial number %s, it have a remainder of 0\n" +
                "for the operation %s %% %s!\n";
        System.out.printf(message, currentNumber, initialNumber, currentNumber, initialNumber);
    }
}
