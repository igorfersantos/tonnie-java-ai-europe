import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 2. Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
        //   - fórmula: área=lado X lado
        System.out.println("Please enter the size of one side of the rectangle (e.g: 20):");
        int sideSize = new Scanner(System.in).nextInt();
        int area = sideSize * sideSize;
        System.out.printf("The area of the rectangle is: %s\n", area);
    }
}