package igorfernandes.web.api.controller;

import igorfernandes.web.api.model.User;
import igorfernandes.web.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping()
    public List<User> getUsers() {
        return repository.user();
    }

    @GetMapping("/{username}")
    public User getOne(@PathVariable String username) {
        return repository.user(username);
    }
}
