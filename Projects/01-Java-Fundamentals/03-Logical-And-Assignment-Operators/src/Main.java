import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // https://www.w3schools.com/java/java_operators.asp

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanto é 2 + 2?");
        var result = scanner.nextInt();
        var isWrong = result != 4;
        System.out.printf("O resultado é 4, você acertou? (%s)", !isWrong);
    }
}