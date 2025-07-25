import java.util.Arrays;
import java.util.List;

public class Challenge11 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Desafio 11 - Encontre a soma dos quadrados de todos os números da lista
        System.out.printf("numbers %s squared:\n%s\n", numbers,
                numbers.stream().mapToInt(n -> Double.valueOf(Math.pow(n, 2)).intValue()).boxed().toList());
    }
}
