import java.util.Arrays;
import java.util.List;

public class Challenge02 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Desafio 2 - Imprima a soma dos números pares da lista:
        Integer sum = numbers.stream().filter(n -> n % 2 == 0).reduce(0, Integer::sum);
        System.out.println("The sum of the numbers is: " + sum);
    }
}
