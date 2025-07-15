import domain.User;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Set<User> users = new HashSet<>();
        users.add(new User(1,"João"));
        users.add(new User(2,"Maria"));
        users.add(new User(3,"Pedro"));
        users.add(new User(4,"Alana"));
        System.out.println(users.contains(new User(1, "João")));
        users.forEach(System.out::println);
        System.out.println("========================");
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(users.removeAll(List.of(new User(1, "João"), new User(2, "Mari"))));
        System.out.println(users);

        users.removeIf(Predicate.not(user -> user.getId() > 2));
        System.out.println(users);
        System.out.println("==================================");

        // Ordered Set
        Set<User> orderedUsers = new LinkedHashSet<>();
        orderedUsers.add(new User(1,"João"));
        orderedUsers.add(new User(3,"Maria"));
        orderedUsers.add(new User(2,"Pedro"));
        orderedUsers.add(new User(4,"Alana"));
        System.out.println(orderedUsers);

        // Tree set
        Set<User> treeUsers = new TreeSet<>();
        treeUsers.add(new User(4,"João"));
        treeUsers.add(new User(2,"Maria"));
        treeUsers.add(new User(1,"Pedro"));
        treeUsers.add(new User(3,"Alana"));
        System.out.println(treeUsers);

    }
}