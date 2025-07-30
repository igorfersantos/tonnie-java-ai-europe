package igorfernandes.web.api.repository;

import igorfernandes.web.api.handler.BusinessException;
import igorfernandes.web.api.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class UserRepository {

    List<User> users = new ArrayList<>(Arrays.asList(
            new User("gleyson", "password123"),
            new User("frank", "masterpass")
    ));

    public void save(User user) {
        if (user.login() == null) {
            throw new BusinessException("The login field is mandatory");
        }
        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        System.out.println(user);
    }

    public void update(User user) {
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(user);
    }

    public void remove(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }

    public List<User> user() {
        return users;
    }

    public User user(Integer id) {
        System.out.println(String.format("GET/id - Recebendo o id: %d para localizar um usuário", id));
        return new User("gleyson", "password");
    }

    public User user(String username) {
        if (username == null || username.isBlank()) {
            throw new BusinessException("The username field is mandatory!");
        }
        return users.stream().filter(user -> user.login().equals(username)).findFirst().orElseThrow(() ->
                new BusinessException("Invalid username!"));
    }

}
