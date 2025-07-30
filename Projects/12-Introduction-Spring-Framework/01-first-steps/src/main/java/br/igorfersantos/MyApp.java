package br.igorfersantos;

import br.igorfersantos.domain.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.stream.Stream;

@Component
public class MyApp implements CommandLineRunner {

    @Autowired
    private Calculator calculator;

    @Override
    public void run(String... args) throws Exception {
        Integer sum = Stream.of(args)
                .map(Integer::valueOf)
                .reduce((n1, n2) -> calculator.sum(n1, n2))
                .orElseThrow();
        System.out.printf("The sum of %s is %s", Arrays.toString(args), sum);
    }
}
