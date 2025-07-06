import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Verifica se a próxima entrada é um número do tipo double
        if (scanner.hasNextDouble()) {
            // Lê o valor em Celsius fornecido pelo usuário
            double celsius = scanner.nextDouble();

            // TODO: Verifique se a temperatura fornecida é maior ou igual ao zero absoluto (-273.15°C)
            // TODO: Converta a temperatura de Celsius para Fahrenheit e exiba o resultado formatado com uma casa decimal
            double convertedTemperature = celsius * 9/5 + 32;
            NumberFormat nf = new DecimalFormat();
            nf.setMaximumFractionDigits(1);
            nf.setMinimumFractionDigits(1);

            if (convertedTemperature < -273.15) {
                System.out.println("Entrada invalida");
                return;
            }
            System.out.println(nf.format(convertedTemperature));
        } else {
            // Caso a entrada não seja um número válido, exibe mensagem de erro
            System.out.println("Entrada invalida");
        }

        scanner.close();

    }
}