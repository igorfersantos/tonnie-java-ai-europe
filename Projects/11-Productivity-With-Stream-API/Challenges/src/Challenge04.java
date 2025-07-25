import java.util.Arrays;
import java.util.List;

public class Challenge04 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Desafio 4 - Remova todos os valores ímpares
        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).toList();
        System.out.println("Only even numbers: " + evenNumbers);
    }
}
