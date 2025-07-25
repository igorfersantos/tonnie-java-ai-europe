import java.util.Arrays;
import java.util.List;

public class Challenge07 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Encontrar o segundo número maior da lista
        System.out.println("The second largest number on list: " +
                numbers.stream().sorted().toList().get(numbers.size() - 2));
    }
}
