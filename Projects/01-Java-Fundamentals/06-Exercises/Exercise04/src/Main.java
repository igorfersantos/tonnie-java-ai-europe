import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        4. Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of the first person");
        String name1 = scanner.next();

        System.out.println("Please enter the age of first person");
        int age1 = scanner.nextInt();

        System.out.println("Please enter the name of the second person");
        String name2 = scanner.next();

        System.out.println("Please enter the age of second person");
        int age2 = scanner.nextInt();

        // Note: I don't know if I could use the Math library here as it could be counted as a little bit of cheating
        // towards a simple exercise, but I think it's ok.
        System.out.printf("The age difference between %s and %s is %s years\n", name1, name2, Math.abs(age1 - age2));

    }
}