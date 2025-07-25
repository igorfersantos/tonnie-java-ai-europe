import java.util.Arrays;
import java.util.List;

public class Challenge01 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Desafio 1 - Mostre a lista na ordem numérica:
        numbers.stream().sorted().forEach(System.out::println);
    }
}