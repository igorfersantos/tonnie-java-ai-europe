import java.time.OffsetDateTime;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        OffsetDateTime odt = OffsetDateTime.now();
        int currentYear = odt.getYear();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scanner.next();
        System.out.println("Please enter your year of birth:");
        int userYear = scanner.nextInt();
        System.out.printf("Hello %s, you are %s years old!\n", name, currentYear - userYear);
    }
}