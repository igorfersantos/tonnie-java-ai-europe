import java.util.function.Function;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AnFunctionalInterface.print("Teste");

        Function<Long, Long> addThree = new AddThree();
        Long result = addThree.apply(3L);
        System.out.println("Result = " + result);

        Function<Long, Long> addThreeLambda = (value) -> value + 3;
        Long result2 = addThreeLambda.apply(3L);
        System.out.println("Result lambda = " + result2);


    }
}