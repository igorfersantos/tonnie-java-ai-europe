import domain.User;

import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(new User("João", 20), new User("Maria", 19));
        printUsers(Record::toString, users);
    }

    private static void printUsers(Function<User, String> callback, List<User> users) {
        users.forEach(user -> System.out.println(callback.apply(user)));
    }
}