import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.next();
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println("Are you emancipated? (y/n)");
        var isEmancipated = scanner.next().equalsIgnoreCase("y");

        var canDrive = (age >= 18) || (age >=16 && isEmancipated);
        var message = "";
        if (canDrive) {
            message = name + " you can drive! :)\n";
        } else {
            message = name + ", you can not drive! :(\n";
        }
        System.out.println(message);
    }
}