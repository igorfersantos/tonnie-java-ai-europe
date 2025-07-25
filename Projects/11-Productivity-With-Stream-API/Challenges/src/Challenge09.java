import java.util.Arrays;
import java.util.List;

public class Challenge09 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Verificar se todos os números da lista são distintos (não se repetem)
        List<Integer> distinctNumbers = numbers.stream().distinct().toList();
        System.out.println("Are all numbers distinct: " + (numbers.size() == distinctNumbers.size()));
    }
}
