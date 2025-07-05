import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        /*
        Escreva um código onde o usuário entra com sua altura e peso,
        seja feito o calculo do seu IMC(IMC = peso/(altura * altura))
        e seja exibida a mensagem de acordo com o resultado:
        
            Se for menor ou igual a 18,5 "Abaixo do peso";
            se for entre 18,6 e 24,9 "Peso ideal";
            Se for entre 25,0 e 29,9 "Levemente acima do peso";
            Se for entre 30,0 e 34,9 "Obesidade Grau I";
            Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
            Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
         */
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        
        System.out.println("BMI Calculator");
        System.out.println("------------------");
        
        // Entrada de dados
        System.out.print("Enter your height in meters (e.g: 1.75): ");
        float altura = scanner.nextFloat();
        
        System.out.print("Enter your weight in kilos (e.g: 68.5): ");
        float peso = scanner.nextFloat();
        
        // Cálculo do IMC
        float imc = peso / (altura * altura);
        
        // Exibição do resultado
        System.out.println("\nSeu IMC é: " + df.format(imc));
        
        // Classificação do IMC
        if (imc <= 18.5) {
            System.out.println("Classification: Underweight");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Classification: Ideal weight");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Classification: Slightly overweight");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Classification: Obesity Grade I");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Classification: Obesity Grade II (Severe)");
        } else {
            System.out.println("Classification: Obesity Grade III (Morbid)");
        }
    }
}
