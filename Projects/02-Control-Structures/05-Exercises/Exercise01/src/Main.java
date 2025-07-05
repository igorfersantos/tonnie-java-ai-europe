import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = scanner.nextInt();
        System.out.printf("Generating a multiplication table for the number %s...\n", number);
        System.out.println("======");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%s x %s = %s\n", number, i, number * i);
        }
    }
}
