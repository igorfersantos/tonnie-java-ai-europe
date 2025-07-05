import java.util.Scanner;

public class Main {
    /*
    Escreva um código que o usuário entre com um primeiro número
    um segundo número maior que o primeiro e escolhe entre a opção par e impar,
    com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial)
    no intervalo de números informados, incluindo os números informados e em ordem decrescente;
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first number:");
        int number1 = scanner.nextInt();
        System.out.println("Enter a second number greater than the first number:");
        int number2 = Integer.MIN_VALUE;
        while (number2 < number1) {
            number2 = scanner.nextInt();
            if (number2 < number1)
                System.out.println("The second number must be greater than the first one! Try again:");
        }

        String odd = "";
        String even = "";
        for (int i = number2; i >= number1; i--) {
            if (i % 2 == 0) {
                even += i + " ";
                continue;
            }
            odd += i + " ";
        }
        System.out.printf("Odd numbers: %s\n", odd);
        System.out.printf("Even numbers: %s\n", even);
    }
}
