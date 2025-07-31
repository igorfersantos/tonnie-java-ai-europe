package br.com.igorfernandes;

import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        // Strategy Pattern Test
        Behaviour aggresiveBehaviour = new AgressiveBehaviour();
        Behaviour defensiveBehaviour = new DefensiveBehaviour();
        Behaviour normalBehaviour = new NormalBehaviour();
        List<Behaviour> behaviours = List.of(aggresiveBehaviour, normalBehaviour, defensiveBehaviour);
        Robot robot = new Robot();

        for (Behaviour behaviour : behaviours) {
            robot.setBehaviour(behaviour);
            for (int i = 0; i < new Random().nextInt(0, 10); i++) {
                robot.move();
            }
        }
    }
}
