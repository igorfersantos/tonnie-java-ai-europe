import java.util.Arrays;
import java.util.List;

public class Challenge15 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //  Verifique se a lista contém pelo menos um número negativo
        System.out.println("Does the list contain at least one negative number: " + numbers.stream().anyMatch(n -> Integer.signum(n) == -1));
    }
}
