import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Jhow", 10));
        users.add(new User("Joana", 20));
        users.add(new User("Aba", 52));
        users.forEach(System.out::println);
    }
}