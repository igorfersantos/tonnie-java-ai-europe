import java.util.Arrays;
import java.util.List;

public class Challenge08 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Somar os dígitos de todos os números da lista
        System.out.println("Sum of all numbers in the list: " +
                numbers.stream().reduce(0, Integer::sum)
        );
    }
}
