import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Challenge13 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Filtrar os números que estão dentro de um intervalo
        // Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico
        // (por exemplo, entre 5 e 10) e exiba o resultado no console

        AtomicReference<Integer> previousNumber = new AtomicReference<>();
        List<Integer> numbersInIntervals = new ArrayList<>();
        numbers.stream().forEach(currentNumber -> {
            if (previousNumber.get() != null) {
               numbersInIntervals.add(Math.abs(currentNumber - previousNumber.get()));
            }
            previousNumber.set(currentNumber);
        });

        System.out.println("Numbers in the intervals: " + numbersInIntervals);
    }
}
