import java.util.Arrays;
import java.util.List;

public class Challenge12 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Desafio 12 - Encontre o produto de todos os números da lista
        System.out.println("The product of all numbers is: " + numbers.stream().reduce(1, (n1,n2) -> n1 * n2));
    }
}
