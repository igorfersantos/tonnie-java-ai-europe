import java.util.Arrays;
import java.util.List;

public class Challenge14 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Encontre o maior número primo da lista
        Integer greatestPrime = numbers.stream()
                .map(n -> {
                    if (!(n > 1)) return 0;
                    int count = 1;
                    for (int i = 1; i < n; i++) {
                        if (count > 2) {
                            break;
                        }
                        if (n % i == 0)
                            count++;
                    }
                    if (count > 2)
                        return 0;
                    return n;
                })
                .peek(System.out::println)
                .max(Integer::compareTo).orElseThrow();
        System.out.println("Greatest prime: " + greatestPrime);
    }
}
