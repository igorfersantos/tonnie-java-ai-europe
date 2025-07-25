import java.util.Arrays;
import java.util.List;

public class Challenge03 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Desafio 3 - Verifique se todos os números da lista são positivos:
        boolean allNumbersArePositive = numbers.stream().allMatch(n -> Integer.signum(n) >= 0);
        System.out.println("Are all numbers positive: " + allNumbersArePositive);
    }
}
