import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expectedDomain = "@company.com";
        String email = scanner.nextLine().trim();

        // TODO: Verifique se o e-mail contém o domínio esperado
        if (!email.contains(expectedDomain)) {
            System.out.println("E-mail invalido");
            return;
        }
        System.out.println("E-mail valido");
    }
}