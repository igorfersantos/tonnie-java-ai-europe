import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 3. Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela
        //   - fórmula: área=base X altura
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the base size of the rectangle:");
        int baseSize = scanner.nextInt();
        System.out.println("Please enter the height of the rectangle:");
        int height = scanner.nextInt();
        int area = baseSize * height;
        System.out.printf("The area of the rectangle is %s\n", area);
    }
}