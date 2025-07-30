package br.igorfersantos.springjpaclass;

import br.igorfersantos.springjpaclass.model.User;
import br.igorfersantos.springjpaclass.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Igor Fernandes");
        user.setUsername("igor");
        user.setPassword("Igor123");

        userRepository.save(user);

        for (User u : userRepository.findAll()) {
            System.out.println(u);
        }
    }
}
