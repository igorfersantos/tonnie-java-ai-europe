import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // https://www.w3schools.com/java/java_operators.asp
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número:");
        var value1 = scanner.nextInt();
        System.out.printf("A raiz quadrada de %s é %s\n", value1, Math.sqrt(value1));
        System.out.printf("A potência de %s elevado a 2 é %s\n", value1, Math.pow(value1, 2));
        System.out.printf("++value = %s\n", ++value1);
        System.out.printf("value++ = %s\n", value1++);
        System.out.printf("value = %s\n", value1);
    }
}