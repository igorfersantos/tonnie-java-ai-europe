import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Integer> numbers = new ArrayList<>();

    private static synchronized void add(int number) {
        numbers.add(number);
    }

    private static synchronized void show() {
        System.out.println(numbers);
    }
    public static void main(String[] args) {
        Runnable add = () -> {
            for (int i = 0; i < 200_000; i++) {
                add(i);
            }
        };

        Runnable sub = () -> {
            for (int x = 200_000; x > 0; x--) {
                add(x);
            }
        };

        Runnable show = () -> {
            for (int i = 0; i < 250_000; i++) {
                show();
            }
        };

        new Thread(add).run();
        new Thread(sub).run();
        new Thread(show).run();
    }
}