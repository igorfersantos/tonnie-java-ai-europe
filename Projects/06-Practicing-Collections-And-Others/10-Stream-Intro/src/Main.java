import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        var value1 = Stream.generate(() -> new Random().nextInt()).limit(5).toArray(Integer[]::new);

        for (Integer i : value1) {
            System.out.println(i);
        }

        var value2 = IntStream.generate(() -> new Random().nextInt()).limit(5).toArray();

        for (int i : value2) {
            System.out.println(i);
        }

        var debugValues = new ArrayList<>();
        var nameList = Stream.of("John", "Mike", "Sarah", "Emily", "Ben")
                .peek(debugValues::add)
                .filter(s -> s.endsWith("n"))
                .toList();

        System.out.println(nameList);
        System.out.println(debugValues);
    }
}