import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var name = "";
        while (!name.equalsIgnoreCase("exit")) {
            System.out.println("Enter a name:");
            name = scanner.next();
            System.out.println(name);
        }
    }
}
