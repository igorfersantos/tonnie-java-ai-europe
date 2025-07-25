import java.util.Arrays;
import java.util.List;

public class Challenge10 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //  Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5
        List<Integer> oddNumbersMultipleOf3or5 = numbers.stream()
                .filter(n -> n % 2 != 0)
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .toList();
        System.out.println("Odd numbers multiple of 3 or 5: " + oddNumbersMultipleOf3or5);

    }
}
