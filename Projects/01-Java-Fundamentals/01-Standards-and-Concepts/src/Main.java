import java.util.Scanner;

public class Main {

    private final static String WELCOME_MESSAGE = "Hi there! Please enter your name:";
    /***
     * Main entry
     * @param args The arguments to the program
     */
    public static void main(String[] args) {
        // Commentary
        Scanner scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);
        String name = scanner.next();
        System.out.println("Now enter your age:");
        Integer age = scanner.nextInt();
        System.out.printf("Hello %s your age is %s\n", name, age);

        // var keyword introduced in non-LTS version 10, LTS version 11.
        //var noType - Doesn't work as Java need to inference the R-Value type at compile time
        var name2 = "Teste";
    }
}
