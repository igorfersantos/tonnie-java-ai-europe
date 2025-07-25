import java.util.Arrays;
import java.util.List;

public class Challenge06 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Verificar se a lista contém algum número maior que 10
        System.out.println("Does the list contain a number greater than 10: " +
                numbers.stream().anyMatch(n -> n > 10)
                );
    }
}
