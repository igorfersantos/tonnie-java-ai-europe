import enumeration.OperationEnum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var option = -1;
        while (option != 5) {
            System.out.println("Choose an option:");
            System.out.println("1 - Sum");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Multiply");
            System.out.println("4 - Division");
            System.out.println("5 - Exit");
            option = scanner.nextInt();
            if (option > 5 || option < 1) {
                System.out.println("Choose a valid option");
                continue;
            }
            if (option == 5)
                break;

            var selectedOption = OperationEnum.values()[option - 1];
            System.out.println(selectedOption);

            System.out.println("Enter the first value:");
            int value1 = scanner.nextInt();
            System.out.println("Enter the second value:");
            int value2 = scanner.nextInt();
            var result = selectedOption.getCalculate().apply(value1, value2);
            System.out.printf("%s %s %s = %s\n\n", value1, selectedOption.getSymbol(), value2, result);
        }

    }
}