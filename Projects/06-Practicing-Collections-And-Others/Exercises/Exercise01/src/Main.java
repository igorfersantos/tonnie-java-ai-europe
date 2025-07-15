import br.com.dio.calc.Operation;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selectedOption = -1;
        while (selectedOption > Operation.values().length + 1 || selectedOption < 1) {
            printOptions();
            selectedOption = scanner.nextInt();
        }
        if (selectedOption == Operation.values().length + 1) return;
        var selectedOperation = Operation.values()[selectedOption - 1];
        System.out.println("Enter the numbers separated by comma e.g:1,2,3,4");
        var numbersStr = scanner.next();
        var numberArray = Arrays.stream(numbersStr.split(","))
                .mapToLong(n -> Long.parseLong(n))
                .toArray();
        var result = selectedOperation.getOperationCallback().exec(numberArray);
        System.out.printf("The result of the operation is: %s\n\n", result);
    }

    private static void printOptions() {
        System.out.println("Enter the desired operation:");
        System.out.println("1 - Sum");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Exit");
    }
}
