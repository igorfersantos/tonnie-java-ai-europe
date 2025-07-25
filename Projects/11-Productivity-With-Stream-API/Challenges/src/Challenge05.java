import java.util.Arrays;
import java.util.List;

public class Challenge05 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Calcule a média dos números maiores que 5
        List<Integer> numbersGreaterThan5 = numbers.stream().filter(n -> n > 5).toList();
        double sumOfNumbersGreaterThan5 = numbersGreaterThan5.stream().reduce(0, Integer::sum);
        double medianOfNumbersGreaterThan5 = sumOfNumbersGreaterThan5 / numbersGreaterThan5.size();
        System.out.println("Median of numbers greater than 5: " + medianOfNumbersGreaterThan5);
    }
}
