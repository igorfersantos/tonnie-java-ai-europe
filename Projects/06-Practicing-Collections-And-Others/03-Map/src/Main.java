import domain.User;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, User> users = new HashMap<>();
        users.put("John", new User(1, "John"));
        users.put("Jane", new User(2, "Jane"));
        users.put("Bob", new User(3, "Bob"));
        users.put("Alice", new User(4, "Alice"));
        System.out.println(users);
        System.out.println(users.containsKey("John"));
        System.out.println(users.containsValue(new User(2, "Jane")));
        System.out.println("======================================");

        users.forEach((key, user) -> System.out.printf("Key %s | Value %s\n", key, user));

        System.out.println("======================================");

        users.replace("John", new User(1, "Johnny"));
        users.forEach((key, user) -> System.out.printf("Key %s | Value %s\n", key, user));

        System.out.println("======================================");
        users.putIfAbsent("Alih", new User(5,"Alih"));
        System.out.println(users);
    }
}